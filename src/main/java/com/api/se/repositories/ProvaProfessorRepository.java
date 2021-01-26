package com.api.se.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.se.entities.ProvaProfessor;

@Repository
public interface ProvaProfessorRepository extends CrudRepository<ProvaProfessor, Long>{

}