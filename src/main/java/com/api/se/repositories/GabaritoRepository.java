package com.api.se.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.se.entities.Prova;

@Repository
public interface GabaritoRepository extends CrudRepository<Prova, Long>{

}