package com.cts.forcast.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.forcast.dao.project.ProjectRepository;
import com.cts.forcast.domain.project.Project;
import com.cts.forcast.service.ProjectService;

@Service("projectService")
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectRepository projectRepository;

	public List<Project> getAllProjects() {
		return mapProjectData(projectRepository.findAllProjects());
	}

	private List<Project> mapProjectData(List<Object[]> projectsList) {
		List<Project> projects = new ArrayList<>();
		projectsList.forEach(projectEntity -> {
			Project project = new Project();
			if (projectEntity[0] != null) {
				project.setProjectId(((Number) projectEntity[0]).longValue());
			}
			project.setProjectName(projectEntity[1].toString());
			projects.add(project);
		});

		return projects;
	}

}
