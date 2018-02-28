package com.cts.forcast.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.forcast.domain.project.Project;
import com.cts.forcast.service.ProjectService;

@Controller
@CrossOrigin
@RestController
@RequestMapping("/projects")
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	@RequestMapping(value = "/all", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Project> getAllProjects() {
		return projectService.getAllProjects();
	}

}
