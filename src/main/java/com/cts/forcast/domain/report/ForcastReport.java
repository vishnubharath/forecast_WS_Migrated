package com.cts.forcast.domain.report;

import java.util.List;

public class ForcastReport {

	private Long reportId;
	private Long projectId;
	private Long customerId;
	private String customerName;
	private String projectName;
	private String portfolio;
	private String POC;
	private String projectBillability;
	private Long associateId;
	private String associateName;
	private String locationType;
	private String associateCity;
	private String billableType;
	private String associateGrade;
	private String allocStartDate;
	private String allocEnddate;
	private String allocationPercentage;
	private String actualMonth;
	private String actualYear;

	public String getAssociateGrade() {
		return associateGrade;
	}

	public void setAssociateGrade(String associateGrade) {
		this.associateGrade = associateGrade;
	}

	private List<ReportAdjusment> reportAdjustmentEntity;

	public Long getReportId() {
		return reportId;
	}

	public void setReportId(Long reportId) {
		this.reportId = reportId;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(String portfolio) {
		this.portfolio = portfolio;
	}

	public String getPOC() {
		return POC;
	}

	public void setPOC(String pOC) {
		POC = pOC;
	}

	public String getProjectBillability() {
		return projectBillability;
	}

	public void setProjectBillability(String projectBillability) {
		this.projectBillability = projectBillability;
	}

	public Long getAssociateId() {
		return associateId;
	}

	public void setAssociateId(Long associateId) {
		this.associateId = associateId;
	}

	public String getAssociateName() {
		return associateName;
	}

	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}

	public String getLocationType() {
		return locationType;
	}

	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}

	public String getAssociateCity() {
		return associateCity;
	}

	public void setAssociateCity(String associateCity) {
		this.associateCity = associateCity;
	}

	public String getBillableType() {
		return billableType;
	}

	public void setBillableType(String billableType) {
		this.billableType = billableType;
	}

	public String getAllocStartDate() {
		return allocStartDate;
	}

	public void setAllocStartDate(String allocStartDate) {
		this.allocStartDate = allocStartDate;
	}

	public String getAllocEnddate() {
		return allocEnddate;
	}

	public void setAllocEnddate(String allocEnddate) {
		this.allocEnddate = allocEnddate;
	}

	public String getAllocationPercentage() {
		return allocationPercentage;
	}

	public void setAllocationPercentage(String allocationPercentage) {
		this.allocationPercentage = allocationPercentage;
	}

	public String getActualMonth() {
		return actualMonth;
	}

	public void setActualMonth(String actualMonth) {
		this.actualMonth = actualMonth;
	}

	public String getActualYear() {
		return actualYear;
	}

	public void setActualYear(String actualYear) {
		this.actualYear = actualYear;
	}

	public List<ReportAdjusment> getReportAdjustmentEntity() {
		return reportAdjustmentEntity;
	}

	public void setReportAdjustmentEntity(List<ReportAdjusment> reportAdjustmentEntity) {
		this.reportAdjustmentEntity = reportAdjustmentEntity;
	}

}
