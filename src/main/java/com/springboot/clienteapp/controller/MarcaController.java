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

import com.springboot.clienteapp.models.entity.Auto;
import com.springboot.clienteapp.models.entity.Marca;
import com.springboot.clienteapp.models.service.IMarcaService;


@Controller
@RequestMapping("/views/marcas")
public class MarcaController {


	@Autowired
	private IMarcaService marcaService;

	@GetMapping("/")
	public String listarMarca(Model model) {
		List<Marca> listadoMarcas = marcaService.listarMarca();

		model.addAttribute("titulo", "Lista de Marcas");
		model.addAttribute("Marcas", listadoMarcas);

		return "views/marcas/listar";
	}
	
	

	

}
