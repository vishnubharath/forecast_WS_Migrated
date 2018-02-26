package com.cts.forcast.domain.report;

public class ReportAdjusment {

	private Long hours;
	private Long adjustment;
	private Long rate;
	private String revenue;
	
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
	
}
