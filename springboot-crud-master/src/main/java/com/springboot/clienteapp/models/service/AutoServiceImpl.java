package com.springboot.clienteapp.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.clienteapp.models.entity.Auto;
import com.springboot.clienteapp.models.entity.Cliente;
import com.springboot.clienteapp.models.repository.AutoRespository;
import com.springboot.clienteapp.models.repository.ClienteRespository;

@Service
public class AutoServiceImpl implements IAutoService {
	@Autowired
	private AutoRespository autoRepository;
	
	@Override
	public List<Auto> listaAuto() {
		return (List<Auto>) autoRepository.findAll();
	}

	@Override
	public void guardar(Auto auto) {
		autoRepository.save(auto);
	}

	@Override
	public Auto buscarPorId(Long id_auto)  {		
		return autoRepository.findById(id_auto).orElse(null);
	}

	@Override
	public void eliminar(Long id_auto){		
		autoRepository.deleteById(id_auto);
	}
}
