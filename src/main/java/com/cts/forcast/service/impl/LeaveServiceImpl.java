package com.cts.forcast.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.cts.forcast.dao.leave.LeaveDao;
import com.cts.forcast.domain.leave.LeaveResponse;
import com.cts.forcast.domain.leave.LeaveVO;
import com.cts.forcast.domain.leave.Response;
import com.cts.forcast.service.LeaveService;

@Service("leaveService")
public class LeaveServiceImpl implements LeaveService {

	@Autowired
	private LeaveDao leaveDao;

	@Value("${leave.forecast.months}")
	private String noOfMonths;

	public LeaveResponse getLeaveByEmployeeId(Integer empId) {
		LeaveResponse leaveDetail = null;
		Calendar cal = Calendar.getInstance();
		String currentMonth = new SimpleDateFormat("MMM").format(cal.getTime());
		String year = new SimpleDateFormat("YYYY").format(cal.getTime());
		List<LeaveVO> actualleaves = new ArrayList<LeaveVO>();
		Map<String, List<LeaveVO>> forecastLeaves = populateForecastMonths();

		List<LeaveVO> leaves = new ArrayList<>(); // VBJ .getLeaveByEmployeeId(empId, currentMonth, year);
		for (LeaveVO leave : leaves) {
			if (leave.getType() != null && leave.getType().equalsIgnoreCase("actual")) {
				actualleaves.add(leave);
			} else if (leave.getType() != null && leave.getType().equalsIgnoreCase("forecast")) {
				List<LeaveVO> forecasts = new ArrayList<LeaveVO>();
				String month = leave.getMonth();
				if (month != null && forecastLeaves.containsKey(month)) {
					forecasts.addAll(forecastLeaves.get(month));
					forecasts.add(leave);
					forecastLeaves.put(month, forecasts);
				} else if (month != null && !forecastLeaves.containsKey(month)) {
					forecasts.add(leave);
					forecastLeaves.put(month, forecasts);
				}
			}
		}
		leaveDetail = new LeaveResponse(empId, forecastLeaves, actualleaves);
		return leaveDetail;
	}

	/*
	 * public Collection<LeaveVO> getLeaves() { return leaveDao.getAll(); }
	 */
	private Map<String, List<LeaveVO>> populateForecastMonths() {
		Map<String, List<LeaveVO>> forecast = new LinkedHashMap<String, List<LeaveVO>>();
		Calendar cal = Calendar.getInstance();
		for (int i = 1; i <= Integer.parseInt(noOfMonths); i++) {
			cal.add(Calendar.MONTH, 1);
			forecast.put(new SimpleDateFormat("MMM").format(cal.getTime()), new ArrayList<LeaveVO>());
		}
		return forecast;
	}

	public Collection<String> getMonths() {
		List<String> listMonths = new ArrayList<String>();
		Calendar cal = Calendar.getInstance();
		for (int i = 1; i <= Integer.parseInt(noOfMonths); i++) {
			cal.add(Calendar.MONTH, 1);
			listMonths.add(new SimpleDateFormat("MMM").format(cal.getTime()));
		}
		return listMonths;
	}

	public Response insertForecastLeave(HashMap<String, List<LeaveVO>> forecastLeaves) {
		StringBuffer response = new StringBuffer();
		response.append("SUCCESSFULLY SAVED");
		Response responseObj = new Response();
		Calendar cal = Calendar.getInstance();
		StringBuffer error = new StringBuffer();
		StringBuffer empId = new StringBuffer();
		String updatedOn = new SimpleDateFormat("MMM").format(cal.getTime());
		String year = new SimpleDateFormat("YYYY").format(cal.getTime());
		List<LeaveVO> forecasts = new ArrayList<LeaveVO>();
		for (Map.Entry<String, List<LeaveVO>> leaves : forecastLeaves.entrySet()) {
			if (leaves != null && leaves.getValue().size() > 0) {
				for (LeaveVO forecast : leaves.getValue()) {
					if (forecast != null && forecast.getEmpId() > 0) {
						if (empId.indexOf(forecast.getEmpId() + ",") < 0) {
							empId.append(forecast.getEmpId() + ",");
						}
						forecasts.add(forecast);
					} else {
						if (error.length() == 0) {
							error.append(" Not able to save following Records : \n");
						}
						error.append(forecast.toString() + "\n");
					}
				}
			}
		}
		try {
			if (empId.length() > 0 && empId.lastIndexOf(",") > 0) {
				empId.replace(empId.lastIndexOf(","), empId.lastIndexOf(",") + 1, "");
			}
			// VBJ leaveDao.deleteForecastLeave(empId.toString(), updatedOn, year);
			// VBJ leaveDao.insertForecastLeave(forecasts, updatedOn, year);
		} catch (Exception e) {
			response.append("message : ERROR  while saving actual Leaves the data");
			e.printStackTrace();
		}
		if (error.length() > 0) {
			response.append(error);
		}
		
		responseObj.setMessage(response.toString());
		return responseObj;
	}

	public String insertActualLeave(ArrayList<LeaveVO> actualLeaves) {
		StringBuffer response = new StringBuffer();
		response.append("message : SUCCESSFULLY SAVED");
		Calendar cal = Calendar.getInstance();
		StringBuffer error = new StringBuffer();
		StringBuffer empId = new StringBuffer();
		String updatedOn = new SimpleDateFormat("MMM").format(cal.getTime());
		String year = new SimpleDateFormat("YYYY").format(cal.getTime());
		List<LeaveVO> actuals = new ArrayList<LeaveVO>();
		for (LeaveVO actual : actualLeaves) {
			if (actual != null && actual.getEmpId() > 0) {
				empId.append(actual.getEmpId() + ",");
				actuals.add(actual);
			} else {
				if (error.length() == 0) {
					error.append(" Not able to save following Records : \n");
				}
				error.append(actual.toString() + "\n");
			}
		}
		try {
			if (empId.length() > 0 && empId.lastIndexOf(",") > 0) {
				empId.replace(empId.lastIndexOf(","), empId.lastIndexOf(",") + 1, "");
			}
			// VBJ leaveDao.deleteActualLeave(empId.toString(), updatedOn, year);
			// VBJ leaveDao.insertActualLeave(actuals, updatedOn, year);
		} catch (Exception e) {
			response.append("message : ERROR  while saving actual Leaves the data");
			e.printStackTrace();
		}
		if (error.length() > 0) {
			response.append(error);
		}
		return response.toString();
	}

	public List<LeaveVO> getAllEmpLeaves() {
		// TODO Auto-generated method stub
		Map<Integer, List<LeaveVO>> Leavemap = new HashMap<Integer, List<LeaveVO>>();
		List<LeaveVO> lresponselist = new ArrayList<>(); //VBJ .getAllEmpLeaves();

		Set<Integer> EmpIDSet = new java.util.HashSet<Integer>();
		List<LeaveVO> actualleaves = new ArrayList<LeaveVO>();
		for (LeaveVO lresponse : lresponselist) {
			EmpIDSet.add(lresponse.getEmpId());
		}
		System.out.println(EmpIDSet);
		for (Integer EmpID : EmpIDSet) {

			for (LeaveVO lresponse : lresponselist) {

				if (lresponse != null && EmpID.equals(lresponse.getEmpId())) {

					actualleaves.add(lresponse);

					/*
					 * if(lresponse != null &&
					 * lresponse.getType().equalsIgnoreCase("actual")){
					 * actualleaves.add(lresponse); }
					 * 
					 * else if(lresponse != null &&
					 * lresponse.getType().equalsIgnoreCase("forecast")){
					 * actualList= }
					 */

				}

			}
			Leavemap.put(EmpID, actualleaves);

		}

		return actualleaves;
	}
}
