package com.api.se.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prova_aluno")
public class ProvaAluno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long idProva;

	private String[] respostas;

	public ProvaAluno() {
		respostas = new String[10];
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdProva() {
		return idProva;
	}

	public void setIdProva(Long idProva) {
		this.idProva = idProva;
	}

	public String[] getRespostas() {
		return respostas;
	}

	public void setRespostas(String[] respostas) {
		this.respostas = respostas;
	}

}
