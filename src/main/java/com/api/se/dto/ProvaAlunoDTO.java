package com.api.se.dto;

public class ProvaAlunoDTO {

	private Long idProva;

	private String[] respostas;
	
	public ProvaAlunoDTO() {
		respostas = new String[10];
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
