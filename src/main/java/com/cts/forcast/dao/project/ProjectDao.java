package com.cts.forcast.dao.project;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.cts.forcast.common.dao.GenericDao;
import com.cts.forcast.domain.project.Project;

public interface ProjectDao extends GenericDao<Project> {
	
	Collection<Project> getFiltersData();
	
	List<String> getAllEmployees();
	
}
