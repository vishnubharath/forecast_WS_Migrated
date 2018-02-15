package com.cts.forcast.domain.pipeline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetStaffingRevenueResponse {

	public GetStaffingRevenueResponse() {
		// TODO Auto-generated constructor stub
	}
	private Double totalStaffingRevenue;
	
	@Autowired
	private PipelineErrorMessage errorMessage;
	
	public Double getTotalStaffingRevenue() {
		return totalStaffingRevenue;
	}
	public void setTotalStaffingRevenue(Double totalStaffingRevenue) {
		this.totalStaffingRevenue = totalStaffingRevenue;
	}
	public PipelineErrorMessage getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(PipelineErrorMessage errorMessage) {
		this.errorMessage = errorMessage;
	}
	
}
