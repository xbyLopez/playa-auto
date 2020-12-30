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
import com.springboot.clienteapp.models.entity.Cliente;
import com.springboot.clienteapp.models.service.ICiudadService;
import com.springboot.clienteapp.models.service.IClienteService;
import com.springboot.clienteapp.models.entity.Auto;
import com.springboot.clienteapp.models.service.IAutoService;

@Controller
@RequestMapping("/views/autos")
public class AutoController {


	@Autowired
	private IAutoService autoService;

	@GetMapping("/")
	public String listaAuto(Model model) {
		List<Auto> listadoAutos = autoService.listaAuto();

		model.addAttribute("titulo", "Lista de Autos");
		model.addAttribute("Autos", listadoAutos);

		return "/views/autos/listar";
	}
	
	@GetMapping("/create")
	public String crear(Model model) {

		Auto  auto = new Auto();
	

		model.addAttribute("titulo", "Formulario: Nuevo Auto");
		model.addAttribute("autos", auto);
		

		return "/views/autos/frmCrear";
	}
	@PostMapping("/save")
	public String guardar(@Valid @ModelAttribute Auto auto, BindingResult result,
			Model model, RedirectAttributes attribute) {
		

		if (result.hasErrors()) {
			model.addAttribute("titulo", "Formulario: Nuevo Auto");
			model.addAttribute("autos", auto);
			
			System.out.println("Existieron errores en el formulario");			
			return "/views/autos/frmCrear";
		}

		autoService.guardar(auto);
		System.out.println("auto guardado con exito!");
		attribute.addFlashAttribute("success", "auto guardado con exito!");
		return "redirect:/views/autos/";
	}

	@GetMapping("/edit/{id_auto}")
	public String editar(@PathVariable("id_auto") Long idAuto, Model model, RedirectAttributes attribute) {
			
		Auto auto = null;
		
		if (idAuto > 0) {
			auto = autoService.buscarPorId(idAuto);
			
			if (auto == null) {
				System.out.println("Error: El ID del auto no existe!");
				attribute.addFlashAttribute("error", "ATENCION: El ID del autos no existe!");
				return "redirect:/views/autos/";
			}
		}else {
			System.out.println("Error: Error con el ID del auto");
			attribute.addFlashAttribute("error", "ATENCION: Error con el ID del auto");
			return "redirect:/views/autos/";
		}
		
		

		model.addAttribute("titulo", "Formulario: Editar autos");
		model.addAttribute("autos", auto);
		

		return "/views/autos/frmCrear";
	}
	
	@GetMapping("/delete/{id}")
	public String eliminar(@PathVariable("id") Long idAuto, RedirectAttributes attribute) {

		Auto auto= null;
		
		if (idAuto > 0) {
			auto = autoService.buscarPorId(idAuto);
			
			if (auto == null) {
				System.out.println("Error: El ID del cliente no existe!");
				attribute.addFlashAttribute("error", "ATENCION: El ID del autos no existe!");
				return "redirect:/views/autos/";
			}
		}else {
			System.out.println("Error: Error con el ID del autos");
			attribute.addFlashAttribute("error", "ATENCION: Error con el ID del autos!");
			return "redirect:/views/autos/";
		}		
		
		autoService.eliminar(idAuto);
		System.out.println("Registro Eliminado con Exito!");
		attribute.addFlashAttribute("warning", "Registro Eliminado con Exito!");

		return "redirect:/views/clientes/";
	}

	

	

}
