package com.springboot.clienteapp.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.clienteapp.models.entity.Auto;

@Repository
public interface AutoRespository extends CrudRepository<Auto, Long> {

}
