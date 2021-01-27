package com.api.se.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.se.dto.ProvaProfessorDTO;
import com.api.se.entities.ProvaProfessor;
import com.api.se.services.ProvaProfessorService;

@RestController
@RequestMapping("/provasProfessor")
public class ProvaProfessorController {

	@Autowired
	ProvaProfessorService provaProfessorService;

	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<ProvaProfessor> listaProvas() {
		return provaProfessorService.listarGabaritos();
	}

	@PostMapping
	public ProvaProfessor cadastraGabaritoProva(@RequestBody ProvaProfessorDTO prova) {
		return provaProfessorService.cadastrarGabarito(prova);
	}
	
}
