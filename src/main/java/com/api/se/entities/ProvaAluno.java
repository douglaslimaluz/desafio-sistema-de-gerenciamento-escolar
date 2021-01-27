package com.api.se.entities;

import javax.persistence.Column;
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
	private Long idProva;

	@Column(nullable = false)
	private Long idAluno;

	@Column(nullable = false)
	private Long idProvaProfessor;

	@Column(nullable = false)
	private Integer[] respostas;

	@Column(nullable = false)
	private Integer[] pesosRespostas;

	private Double media;

	public ProvaAluno() {
		respostas = new Integer[10];
	}

	public Long getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Long idAluno) {
		this.idAluno = idAluno;
	}

	public Long getIdProvaProfessor() {
		return idProvaProfessor;
	}

	public void setIdProvaProfessor(Long idProvaProfessor) {
		this.idProvaProfessor = idProvaProfessor;
	}

	public Long getIdProva() {
		return idProva;
	}

	public void setIdProva(Long idProva) {
		this.idProva = idProva;
	}

	public Integer[] getRespostas() {
		return respostas;
	}

	public Integer[] getPesosRespostas() {
		return pesosRespostas;
	}

	public void setPesosRespostas(Integer[] pesosRespostas) {
		this.pesosRespostas = pesosRespostas;
	}

	public void setRespostas(Integer[] respostas) {
		this.respostas = respostas;
	}

	public Double getMedia() {
		return media;
	}

	public void setMedia(Double media) {
		this.media = media;
	}

}
