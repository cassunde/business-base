package br.com.cassunde.model;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Tarefa implements Serializable {

	private static final long serialVersionUID = -8255903243822944960L;


	@Id
	private Integer pktarefa;
	
	private String titulo;
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name="fkusuario")
	private Usuario usuario;

	public Integer getPktarefa() {
		return pktarefa;
	}

	public void setPktarefa(Integer pktarefa) {
		this.pktarefa = pktarefa;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
	return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
