package com.cts.forcast.service;

import java.util.Collection;

import com.cts.forcast.dao.forecastProperties.ForecastProperties;

public interface ForecastPropertiesService {

	public Collection<ForecastProperties> getNoOfMonths(Long id);

}
