package com.api.se.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.se.entities.Aluno;

@Repository
public interface AlunoRepository extends CrudRepository<Aluno, Long> {

	boolean existsByMatricula(String matricula);
}
