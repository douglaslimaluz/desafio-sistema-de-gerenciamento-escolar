package com.api.se.services.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.se.dto.AlunoDTO;
import com.api.se.entities.Aluno;
import com.api.se.exceptions.GlobalException;
import com.api.se.repositories.AlunoRepository;
import com.api.se.repositories.ProvaAlunoRepository;
import com.api.se.services.AlunoService;

@Service
public class AlunoServiceImpl implements AlunoService {

	@Autowired
	AlunoRepository alunoRepository;

	@Autowired
	ProvaAlunoRepository provaAlunoRepository;

	@Override
	public Aluno cadastrarAluno(AlunoDTO alunoDto) throws GlobalException {

		if (alunoRepository.existsByMatricula(alunoDto.getMatricula())) {
			throw new GlobalException("Aluno já existe!");
		}

		Aluno aluno = new Aluno();

		BeanUtils.copyProperties(alunoDto, aluno);

		alunoRepository.save(aluno);

		return aluno;
	}

	@Override
	public List<Aluno> listarAlunos() {
		return (List<Aluno>) alunoRepository.findAll();
	}

}
