package com.api.se.services;

import java.util.List;

import com.api.se.dto.AlunoDTO;
import com.api.se.entities.Aluno;

public interface AlunoService {

	public Aluno cadastrarAluno(AlunoDTO aluno);
	
	public List<Aluno> listarAlunos();

	public /*NomeNotaAlunoDTO*/  void verificaNotaFinalAlunos(Long id);
}
