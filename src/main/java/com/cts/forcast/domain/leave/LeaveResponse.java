package com.cts.forcast.domain.leave;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeaveResponse {

	private Integer empId;
	private Map<String, List<LeaveVO>> forecastLeaves;
	List <LeaveVO> actualleaves = new ArrayList<LeaveVO>();
	
	//public Leave(){};
	

	public LeaveResponse(Integer empId, Map<String, List<LeaveVO>> forecastLeaves, List <LeaveVO>actualleaves) 
	{
		this.empId = empId;
		this.forecastLeaves = forecastLeaves;
		this.actualleaves = actualleaves;			
		
	}

	public List<LeaveVO> getActualleaves() {
		return actualleaves;
	}

	public void setActualleaves(List<LeaveVO> actualleaves) {
		this.actualleaves = actualleaves;
	}
	
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Map<String, List<LeaveVO>> getForecastLeaves() {
		return forecastLeaves;
	}

	public void setForecastLeaves(Map<String, List<LeaveVO>> forecastLeaves) {
		this.forecastLeaves = forecastLeaves;
	}
	
	

}
