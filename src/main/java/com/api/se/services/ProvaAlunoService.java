package com.api.se.services;

import java.util.List;

import com.api.se.dto.ProvaAlunoDTO;
import com.api.se.entities.Aluno;
import com.api.se.entities.ProvaAluno;
import com.api.se.exceptions.GlobalException;

public interface ProvaAlunoService {

	public ProvaAluno cadastrarRespostasProva(ProvaAlunoDTO prova) throws GlobalException;
	
	public List<ProvaAluno> listarAlunos();
	
	public String buscaNotaFinalAluno(Long idAluno);
	
	public List<Aluno> listarAlunosAprovados();
	
}
