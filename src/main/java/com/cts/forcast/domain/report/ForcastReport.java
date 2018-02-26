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
	private String hrGrade;
	private String location;
	private String city;
	private String billability;

	private List<ReportAdjusment> reportAdjusments;

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
	public String getHrGrade() {
		return hrGrade;
	}
	public void setHrGrade(String hrGrade) {
		this.hrGrade = hrGrade;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getBillability() {
		return billability;
	}
	public void setBillability(String billability) {
		this.billability = billability;
	}

	public List<ReportAdjusment> getReportAdjusments() {
		return reportAdjusments;
	}
	public void setReportAdjusments(List<ReportAdjusment> reportAdjusments) {
		this.reportAdjusments = reportAdjusments;
	}




}
