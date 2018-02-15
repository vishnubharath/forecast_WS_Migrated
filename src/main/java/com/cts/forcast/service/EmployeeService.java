package com.cts.forcast.service;

import java.util.Collection;

import com.cts.forcast.domain.employee.Employee;

public interface EmployeeService {
	
	public Collection<Employee> getEmployeesList();
	
	public Collection<String> getEmployeeNames();
	
	public Collection<String> getLocationNames();
	
	public Collection<String> getProjectNames();

}
