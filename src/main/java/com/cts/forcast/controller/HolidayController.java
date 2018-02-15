package com.cts.forcast.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.forcast.domain.holiday.Holiday;
import com.cts.forcast.service.HolidayService;

@Controller
@RestController("/")
public class HolidayController {

	@Autowired
	private HolidayService holidayService;

	@RequestMapping(value = "/holidays", method = RequestMethod.GET, headers = "Accept=application/json")
	public Collection<Holiday> getHoliday() {
		return holidayService.getHolidays();
	}

	@RequestMapping(value = "/holiday/{date}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Collection<Holiday> getHolidayByDate(@PathVariable String date) {
		return holidayService.getHolidays();// yet to be implemented
	}

	@RequestMapping(value = "/holiday/{month}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Collection<Holiday> getHolidayByMonth(@PathVariable String month) {
		return holidayService.getHolidays();// yet to be implemented
	}

	/*
	 * public static void main(String args[]){ HolidayController h1= new
	 * HolidayController(); System.out.println(h1.getHoliday()); }
	 */

}
