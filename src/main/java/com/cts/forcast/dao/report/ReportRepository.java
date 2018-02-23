package com.cts.forcast.dao.report;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface ReportRepository extends CrudRepository<ReportEntity, Long> {

    @Query(value = "SELECT top 10 * FROM Forecast_Reports",nativeQuery=true)
    Collection<ReportEntity> findAllReportsWithLimited();
}