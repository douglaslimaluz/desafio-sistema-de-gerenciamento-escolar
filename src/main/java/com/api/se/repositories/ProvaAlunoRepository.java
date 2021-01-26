package com.api.se.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.se.entities.ProvaAluno;

@Repository
public interface ProvaAlunoRepository extends CrudRepository<ProvaAluno, Long>{

}
