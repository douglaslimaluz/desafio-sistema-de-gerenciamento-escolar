package com.api.se.dto;

public class ProvaAlunoDTO {

	private Long idAluno;

	private Long idProvaProfessor;

	private Integer[] respostas;

	private Integer[] pesosRespostas;

	public ProvaAlunoDTO() {
		respostas = new Integer[10];
	}

	public Long getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Long idAluno) {
		this.idAluno = idAluno;
	}

	public Integer[] getRespostas() {
		return respostas;
	}

	public void setRespostas(Integer[] respostas) {
		this.respostas = respostas;
	}

	public Long getIdProvaProfessor() {
		return idProvaProfessor;
	}

	public void setIdProvaProfessor(Long idProvaProfessor) {
		this.idProvaProfessor = idProvaProfessor;
	}

	public Integer[] getPesosRespostas() {
		return pesosRespostas;
	}

	public void setPesosRespostas(Integer[] pesosRespostas) {
		this.pesosRespostas = pesosRespostas;
	}

}
