package com.cts.forcast.dao.employee;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface EmployeeRepository extends CrudRepository<ReportEntity, Long> {

    List<ReportEntity> findByAssociateName(String lastName);

    @Query(value = "SELECT top 10 * FROM Forecast_Reports",nativeQuery=true)
    List<ReportEntity> findAllWithLimited();
}