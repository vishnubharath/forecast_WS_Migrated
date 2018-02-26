package com.cts.forcast.domain.report;

public class ReportAdjusment {

	private Long id;
	private Long hours;
	private Long adjustment;
	private Long rate;
	private String revenue;
	private String forecastedMonth;
	private Long forecastedYear;
	private String actualMonth;
	private Long actualYear;
	
	
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
