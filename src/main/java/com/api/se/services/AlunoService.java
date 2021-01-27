package com.api.se.services;

import java.util.List;

import com.api.se.dto.AlunoDTO;
import com.api.se.entities.Aluno;
import com.api.se.exceptions.GlobalException;

public interface AlunoService {

	public Aluno cadastrarAluno(AlunoDTO aluno) throws GlobalException;
	
	public List<Aluno> listarAlunos();

}
