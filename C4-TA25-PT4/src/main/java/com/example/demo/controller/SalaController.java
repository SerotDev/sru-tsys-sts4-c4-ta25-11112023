package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Sala;
import com.example.demo.services.SalaServiceImpl;

@RestController
@RequestMapping("/api/v1")
public class SalaController {
	
	@Autowired
	SalaServiceImpl salaServideImpl;
	
	@GetMapping("/salas")
	public List<Sala> listarSalas(){
		return salaServideImpl.listarSalas();
	}
	
	@PostMapping("/salas")
	public Sala salvarSala(@RequestBody Sala sala) {
		return salaServideImpl.guardarSala(sala);
	}
	
	@GetMapping("/salas/{codigo}")
	public Sala salaXCODIGO(@PathVariable(name="codigo") Integer codigo) {
		Sala sala_x_codigo= new Sala();
		sala_x_codigo = salaServideImpl.salaXCODIGO(codigo);
		System.out.println("Sala X codigo: " + sala_x_codigo);
		return sala_x_codigo;
	}
	
	@PutMapping("/salas/{codigo}")
	public Sala actualizarSala(@PathVariable(name="codigo")Integer codigo,@RequestBody Sala sala) {
		Sala sala_seleccionado= new Sala();
		Sala sala_actualizado= new Sala();
		
		sala_seleccionado= salaServideImpl.salaXCODIGO(codigo);
		
		sala_seleccionado.setCodigo(sala.getCodigo());
		sala_seleccionado.setNombre(sala.getNombre());
		sala_seleccionado.setPelicula(sala.getPelicula());
		
		sala_actualizado = salaServideImpl.actualizarSala(sala_seleccionado);
		
		System.out.println("El sala actualizado es: " + sala_actualizado);
		return sala_actualizado;
	}
	
	@DeleteMapping("/salas/{codigo}")
	public void eleiminarSala(@PathVariable(name="codigo")Integer codigo) {
		salaServideImpl.eliminarSala(codigo);
	}
	
	
}

