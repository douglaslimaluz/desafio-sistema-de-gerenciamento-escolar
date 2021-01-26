package com.api.se.dto;

public class ProvaProfessorDTO {
	
	private String titulo;
	
	private String[] gabarito;
	
	public ProvaProfessorDTO() {
		gabarito = new String[10];
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String[] getGabarito() {
		return gabarito;
	}

	public void setGabarito(String[] gabarito) {
		this.gabarito = gabarito;
	}
	
}
