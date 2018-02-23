package com.cts.forcast.dao.report;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Forecast_Reports_Costing")
public class ReportAdjustmentEntity {
	
	@Id
	@Column(name="Associate_Id")
	private Long associateId;
	@Column(name="Project_Id")
	private Long projectId;	
	@Column(name="Hours")
	private Long hours;
	@Column(name="Adjustment")
	private Long adjustment;
	@Column(name="Rate")
	private Long rate;
	@Column(name="Revenue")
	private Long revenue;
	@Column(name="Forecasted_Month")
	private Long forecastedMonth;
	@Column(name="Forecasted_Year")
	private Long forecastedYear;
	@Column(name="Actual_Month")
	private Long actualMonth;
	@Column(name="Actual_Year")
	private Long actualYear;
	@Column(name="Last_Updated_TimeStamp")
	private Long lastUpdatedTimeStamp;
	@Column(name="Last_Updated_User")
	private Long lastUpdatedUser;
	
	@ManyToOne
    @JoinColumn(name="associateId")
    private ReportEntity reportEntity;
	
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
	public Long getRevenue() {
		return revenue;
	}
	public void setRevenue(Long revenue) {
		this.revenue = revenue;
	}
	public Long getForecastedMonth() {
		return forecastedMonth;
	}
	public void setForecastedMonth(Long forecastedMonth) {
		this.forecastedMonth = forecastedMonth;
	}
	public Long getForecastedYear() {
		return forecastedYear;
	}
	public void setForecastedYear(Long forecastedYear) {
		this.forecastedYear = forecastedYear;
	}
	public Long getActualMonth() {
		return actualMonth;
	}
	public void setActualMonth(Long actualMonth) {
		this.actualMonth = actualMonth;
	}
	public Long getActualYear() {
		return actualYear;
	}
	public void setActualYear(Long actualYear) {
		this.actualYear = actualYear;
	}
	public Long getLastUpdatedTimeStamp() {
		return lastUpdatedTimeStamp;
	}
	public void setLastUpdatedTimeStamp(Long lastUpdatedTimeStamp) {
		this.lastUpdatedTimeStamp = lastUpdatedTimeStamp;
	}
	public Long getLastUpdatedUser() {
		return lastUpdatedUser;
	}
	public void setLastUpdatedUser(Long lastUpdatedUser) {
		this.lastUpdatedUser = lastUpdatedUser;
	}
	
	
}
