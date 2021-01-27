package com.api.se.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.se.dto.ProvaAlunoDTO;
import com.api.se.entities.Aluno;
import com.api.se.entities.ProvaAluno;
import com.api.se.entities.ProvaProfessor;
import com.api.se.exceptions.GlobalException;
import com.api.se.repositories.AlunoRepository;
import com.api.se.repositories.ProvaAlunoRepository;
import com.api.se.repositories.ProvaProfessorRepository;
import com.api.se.services.ProvaAlunoService;

@Service
public class ProvaAlunoImpl implements ProvaAlunoService {

	private static final int NOTA_MINIMA_PARA_PASSAR = 7;

	private static final int NOTA_MINIMA = 0;

	private static final int NOTA_RESPOSTA_CERTA = 1;

	private static final int QUANTIDADE_PESOS_RESPOSTAS = 10;

	@Autowired
	ProvaAlunoRepository provaAlunoRepository;

	@Autowired
	ProvaProfessorRepository provaProfessorRepository;
	
	@Autowired
	AlunoRepository alunoRepository;

	@Override
	public ProvaAluno cadastrarRespostasProva(ProvaAlunoDTO prova) throws GlobalException {

		ProvaAluno provaAluno = new ProvaAluno();
		Optional<ProvaProfessor> provaProfessor;
		int soma = 0;
		int somaPesos = 0;
		double mediaPonderada = 0f;

		if (provaAlunoRepository.existsByIdAlunoAndIdProvaProfessor(prova.getIdAluno(), prova.getIdProvaProfessor())) {
			throw new GlobalException("Resposta já cadastrada!");
		}

		if (!provaProfessorRepository.existsById(prova.getIdProvaProfessor())) {
			throw new GlobalException("Prova não encontrada!");
		}

		provaProfessor = provaProfessorRepository.findById(prova.getIdProvaProfessor());

		Integer[] gabarito = provaProfessor.get().getGabarito();
		Integer[] respostas = prova.getRespostas();
		Integer[] pesosRespostas = prova.getPesosRespostas();

		for (int i = 0; i < gabarito.length; i++) {

			if (gabarito[i].equals(respostas[i])) {
				soma = soma + NOTA_RESPOSTA_CERTA;
			}

			somaPesos = somaPesos + pesosRespostas[i];

			mediaPonderada = (soma * QUANTIDADE_PESOS_RESPOSTAS) / somaPesos;
		}

		if (mediaPonderada < NOTA_MINIMA) {
			throw new GlobalException("A media ponderada após calculo, deu negativo, reveja os valores passados!");
		}

		BeanUtils.copyProperties(prova, provaAluno);
		provaAluno.setMedia(mediaPonderada);

		provaAlunoRepository.save(provaAluno);

		return provaAluno;
	}

	@Override
	public List<ProvaAluno> listarAlunos() {
		return (List<ProvaAluno>) provaAlunoRepository.findAll();
	}

	@Override
	public String buscaNotaFinalAluno(Long idAluno) {
		
		List<ProvaAluno> provas = provaAlunoRepository.findAllByIdAluno(idAluno);
		double nota = 0;
		
		for (ProvaAluno provaAluno : provas) {
			
			nota = nota + provaAluno.getMedia();
		}
		
		Double notaFinal = nota / provas.size();
		
		return "A nota final é: " + notaFinal;
	}

	
	@Override
	public List<Aluno> listarAlunosAprovados() {
		
		List<ProvaAluno> provas = provaAlunoRepository.findAllByMediaGreaterThan(NOTA_MINIMA_PARA_PASSAR);
		List<Aluno> alunos = new ArrayList<Aluno>();
		Optional<Aluno> aluno = Optional.of(new Aluno());
		
		for (ProvaAluno provaAluno : provas) {
			
			aluno = alunoRepository.findById(provaAluno.getIdAluno());
			alunos.add(aluno.get());
		}
		
		return alunos;
	}

}
