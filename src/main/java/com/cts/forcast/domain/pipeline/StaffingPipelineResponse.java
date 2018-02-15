package com.cts.forcast.domain.pipeline;

public class StaffingPipelineResponse {
	
	PipelineErrorMessage errorMessage;
	private String staffingList;
		
	public String getStaffingList() {
		return staffingList;
	}

	public void setStaffingList(String staffingList) {
		this.staffingList = staffingList;
	}

	public PipelineErrorMessage getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(PipelineErrorMessage errorMessage) {
		this.errorMessage = errorMessage;
	}

	
	

}
