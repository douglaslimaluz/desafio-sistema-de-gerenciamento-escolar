package com.api.se.services.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.se.dto.ProvaProfessorDTO;
import com.api.se.entities.ProvaProfessor;
import com.api.se.repositories.ProvaProfessorRepository;
import com.api.se.services.ProvaProfessorService;

@Service
public class ProvaProfessorImpl implements ProvaProfessorService {

	@Autowired
	ProvaProfessorRepository provaProfessorRepository;

	@Override
	public ProvaProfessor cadastrarGabarito(ProvaProfessorDTO prova) {

		ProvaProfessor provaProfessor = new ProvaProfessor();

		BeanUtils.copyProperties(prova, provaProfessor);

		provaProfessorRepository.save(provaProfessor);

		return provaProfessor;
	}

	@Override
	public List<ProvaProfessor> listarGabaritos() {
		return (List<ProvaProfessor>) provaProfessorRepository.findAll();
	}

}
