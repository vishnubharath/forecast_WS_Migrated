package com.cts.forcast.dao.report;

import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.cts.forcast.dao.report.ReportEntity;

@Transactional
public interface ReportRepository extends CrudRepository<ReportEntity, Long> {

	Collection<ReportEntity> findByAssociateName(String lastName);

    @Query(value = "SELECT top 10 * FROM Forecast_Reports",nativeQuery=true)
    Collection<ReportEntity> findAllReportsWithLimited();
}