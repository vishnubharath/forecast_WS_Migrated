package com.cts.forcast.service;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import com.cts.forcast.common.KeyValuePair;
import com.cts.forcast.domain.holiday.Holiday;

public interface HolidayService {

	public Collection<Holiday> getHolidays();

	public int getHolidaysByLocation(Long locationId);

	public List<KeyValuePair<Long, Date>> getAllHolidaysByLocation();
}
