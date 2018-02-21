package com.cts.forcast.dao.employee;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Forecast_Reports")
public class ReportEntity {
	@Id
	@Column(name="Report_Id")
	private Long reportId;
	@Column(name="Associate_Id")
	private Long associateId;
	@Column(name="Associate_Name")
	private String associateName;
	@Column(name="Associate_City")
	private String associateCity;
	@Column(name="Location_Type")
	private String locationType;
	@Column(name="Customer_Id")
	private Long customerId;
	@Column(name="Customer_Name")
	private String customerName;
	@Column(name="Project_Id")
	private Long projectId;
	@Column(name="Project_Name")
	private String projectName;
	@Column(name="Billable_Type")
	private String billableType;
	@Column(name="Associate_Grade")
	private String associateGrade;
	@Column(name="Alloc_Start_Date")
	private Date allocStartDate;
	@Column(name="Project_Billability")
	private String Project_Billability;
	@Column(name="Forecast_Period_From")
	private Date forecastPeriodFrom;
	@Column(name="Forecast_Period_To")
	private Date forecastPeriodTo;
	@Column(name="Forecasted_On")
	private Date forecastedOn;
	@Column(name="Last_Updated_User")
	private String lastUpdatedUser;
	@Column(name="Last_Updated_Time")
	private Date lastUpdatedTime;
	@Column(name="Portfolio")
	private String portfolio;
	@Column(name="POC")
	private String poc;
	@Column(name="Adjustment")
	private Long adjustment;
	@Column(name="Hours")
	private Long hours;
	@Column(name="Rate")
	private Long rate;
	@Column(name="Revenue")
	private String revenue;
	public Long getReportId() {
		return reportId;
	}
	public void setReportId(Long reportId) {
		this.reportId = reportId;
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
	public String getAssociateCity() {
		return associateCity;
	}
	public void setAssociateCity(String associateCity) {
		this.associateCity = associateCity;
	}
	public String getLocationType() {
		return locationType;
	}
	public void setLocationType(String locationType) {
		this.locationType = locationType;
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
	public Long getProjectId() {
		return projectId;
	}
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getBillableType() {
		return billableType;
	}
	public void setBillableType(String billableType) {
		this.billableType = billableType;
	}
	public String getAssociateGrade() {
		return associateGrade;
	}
	public void setAssociateGrade(String associateGrade) {
		this.associateGrade = associateGrade;
	}
	public Date getAllocStartDate() {
		return allocStartDate;
	}
	public void setAllocStartDate(Date allocStartDate) {
		this.allocStartDate = allocStartDate;
	}
	public String getProject_Billability() {
		return Project_Billability;
	}
	public void setProject_Billability(String project_Billability) {
		Project_Billability = project_Billability;
	}
	public Date getForecastPeriodFrom() {
		return forecastPeriodFrom;
	}
	public void setForecastPeriodFrom(Date forecastPeriodFrom) {
		this.forecastPeriodFrom = forecastPeriodFrom;
	}
	public Date getForecastPeriodTo() {
		return forecastPeriodTo;
	}
	public void setForecastPeriodTo(Date forecastPeriodTo) {
		this.forecastPeriodTo = forecastPeriodTo;
	}
	public Date getForecastedOn() {
		return forecastedOn;
	}
	public void setForecastedOn(Date forecastedOn) {
		this.forecastedOn = forecastedOn;
	}
	public String getLastUpdatedUser() {
		return lastUpdatedUser;
	}
	public void setLastUpdatedUser(String lastUpdatedUser) {
		this.lastUpdatedUser = lastUpdatedUser;
	}
	public Date getLastUpdatedTime() {
		return lastUpdatedTime;
	}
	public void setLastUpdatedTime(Date lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}
	public String getPortfolio() {
		return portfolio;
	}
	public void setPortfolio(String portfolio) {
		this.portfolio = portfolio;
	}
	public String getPoc() {
		return poc;
	}
	public void setPoc(String poc) {
		this.poc = poc;
	}
	public Long getAdjustment() {
		return adjustment;
	}
	public void setAdjustment(Long adjustment) {
		this.adjustment = adjustment;
	}
	public Long getHours() {
		return hours;
	}
	public void setHours(Long hours) {
		this.hours = hours;
	}
	public Long getRate() {
		return rate;
	}
	public void setRate(Long rate) {
		this.rate = rate;
	}
	public String getRevenue() {
		return revenue;
	}
	public void setRevenue(String revenue) {
		this.revenue = revenue;
	}


}
