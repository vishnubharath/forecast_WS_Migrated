package com.cts.forcast.dao.project;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.cts.forcast.dao.report.ReportEntity;

@Transactional
public interface ProjectRepository extends CrudRepository<ReportEntity, Long> {

	@Query(value = "SELECT distinct Project_Id,Project_Name FROM Forecast_Reports", nativeQuery = true)
	List<Object[]> findAllProjects();

}