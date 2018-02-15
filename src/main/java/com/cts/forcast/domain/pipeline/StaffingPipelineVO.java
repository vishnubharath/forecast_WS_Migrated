package com.cts.forcast.domain.pipeline;

import java.util.Map;

public class StaffingPipelineVO {
	
	private Integer sNo;
	private String name;
	private String division;
	private Integer noOfResources;
	private Map<String, Double> costData;
	private Double amount;
	private Boolean isMaterialized;
	
	public Integer getsNo() {
		return sNo;
	}
	public void setsNo(Integer sNo) {
		this.sNo = sNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public Integer getNoOfResources() {
		return noOfResources;
	}
	public void setNoOfResources(Integer noOfResources) {
		this.noOfResources = noOfResources;
	}
	public Map<String, Double> getCostData() {
		return costData;
	}
	public void setCostData(Map<String, Double> costData) {
		this.costData = costData;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Boolean getIsMaterialized() {
		return isMaterialized;
	}
	public void setIsMaterialized(Boolean isMaterialized) {
		this.isMaterialized = isMaterialized;
	}	
}
