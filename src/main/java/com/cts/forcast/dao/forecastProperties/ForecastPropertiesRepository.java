package com.cts.forcast.dao.forecastProperties;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface ForecastPropertiesRepository extends CrudRepository<ForecastProperties, Long> {

	Collection<ForecastProperties> findByPropertyId(Long id);

}