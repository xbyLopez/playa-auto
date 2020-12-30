package com.springboot.clienteapp.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.clienteapp.models.entity.Tipo;
import com.springboot.clienteapp.models.repository.TipoRespository;

@Service
public class TipoServiceImpl implements ITipoService {

	@Autowired
	private TipoRespository tipoRespository;
	
	@Override
	public List<Tipo> listarTipo() {
		
		return (List<Tipo>) tipoRespository.findAll();
	}

}
