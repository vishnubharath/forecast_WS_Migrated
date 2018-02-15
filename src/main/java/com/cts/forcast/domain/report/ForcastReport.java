package com.cts.forcast.domain.report;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;

public class ForcastReport {

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

	// calculated using leave module
	private float vacationNonBillableDays;
	private float vacationNonBillableHours;

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

	private Float rate;
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

}
