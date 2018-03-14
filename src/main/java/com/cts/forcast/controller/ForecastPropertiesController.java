package com.cts.forcast.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.forcast.dao.forecastProperties.ForecastProperties;
import com.cts.forcast.service.ForecastPropertiesService;

@RestController
@RequestMapping("/forecastProperties")
public class ForecastPropertiesController {

	@Autowired
	private ForecastPropertiesService forecastPropertiesService;

	@RequestMapping(value = "/monthsCount/{propertyId}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Collection<ForecastProperties> getNoOfForecastedMonths(@PathVariable Long propertyId) {

		return forecastPropertiesService.getNoOfMonths(propertyId);
	}

}
