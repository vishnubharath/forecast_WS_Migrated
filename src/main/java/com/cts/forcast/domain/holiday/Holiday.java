package com.cts.forcast.domain.holiday;

import java.sql.Date;

public class Holiday {

	private Date date;
	private String region;
	private String description;
	private int location_id;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {

		this.date = date;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	
	//fields added for query
	private int month;
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	private int year;

}
