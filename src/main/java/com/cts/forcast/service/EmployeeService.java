package com.cts.forcast.service;

import java.util.Collection;
import java.util.List;

import com.cts.forcast.dao.report.ReportEntity;
import com.cts.forcast.domain.employee.Employee;

public interface EmployeeService {
	
	public List<ReportEntity> getEmployeesList();
	
	public Collection<String> getEmployeeNames();
	
	public Collection<String> getLocationNames();
	
	public Collection<String> getProjectNames();

}
