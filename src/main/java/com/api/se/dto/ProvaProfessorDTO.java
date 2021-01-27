package com.api.se.dto;

public class ProvaProfessorDTO {

	private String titulo;

	private Integer[] gabarito;

	public ProvaProfessorDTO() {
		gabarito = new Integer[10];
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer[] getGabarito() {
		return gabarito;
	}

	public void setGabarito(Integer[] gabarito) {
		this.gabarito = gabarito;
	}

}
