package com.cts.forcast.service.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.forcast.dao.project.ProjectDao;
import com.cts.forcast.domain.project.Project;
import com.cts.forcast.service.ProjectService;

@Service("projectService")
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectDao projectDao;
	
	public Collection<Project> getAllFilters() {
		return projectDao.getFiltersData();
	}
	
	public List<String> getAllEmployeelist()
	{
		return projectDao.getAllEmployees();
		
	}

}
