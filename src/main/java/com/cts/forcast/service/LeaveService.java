package com.cts.forcast.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.cts.forcast.domain.leave.LeaveResponse;
import com.cts.forcast.domain.leave.LeaveVO;
import com.cts.forcast.domain.leave.Response;

public interface LeaveService {

	// public Collection<LeaveResponse> getLeaves();

	public LeaveResponse getLeaveByEmployeeId(Integer empId);

	public List<LeaveVO> getAllEmpLeaves();

	public Collection<String> getMonths();

	public Response insertForecastLeave(HashMap<String, List<LeaveVO>> forecastLeaves);

	public String insertActualLeave(ArrayList<LeaveVO> actualLeaves);
}
