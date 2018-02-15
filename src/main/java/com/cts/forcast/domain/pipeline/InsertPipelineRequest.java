package com.cts.forcast.domain.pipeline;

import java.util.List;

public class InsertPipelineRequest {
	
	private Integer month;	
	private List<StaffingForUIVO> staffingList;
	
	public Integer getMonth() {
		return month;
	}
	public void setMonth(Integer month) {
		this.month = month;
	}
	public List<StaffingForUIVO> getStaffingList() {
		return staffingList;
	}
	public void setStaffingList(List<StaffingForUIVO> staffingList) {
		this.staffingList = staffingList;
	}
	@Override
	public String toString() {
		return "InsertPipelineRequest [month=" + month + ", staffingList=" + staffingList + "]";
	}
	
	
}
