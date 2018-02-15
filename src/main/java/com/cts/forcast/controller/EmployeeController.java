package com.cts.forcast.controller;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.forcast.domain.employee.Employee;
import com.cts.forcast.service.EmployeeService;


@Controller
@RestController("/employee")

public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/employee/listOfEmployees", method = RequestMethod.GET, headers = "Accept=application/json")
	public Collection<Employee> getAllEmployees() {
		return employeeService.getEmployeesList();
	}
	
	@RequestMapping(value = "/employee/employeeNames", method = RequestMethod.GET, headers = "Accept=application/json")
	public Collection<String> getAllEmployeeNames() {
		return employeeService.getEmployeeNames();
	}
	
	@RequestMapping(value = "/employee/locations", method = RequestMethod.GET, headers = "Accept=application/json")
	public Collection<String> getAllLocations() {
		return employeeService.getLocationNames();
	}
	
	@RequestMapping(value = "/employee/projectTitles", method = RequestMethod.GET, headers = "Accept=application/json")
	public Collection<String> getAllProjectNames() {
		return employeeService.getProjectNames();
	}
	
}
