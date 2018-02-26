package com.cts.forcast.dao.report;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Forecast_Reports_Costing")
//@IdClass(com.cts.forcast.dao.report.ReportAdjustmentEntityPK.class)
public class ReportAdjustmentEntity implements Serializable {

	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Costing_Id")
	private Long id;
	@Column(name = "Associate_Id")	
	private Long associateId;
	@Column(name = "Project_Id")
	private Long projectId;
	@Column(name = "Hours")
	private Long hours;
	@Column(name = "Adjustment")
	private Long adjustment;
	@Column(name = "Rate")
	private Long rate;
	@Column(name = "Revenue")
	private String revenue;
	@Column(name = "Forecasted_Month")
	private String forecastedMonth;
	@Column(name = "Forecasted_Year")
	private Long forecastedYear;
	@Column(name = "Actual_Month")
	private String actualMonth;
	@Column(name = "Actual_Year")
	private Long actualYear;
	@Column(name = "Last_Updated_User")
	private String lastUpdatedUser;

	@ManyToOne
	@JoinColumn(name = "Report_Id", nullable = false)
	private ReportEntity reportentity;
	

	public Long getAssociateId() {
		return associateId;
	}

	public void setAssociateId(Long associateId) {
		this.associateId = associateId;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public Long getHours() {
		return hours;
	}

	public void setHours(Long hours) {
		this.hours = hours;
	}

	public Long getAdjustment() {
		return adjustment;
	}

	public void setAdjustment(Long adjustment) {
		this.adjustment = adjustment;
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

	public String getForecastedMonth() {
		return forecastedMonth;
	}

	public void setForecastedMonth(String forecastedMonth) {
		this.forecastedMonth = forecastedMonth;
	}

	public Long getForecastedYear() {
		return forecastedYear;
	}

	public void setForecastedYear(Long forecastedYear) {
		this.forecastedYear = forecastedYear;
	}

	public String getActualMonth() {
		return actualMonth;
	}

	public void setActualMonth(String actualMonth) {
		this.actualMonth = actualMonth;
	}

	public Long getActualYear() {
		return actualYear;
	}

	public void setActualYear(Long actualYear) {
		this.actualYear = actualYear;
	}



	public String getLastUpdatedUser() {
		return lastUpdatedUser;
	}

	public void setLastUpdatedUser(String lastUpdatedUser) {
		this.lastUpdatedUser = lastUpdatedUser;
	}

	public ReportEntity getReportentity() {
		return reportentity;
	}

	public void setReportentity(ReportEntity reportentity) {
		this.reportentity = reportentity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
