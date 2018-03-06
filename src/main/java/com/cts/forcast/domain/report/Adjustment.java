package com.cts.forcast.domain.report;

public class Adjustment {

	private Long id;
	private Long adjusment;
	private Long hours;
	private Long rate;
	private Long associateId;
	private Long projectId;
	private String locationType;
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

	public String getLocationType() {
		return locationType;
	}

	public void setLocationType(String locationType) {
		this.locationType = locationType;
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
