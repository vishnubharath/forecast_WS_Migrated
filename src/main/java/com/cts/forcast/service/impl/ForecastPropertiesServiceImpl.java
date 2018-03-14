package com.cts.forcast.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.forcast.dao.forecastProperties.ForecastProperties;
import com.cts.forcast.dao.forecastProperties.ForecastPropertiesRepository;
import com.cts.forcast.service.ForecastPropertiesService;

@Service("forecastPropertiesService")
public class ForecastPropertiesServiceImpl implements ForecastPropertiesService {

	@Autowired
	private ForecastPropertiesRepository forecastPropertiesRepository;

	public Collection<ForecastProperties> getNoOfMonths(Long id) {
		return forecastPropertiesRepository.findByPropertyId(id);
	}
}
