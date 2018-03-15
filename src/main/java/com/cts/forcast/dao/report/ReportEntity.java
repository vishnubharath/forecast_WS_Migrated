package com.cts.forcast.dao.report;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "Forecast_Reports")
@IdClass(ReportEmbeddedId.class)
public class ReportEntity implements Serializable {

	@Column(name = "Report_Id", insertable = false, updatable = false)
	private Long reportId;

	@Id
	@Column(name = "Associate_Id")
	private Long associateId;

	@Id
	@Column(name = "Project_Id")
	private Long projectId;

	@Id
	@Column(name = "Location_Type")
	private String locationType;

	@Column(name = "Associate_Name")
	private String associateName;

	@Column(name = "Associate_City")
	private String associateCity;

	@Column(name = "Customer_Id")
	private Long customerId;

	@Column(name = "Customer_Name")
	private String customerName;

	@Column(name = "Project_Name")
	private String projectName;

	@Column(name = "Portfolio")
	private String portfolio;

	@Column(name = "POC")
	private String poc;

	@Column(name = "Billable_Type")
	private String billableType;

	@Column(name = "Associate_Grade")
	private String associateGrade;

	@Column(name = "Alloc_Start_Date")
	private Date allocStartDate;

	@Column(name = "Alloc_End_Date")
	private Date allocEndDate;

	@Column(name = "Project_Billability")
	private String projectBillability;

	@Column(name = "Actual_Month")
	private String actualMonth;

	@Column(name = "Actual_Year")
	private String actualYear;

	@Column(name = "Allocation_Percentage")
	private String allocationPercentage;

	@Column(name = "Last_Updated_User")
	private String lastUpdatedUser;
	
	
	@Column(name = "Last_Updated_Time")
	private Date lastUpdatedTime;

	@OneToMany(mappedBy = "reportentity", fetch = FetchType.LAZY)
	@Cascade({ CascadeType.ALL })
	private List<ReportAdjustmentEntity> reportAdjustmentEntity;

	public Long getReportId() {
		return reportId;
	}

	public void setReportId(Long reportId) {
		this.reportId = reportId;
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

	public String getPoc() {
		return poc;
	}

	public void setPoc(String poc) {
		this.poc = poc;
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

	public Date getAllocEndDate() {
		return allocEndDate;
	}

	public void setAllocEndDate(Date allocEndDate) {
		this.allocEndDate = allocEndDate;
	}

	public String getProjectBillability() {
		return projectBillability;
	}

	public void setProjectBillability(String projectBillability) {
		this.projectBillability = projectBillability;
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

	public String getAllocationPercentage() {
		return allocationPercentage;
	}

	public void setAllocationPercentage(String allocationPercentage) {
		this.allocationPercentage = allocationPercentage;
	}

	public String getLastUpdatedUser() {
		return lastUpdatedUser;
	}

	public void setLastUpdatedUser(String lastUpdatedUser) {
		this.lastUpdatedUser = lastUpdatedUser;
	}

	public List<ReportAdjustmentEntity> getReportAdjustmentEntity() {
		return reportAdjustmentEntity;
	}

	public void setReportAdjustmentEntity(List<ReportAdjustmentEntity> reportAdjustmentEntity) {
		this.reportAdjustmentEntity = reportAdjustmentEntity;
	}

	public Long getAssociateId() {
		return associateId;
	}

	public void setAssociateId(Long associateId) {
		this.associateId = associateId;
	}

	public String getLocationType() {
		return locationType;
	}

	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public Date getLastUpdatedTime() {
		return lastUpdatedTime;
	}

	public void setLastUpdatedTime(Date lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}
	
	

}
