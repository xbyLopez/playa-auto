package com.springboot.clienteapp.models.service;

import java.util.List;

import com.springboot.clienteapp.models.entity.Auto;
import com.springboot.clienteapp.models.entity.Cliente;

public interface IAutoService {
	
	public List<Auto> listaAuto();
	public void guardar(Auto auto);
	public Auto buscarPorId(Long id_auto);
	public void eliminar(Long id_auto);
}



