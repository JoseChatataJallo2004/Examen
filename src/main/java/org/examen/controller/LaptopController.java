package org.examen.controller;

import org.examen.model.Laptop;
import org.examen.repository.ILaptopRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LaptopController {

	
	@Autowired
	private ILaptopRespository repo;
	
	@GetMapping("/listar")
	public String listado(Model model) {		
		model.addAttribute("lstlaptop",repo.findAll());
		return "listado";
	}
	
	
	@GetMapping("/cargar")
	public String cargarpag(Model model) {
		model.addAttribute("laptop",new Laptop());
		return "crudlaptop";
	}
	@PostMapping("/grabar")
	public String grabarpag(@ModelAttribute Laptop laptop) {
		System.out.println(laptop);
		repo.save(laptop);
		return "exito";
	}
	
}
