package br.com.cassunde.service.project;

import java.util.Arrays;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.cassunde.model.project.Member;
import br.com.cassunde.model.project.Project;
import br.com.cassunde.project.validations.ValidProjects;

public class ProjectService {

		@Inject
		EntityManager em;
		
		public void save(Project project) {
				em.getTransaction().begin();
				em.persist(project);
				em.getTransaction().commit();
				em.close();			
		}
		
		public boolean valideProject(Project project) {
				ValidProjects valida = new ValidProjects();
				return valida.membersValids(project);
		}
		
		public void prepareToSave() {
			
				Project firstProject = new Project();
				firstProject.setDescription("test");
				
				Member member1 = new Member();
				member1.setAge(18);
				member1.setName("Francisco");
				
				Member member2 = new Member();
				member2.setAge(18);
				member2.setName("João");
				
				firstProject.setMembers( Arrays.asList( member1, member2 ) );
				
				if( valideProject( firstProject ) ) {
						save(firstProject);
				}
			
		}
		
}
