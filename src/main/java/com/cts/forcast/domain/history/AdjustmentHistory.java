package com.cts.forcast.domain.history;

public class AdjustmentHistory {

	private Long id;
	private Long adjusment;
	private Long hours;
	private Long rate;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAdjusment() {
		return adjusment;
	}

	public void setAdjusment(Long adjusment) {
		this.adjusment = adjusment;
	}

}
