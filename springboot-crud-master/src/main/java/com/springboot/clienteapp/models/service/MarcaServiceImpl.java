package com.springboot.clienteapp.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.clienteapp.models.entity.Auto;
import com.springboot.clienteapp.models.entity.Marca;
import com.springboot.clienteapp.models.repository.MarcaRespository;

@Service
public class MarcaServiceImpl implements IMarcaService {

	@Autowired
	private MarcaRespository marcaRepository;
	
	@Override
	public List<Marca> listarMarca() {
		
		return (List<Marca>) marcaRepository.findAll();
	}
	
	

}
