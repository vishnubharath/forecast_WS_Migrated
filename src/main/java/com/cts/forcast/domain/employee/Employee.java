package com.cts.forcast.domain.employee;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Employee {
	
	private int employeeId;
	private String associateName;
	private BigInteger esaProjectId;
	private String esaProjectName;
	private BigInteger rbcId;
	private String rbcReportingManager;
	private String msaRole;
	private String location;
	private BigDecimal rate;
	private String lob;
	private String project;
	private float hours;
	private float vacationNonBillableDays;
	private float vacationNonBillableHours;
	private float billableHours;
	private BigDecimal billing;
	private int sNo;	
	private String month;
	private Integer year;
	
	
	// total hours in the month for which calculation is done
	// cad amount to be billed for an employee
	
	
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	public BigInteger getEsaProjectId() {
		return esaProjectId;
	}
	public void setEsaProjectId(BigInteger esaProjectId) {
		this.esaProjectId = esaProjectId;
	}
	public String getEsaProjectName() {
		return esaProjectName;
	}
	public void setEsaProjectName(String esaProjectName) {
		this.esaProjectName = esaProjectName;
	}
	public String getLob() {
		return lob;
	}
	public void setLob(String lob) {
		this.lob = lob;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public BigInteger getRbcId() {
		return rbcId;
	}
	public void setRbcId(BigInteger rbcId) {
		this.rbcId = rbcId;
	}
	public String getAssociateName() {
		return associateName;
	}
	public void setAssociateName(String associateName) {
		this.associateName = associateName;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public BigDecimal getRate() {
		return rate;
	}
	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}
	public float getHours() {
		return hours;
	}
	public void setHours(float hours) {
		this.hours = hours;
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
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}


}

