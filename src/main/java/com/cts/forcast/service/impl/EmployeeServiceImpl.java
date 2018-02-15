package com.cts.forcast.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.forcast.dao.employee.EmployeeDao;
import com.cts.forcast.domain.employee.Employee;
import com.cts.forcast.service.EmployeeService;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	public Collection<Employee> getEmployeesList() {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeesList();
	}

	public Collection<String> getEmployeeNames() {
		// TODO Auto-generated method stub
		return employeeDao.getEmpNames();
	}

	public Collection<String> getLocationNames() {
		// TODO Auto-generated method stub
		return employeeDao.getLocationNames();
	}

	public Collection<String> getProjectNames() {
		// TODO Auto-generated method stub
		return employeeDao.getProjectNames();
	}
	
	

	
	
	
}
