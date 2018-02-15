package com.cts.forcast.domain.pipeline;

import java.util.List;

public class StaffingPipelineRequest {
	
	private Integer month;
	private List<StaffingPipelineVO> staffingList;
	

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public List<StaffingPipelineVO> getStaffingList() {
		return staffingList;
	}

	public void setStaffingList(List<StaffingPipelineVO> staffingList) {
		this.staffingList = staffingList;
	}
	
	

}
