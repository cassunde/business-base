package br.com.cassunde.repository;

import java.util.List;
import java.util.stream.Stream;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.cassunde.model.Usuario;


public class Usuarios {

	@Inject
	private EntityManager em;
	
	public List<Usuario> listUsuario(){
		List<Usuario> usus = em.createQuery(" from Usuario ",Usuario.class).getResultList();
		
		return usus;
		
	}
	
	public void listUsuarioWithStream(){
		
		Stream<Usuario> usus = em.createQuery(" from Usuario ",Usuario.class).getResultStream();
		usus.forEach(u -> System.out.println(u.getLogin()));

	}
	
}
