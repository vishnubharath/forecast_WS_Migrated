package com.cts.forcast.service.impl;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.forcast.common.KeyValuePair;
import com.cts.forcast.dao.holiday.HolidayDao;
import com.cts.forcast.domain.holiday.Holiday;
import com.cts.forcast.service.HolidayService;

@Service("holidayService")
public class HolidayServiceImpl implements HolidayService {

	@Autowired
	private HolidayDao holidayDao;

	public Collection<Holiday> getHolidays() {
		return holidayDao.getAll();
	}

	public int getHolidaysByLocation(Long locationId) {

		return 1; // holidayDao.getByLocationId(locationId);
	}

	@Override
	public List<KeyValuePair<Long, Date>> getAllHolidaysByLocation() {
		return null; //holidayDao.getAllHolidaysByLocation();
	}

}
