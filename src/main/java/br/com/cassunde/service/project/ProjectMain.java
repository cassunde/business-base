package br.com.cassunde.service.project;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

public class ProjectMain {

	public static void main(String[] args) {
		SeContainer container = SeContainerInitializer.newInstance().initialize();		
		
		ProjectService projectService = container.select(ProjectService.class).get();
		projectService.prepareToSave();

	}
}
