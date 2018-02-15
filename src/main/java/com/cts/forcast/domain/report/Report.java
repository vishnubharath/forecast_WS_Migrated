package com.cts.forcast.domain.report;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;

public class Report implements Serializable {

	private Long employeeId;
	private Long projectId;
	private Long locationId;

	private String esaProjectName;
	private String associateName;
	private String location;
	private String lob;

	private String type;
	private String leave_days;
	private BigDecimal totalRate;
	private String month;
	private int year;
	private float totalHours;
	private String errorMessage;
	private Float rate;
	
	// calculated using leave module
		private float vacationNonBillableDays;
		private float vacationNonBillableHours;
	
	
	private BigInteger rbcId;
	private String rbcReportingManager;
	private String msaRole;
	private String project;
	private float hours;
	private float billableHours;
	private BigDecimal billing;
	private int sNo;
	

	public BigInteger getRbcId() {
		return rbcId;
	}

	public void setRbcId(BigInteger rbcId) {
		this.rbcId = rbcId;
	}

	public String getRbcReportingManager() {
		return rbcReportingManager;
	}

	public void setRbcReportingManager(String rbcReportingManager) {
		this.rbcReportingManager = rbcReportingManager;
	}

	public String getMsaRole() {
		return msaRole;
	}

	public void setMsaRole(String msaRole) {
		this.msaRole = msaRole;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public float getHours() {
		return hours;
	}

	public void setHours(float hours) {
		this.hours = hours;
	}

	public float getBillableHours() {
		return billableHours;
	}

	public void setBillableHours(float billableHours) {
		this.billableHours = billableHours;
	}

	public BigDecimal getBilling() {
		return billing;
	}

	public void setBilling(BigDecimal billing) {
		this.billing = billing;
	}

	public int getsNo() {
		return sNo;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
	}

		
	

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public BigDecimal getTotalRate() {
		return totalRate;
	}

	public void setTotalRate(BigDecimal totalRate) {
		this.totalRate = totalRate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLeave_days() {
		return leave_days;
	}

	public void setLeave_days(String leave_days) {
		this.leave_days = leave_days;
	}

	// available in hub
	@JsonSerialize(using = DateSerializer.class)
	private Date allocation_start_date;
	@JsonSerialize(using = DateSerializer.class)
	private Date allocation_end_date;

	public Date getAllocation_start_date() {
		return allocation_start_date;
	}

	public void setAllocation_start_date(Date allocation_start_date) {
		this.allocation_start_date = allocation_start_date;
	}

	public Date getAllocation_end_date() {
		return allocation_end_date;
	}

	public void setAllocation_end_date(Date allocation_end_date) {
		this.allocation_end_date = allocation_end_date;
	}

	

	public float getVacationNonBillableDays() {
		return vacationNonBillableDays;
	}

	public void setVacationNonBillableDays(float vacationNonBillableDays) {
		this.vacationNonBillableDays = vacationNonBillableDays;
	}

	public float getVacationNonBillableHours() {
		return vacationNonBillableHours;
	}

	public void setVacationNonBillableHours(float vacationNonBillableHours) {
		this.vacationNonBillableHours = vacationNonBillableHours;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	
	private String location_type;

	public Float getRate() {
		return rate;
	}

	public void setRate(Float rate) {
		this.rate = rate;
	}

	public String getLocation_type() {
		return location_type;
	}

	public void setLocation_type(String location_type) {
		this.location_type = location_type;
	}

	public String getEsaProjectName() {
		return esaProjectName;
	}

	public void setEsaProjectName(String esaProjectName) {
		this.esaProjectName = esaProjectName;
	}

	public String getAssociateName() {
		return associateName;
	}

	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLob() {
		return lob;
	}

	public void setLob(String lob) {
		this.lob = lob;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public float getTotalHours() {
		return totalHours;
	}

	public void setTotalHours(float totalHours) {
		this.totalHours = totalHours;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Report [employeeId=").append(employeeId).append(", projectId=").append(projectId)
				.append(", locationId=").append(locationId).append(", esaProjectName=").append(esaProjectName)
				.append(", associateName=").append(associateName).append(", location=").append(location)
				.append(", lob=").append(lob).append(", type=").append(type).append(", leave_days=").append(leave_days)
				.append(", totalRate=").append(totalRate).append(", month=").append(month).append(", year=")
				.append(year).append(", totalHours=").append(totalHours).append(", errorMessage=").append(errorMessage)
				.append(", allocation_start_date=").append(allocation_start_date).append(", allocation_end_date=")
				.append(allocation_end_date).append(", vacationNonBillableDays=").append(vacationNonBillableDays)
				.append(", vacationNonBillableHours=").append(vacationNonBillableHours).append(", rate=").append(rate)
				.append(", location_type=").append(location_type).append("]");
		return builder.toString();
	}
	
	

}
