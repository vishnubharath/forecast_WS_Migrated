package com.cts.forcast.service.Util;
import java.util.ArrayList;
import java.util.List;

public class Month {

	private List<String> week = new ArrayList<String>();
	private  List<String> month = new ArrayList<String>();

	public List<String> getWeek() {
		return week;
	}

	public void clearWeek() {
		week = new ArrayList<String>();
	}

	public void setWeek(int weekDay) {
		week.add(String.valueOf(weekDay));
	}

	public List<String> getMonth() {
		return month;
	}

	public void setMonth(List week) {
		month.add(week.toString());
	}

}
