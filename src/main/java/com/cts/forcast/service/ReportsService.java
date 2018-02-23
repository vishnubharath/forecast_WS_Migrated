package com.cts.forcast.service;

import java.util.Collection;
import java.util.List;

import com.cts.forcast.dao.report.ReportEntity;
import com.cts.forcast.domain.report.ForcastReport;

public interface ReportsService {

	public Collection<ReportEntity> getByEmployeeId(Integer projectId);

	public Collection<ReportEntity> getByProjectId(Integer employeeId);

	public Collection<ReportEntity> getByEmpProject(Integer employeeId, Integer projectId);

	public Collection<ForcastReport> getAll();

	public Collection<ReportEntity> getAllLeaves();
		
	public void saveRecords(List<ReportEntity> rep);
	
	public void updateRecords(List<ReportEntity> rep);
	
	public void updateRecord(ReportEntity rep);
}
