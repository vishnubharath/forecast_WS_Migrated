package com.cts.forcast.domain.pipeline;

public class PipelineOppVO {
	
	private String lOB;
	private String opportunityName;
	private String contact;
	private String salesStage;
	private String estCloseDate;
	private Double currentYearRevenue;
	private Double nextYearRevenue;
	private Double tcv;
	private Double probability;
	private String practiceInvolved;
	
	public String getlOB() {
		return lOB;
	}
	public void setlOB(String lOB) {
		this.lOB = lOB;
	}
	public String getOpportunityName() {
		return opportunityName;
	}
	public void setOpportunityName(String opportunityName) {
		this.opportunityName = opportunityName;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getSalesStage() {
		return salesStage;
	}
	public void setSalesStage(String salesStage) {
		this.salesStage = salesStage;
	}
	public String getEstCloseDate() {
		return estCloseDate;
	}
	public void setEstCloseDate(String estCloseDate) {
		this.estCloseDate = estCloseDate;
	}
	public Double getCurrentYearRevenue() {
		return currentYearRevenue;
	}
	public void setCurrentYearRevenue(Double currentYearRevenue) {
		this.currentYearRevenue = currentYearRevenue;
	}
	public Double getNextYearRevenue() {
		return nextYearRevenue;
	}
	public void setNextYearRevenue(Double nextYearRevenue) {
		this.nextYearRevenue = nextYearRevenue;
	}
	public Double getTcv() {
		return tcv;
	}
	public void setTcv(Double tcv) {
		this.tcv = tcv;
	}
	public Double getProbability() {
		return probability;
	}
	public void setProbability(Double probability) {
		this.probability = probability;
	}
	public String getPracticeInvolved() {
		return practiceInvolved;
	}
	public void setPracticeInvolved(String practiceInvolved) {
		this.practiceInvolved = practiceInvolved;
	}


}
