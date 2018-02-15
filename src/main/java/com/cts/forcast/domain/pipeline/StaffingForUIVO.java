package com.cts.forcast.domain.pipeline;

public class StaffingForUIVO {

	private Integer sNo;
	private String name;
	private String division;
	private Integer noOfResources;
	private Double amount;
	private String[] headers;
	private Double[] values;
	
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
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String[] getHeaders() {
		return headers;
	}
	public void setHeaders(String[] headers) {
		this.headers = headers;
	}
	public Double[] getValues() {
		return values;
	}
	public void setValues(Double[] values) {
		this.values = values;
	}
}
