package com.cts.forcast.dao.employee;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class EmployeeEntity {
	
	@Id
	@Column(name="RD_Asso_Id")
	private int employeeId;
	
	@Column(name="RD_Asso_Name")
	private String associateName;
	
	@Column(name="RD_Asso_City")
	private String city;
	
	@Column(name="RD_Location_Type")
	private String locationType;
	
	@Column(name="RD_Cust_Id")
	private int customerId;
	
	@Column(name="RD_Cust_Name")
	private String customerName;
	
	@Column(name="RD_Project_Id")
	private int projectId;
	
	@Column(name="RD_Project_Name")
	private String projectName;
	
	@Column(name="RD_Billable")
	private String billable;
	
	@Column(name="RD_Asso_Grade")
	private String associateGrade;
	
	@Column(name="RD_Supervisor_Name")
	private String supervisorName;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getAssociateName() {
		return associateName;
	}

	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLocationType() {
		return locationType;
	}

	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getBillable() {
		return billable;
	}

	public void setBillable(String billable) {
		this.billable = billable;
	}

	public String getAssociateGrade() {
		return associateGrade;
	}

	public void setAssociateGrade(String associateGrade) {
		this.associateGrade = associateGrade;
	}

	public String getSupervisorName() {
		return supervisorName;
	}

	public void setSupervisorName(String supervisorName) {
		this.supervisorName = supervisorName;
	}
	

}

