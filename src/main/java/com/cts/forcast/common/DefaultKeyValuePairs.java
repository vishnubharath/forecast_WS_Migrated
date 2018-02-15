package com.cts.forcast.common;

import java.util.Date;

public class DefaultKeyValuePairs {

	public static class StringStringPair extends KeyValuePair<String, String> {

		public StringStringPair(String key, String value) {
			super(key, value);
		}
	}

	public static class HolidaysByLocationPair extends KeyValuePair<Long, Date> {

		public HolidaysByLocationPair(Long key, Date value) {
			super(key, value);
		}
	}

}
