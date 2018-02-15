package com.cts.forcast.domain.leave;

public class LeaveVO {

	private Integer empId;
	private String month;
	private String year;
	private String datefrom;
	private String dateTo;
	private String noOfDays;
	private String region;
	private String updatedOn;
	private String type;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getDatefrom() {
		return datefrom;
	}

	public void setDatefrom(String datefrom) {
		this.datefrom = datefrom;
	}

	public String getDateTo() {
		return dateTo;
	}

	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}

	public String getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(String noOfDays) {
		this.noOfDays = noOfDays;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(String updatedOn) {
		this.updatedOn = updatedOn;
	}

	public String getType() {
		if (type != null) {
			return type.trim();
		}
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "LeaveVO [empId=" + empId + ", month=" + month + ", year=" + year + ", datefrom=" + datefrom
				+ ", dateTo=" + dateTo + ", noOfDays=" + noOfDays + ", region=" + region + ", updatedOn=" + updatedOn
				+ ", type=" + type + "]";
	}

}
