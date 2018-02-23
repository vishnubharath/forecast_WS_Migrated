package com.cts.forcast.dao.employee;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.cts.forcast.dao.report.ReportEntity;

@Transactional
public interface EmployeeRepository extends CrudRepository<ReportEntity, Long> {
	
    @Query(value = "SELECT top 10 * FROM Forecast_Reports",nativeQuery=true)
    List<ReportEntity> findAllWithLimited();
}