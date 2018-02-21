package com.cts.forcast.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.forcast.dao.employee.EmployeeEntity;
import com.cts.forcast.dao.employee.EmployeeRepository;
import com.cts.forcast.dao.employee.ReportEntity;
import com.cts.forcast.domain.employee.Employee;
import com.cts.forcast.service.EmployeeService;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<ReportEntity> getEmployeesList() {
		ArrayList<ReportEntity> employees = new ArrayList<ReportEntity>();
		//Testing purpose
//		Iterable<ReportEntity> employeeEntityies = employeeRepository.findAllWithLimited();
//		for (ReportEntity employeeEntity : employeeEntityies) {
//			Employee emplopyee = new Employee();
//			emplopyee.setLocation(employeeEntity.getLocationType());
//			emplopyee.setEsaProjectName(employeeEntity.getProjectName());
//			emplopyee.setAssociateName(emplopyee.getAssociateName());
//			emplopyee.setAssociateName(employeeEntity.getAssociateName());
//			emplopyee.setEmployeeId(employeeEntity.getEmployeeId());
//			employees.add(emplopyee);
//		}
		
		return employeeRepository.findAllWithLimited();
	}

	public Collection<String> getEmployeeNames() {
		return null;
	}

	public Collection<String> getLocationNames() {
		return null;
	}

	public Collection<String> getProjectNames() {
		return null;
	}

}
