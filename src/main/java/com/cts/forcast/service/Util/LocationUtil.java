package com.cts.forcast.service.Util;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("locationBillableHours")
public class LocationUtil extends HashMap {
	
	@Value("${billable.hours.onsite}")
	private String billableHoursOnsite;
	
	@Value("${billable.hours.offshore}")
	private String billableHoursOffshore;

	public LocationUtil() {
		this.put("ONSITE", billableHoursOnsite);
		this.put("OFFSHORE", billableHoursOffshore);
	}
}
