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
import com.springboot.clienteapp.models.entity.Tipo;
import com.springboot.clienteapp.models.service.ITipoService;


@Controller
@RequestMapping("/views/tipos")
public class TipoController {


	@Autowired
	private ITipoService TipoService;

	@GetMapping("/")
	public String listarTipo(Model model) {
		List<Tipo> listadoTipo= TipoService.listarTipo();

		model.addAttribute("titulo", "Lista de Tipos");
		model.addAttribute("Tipos", listadoTipo);

		return "/views/tipos/listar";
	}
	
	
}
