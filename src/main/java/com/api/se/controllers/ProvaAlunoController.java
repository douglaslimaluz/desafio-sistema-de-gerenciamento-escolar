package com.api.se.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.se.dto.ProvaAlunoDTO;
import com.api.se.entities.Aluno;
import com.api.se.entities.ProvaAluno;
import com.api.se.exceptions.GlobalException;
import com.api.se.services.ProvaAlunoService;

@RestController
@RequestMapping("/provasAluno")
public class ProvaAlunoController {

	@Autowired
	ProvaAlunoService provaAlunoService;

	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<ProvaAluno> listaProvasAluno() {
		return provaAlunoService.listarAlunos();
	}
	
	@GetMapping(path = "/{idAluno}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public String buscarNotaFinalAluno(@PathVariable Long idAluno) {
		return provaAlunoService.buscaNotaFinalAluno(idAluno);
	}
	
	@GetMapping(path = "/aprovados", produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Aluno> buscarNotaFinalAluno() {
		return provaAlunoService.listarAlunosAprovados();
	}

	@PostMapping
	public ProvaAluno cadastrarResposta(@RequestBody ProvaAlunoDTO prova) throws GlobalException {
		return provaAlunoService.cadastrarRespostasProva(prova);
	}

}