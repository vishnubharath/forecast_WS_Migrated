package com.cts.forcast.controller;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.forcast.domain.project.Project;
import com.cts.forcast.service.ProjectService;

@Controller
@RestController("/project")
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@RequestMapping(value = "/project/filters", method = RequestMethod.GET, headers = "Accept=application/json")
	public Collection<Project> getFilterData() {
		System.out.println("Loading location details..");
		return projectService.getAllFilters();
	}
	
	@RequestMapping(value = "/project/employeeList", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<String> getAllEmployees()
	{
		System.out.println("Loading employee details");
		return projectService.getAllEmployeelist();		
	}
	
	
}
