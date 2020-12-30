package com.springboot.clienteapp.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.clienteapp.models.entity.Tipo;

@Repository
public interface TipoRespository extends CrudRepository<Tipo, Long> {

}
