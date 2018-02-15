package com.cts.forcast.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.forcast.domain.leave.LeaveResponse;
import com.cts.forcast.domain.leave.LeaveVO;
import com.cts.forcast.domain.leave.Response;
import com.cts.forcast.service.LeaveService;

@Controller
@RestController("/leaves")
public class LeaveController {

	@Autowired
	private LeaveService leaveService;

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value = "/leavesByEmpId/{empId}", method = RequestMethod.GET, headers = "Accept=application/json")
	public LeaveResponse getLeaveByEmployeeId(@PathVariable Integer empId) {
		return leaveService.getLeaveByEmployeeId(empId);
	}

	@RequestMapping(value = "/leaves", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<LeaveVO> getAllLeaves() {
		return leaveService.getAllEmpLeaves();
	}

	@RequestMapping(value = "/forecastMonths", method = RequestMethod.GET, headers = "Accept=application/json")
	public Collection<String> getForecastMonths() {
		System.out.println("Entering get Months");
		return leaveService.getMonths();
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value = "/forecastLeaves", method = RequestMethod.PUT, headers = "Accept=application/json")
	public Response saveForecastLeave(@RequestBody HashMap<String, List<LeaveVO>> forecastLeaves) {
		return leaveService.insertForecastLeave(forecastLeaves);
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value = "/actualLeaves", method = RequestMethod.PUT, headers = "Accept=application/json")
	public String saveActualLeave(ArrayList<LeaveVO> actualLeaves) {
		return leaveService.insertActualLeave(actualLeaves);
	}

	/*
	 * @RequestMapping(value = "/leaves", method = RequestMethod.GET, headers =
	 * "Accept=application/json") public Collection<Leave> getLeave() {
	 * System.out.println("Entering get Leave"); return
	 * leaveService.getLeaves(); }
	 */
	/*
	 * @RequestMapping(value = "/insertleaves", method = RequestMethod.GET,
	 * headers = "Accept=application/json") public void insertLeave() throws
	 * IOException { System.out.println("Entering insert Leave");
	 * leaveService.insertLeave(); }
	 * 
	 * @RequestMapping(value = "/leave/{date}", method = RequestMethod.GET,
	 * headers = "Accept=application/json") public Collection<Leave>
	 * getLeaveByDate(@PathVariable String date) { return
	 * leaveService.getLeaves();// yet to be implemented }
	 * 
	 * @RequestMapping(value = "/leave/{month}", method = RequestMethod.GET,
	 * headers = "Accept=application/json") public Collection<Leave>
	 * getLeaveByMonth(@PathVariable String month) { return
	 * leaveService.getLeaves();// yet to be implemented }
	 * 
	 * @RequestMapping(value = "/leaveMonths", method = RequestMethod.GET,
	 * headers = "Accept=application/json") public Collection<String>
	 * getMonths() { System.out.println("Entering get Months"); return
	 * leaveService.getMonths(); }
	 */

}
