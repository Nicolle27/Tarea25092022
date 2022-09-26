package upeu.edu.pe.biblioteca.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.biblioteca.entity.Prestamo;
import upeu.edu.pe.biblioteca.services.PrestamoService;

@RestController
@RequestMapping("/api/prestamos")
public class PrestamoController {

	@Autowired
	private PrestamoService prestamoService;
	
	@GetMapping("/all")
	public List<Map<String, Object>> listar(){
	 return prestamoService.readAll2();	
	}
	@PostMapping("/add")
	public int guardar(@RequestBody Prestamo prestamo){
	 return prestamoService.create(prestamo);	
	}
	}
