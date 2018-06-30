package br.com.cassunde.service.usuario;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

import br.com.cassunde.repository.Usuarios;

public class Main {

	public static void main(String[] args) {
		
		SeContainer container = SeContainerInitializer.newInstance().initialize();		
		Usuarios repo = container.select(Usuarios.class).get();
		
		repo.listUsuarioWithStream();
	}
}
