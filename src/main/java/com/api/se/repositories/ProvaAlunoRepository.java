package com.api.se.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.se.entities.ProvaAluno;

@Repository
public interface ProvaAlunoRepository extends CrudRepository<ProvaAluno, Long>{

	boolean existsByIdAlunoAndIdProvaProfessor(Long idProva, Long idProvaProfessor);
	
	public List<ProvaAluno> findAllByIdAluno(Long idAluno);
	
	public List<ProvaAluno> findAllByMediaGreaterThan(double media);
}
