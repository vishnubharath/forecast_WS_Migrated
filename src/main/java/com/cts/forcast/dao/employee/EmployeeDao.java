package com.cts.forcast.dao.employee;

import java.util.Collection;

import com.cts.forcast.common.dao.GenericDao;
import com.cts.forcast.domain.employee.Employee;

public interface EmployeeDao extends GenericDao<Employee> {

	Collection<Employee> getEmployeesList();

	Collection<String> getEmpNames();

	Collection<String> getLocationNames();

	Collection<String> getProjectNames();
}
