package com.api.se.services;

import com.api.se.dto.ProvaAlunoDTO;
import com.api.se.entities.ProvaProfessor;

public interface ProvaAlunoService {

	public ProvaProfessor cadastrarRespostasProva(ProvaAlunoDTO prova);
	
}
