package com.cts.forcast.service;

import java.util.Collection;
import java.util.List;

import com.cts.forcast.domain.report.Report;

public interface ReportsService {

	public Collection<Report> getByEmployeeId(Integer projectId);

	public Collection<Report> getByProjectId(Integer employeeId);

	public Collection<Report> getByEmpProject(Integer employeeId, Integer projectId);

	public Collection<Report> getAll();

	public Collection<Report> getAllLeaves();
		
	public void saveRecords(List<Report> rep);
	
	public void updateRecords(List<Report> rep);
}
