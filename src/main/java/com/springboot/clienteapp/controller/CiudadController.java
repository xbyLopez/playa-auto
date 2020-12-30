package com.springboot.clienteapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springboot.clienteapp.models.entity.Ciudad;
import com.springboot.clienteapp.models.entity.Tipo;
import com.springboot.clienteapp.models.service.ICiudadService;


@Controller
@RequestMapping("/views/ciudades")
public class CiudadController {


	@Autowired
	private ICiudadService ciudadService;

	@GetMapping("/")
	public String listarCiudad(Model model) {
		List<Ciudad> listadoCiudad= ciudadService.listaCiudades();

		model.addAttribute("titulo", "Lista de Ciudades");
		model.addAttribute("Ciudades", listadoCiudad);

		return "/views/ciudades/listar";
	}
	
	
}
