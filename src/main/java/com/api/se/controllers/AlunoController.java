  
package com.api.se.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.se.dto.AlunoDTO;
import com.api.se.entities.Aluno;
import com.api.se.exceptions.GlobalException;
import com.api.se.services.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

	@Autowired
	AlunoService alunoService;

	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Aluno> listaAlunos() {
		return alunoService.listarAlunos();
	}

	@PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	public Aluno salvarAlunos(@RequestBody AlunoDTO alunoDto) throws GlobalException {
		return alunoService.cadastrarAluno(alunoDto);
	}
}