package com.cts.forcast.dao.report;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface ReportRepository extends CrudRepository<ReportEntity, Long> {

    @Query(value = "SELECT top 10 * FROM Forecast_Reports",nativeQuery=true)
    Collection<ReportEntity> findAllReportsWithLimited();
    
    @Transactional
    @Modifying
    @Query("update ReportEntity u set u.projectName = ?1 where u.reportId = ?2")
    int saveForecast(String projectName, Long reportId);
    
    Collection<ReportEntity> findByProjectId(Long id);
}