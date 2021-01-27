package com.api.se.services;

import java.util.List;

import com.api.se.dto.ProvaProfessorDTO;
import com.api.se.entities.ProvaProfessor;

public interface ProvaProfessorService {
	
	public ProvaProfessor cadastrarGabarito(ProvaProfessorDTO prova);
	
	public List<ProvaProfessor> listarGabaritos();
	
}
