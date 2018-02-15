package com.cts.forcast.domain.project;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Project {
	
	private int sNo;
	private BigInteger esaProjectId;
	private String esaProjectName;
	private String lob;
	private String project;
	private int employeeId;
	private BigInteger rbcId;
	private String associateName;
	private String rbcReportingManager;
	private String msaRole;
	private String location;
	private BigDecimal rate;
	// total hours in the month for which calculation is done
	private float hours;
	private float vacationNonBillableDays;
	private float vacationNonBillableHours;
	private float billableHours;
	// cad amount to be billed for an employee
	private BigDecimal billing;
	
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
	


}
