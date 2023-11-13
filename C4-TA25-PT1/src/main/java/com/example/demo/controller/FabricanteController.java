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

import com.example.demo.dto.Fabricante;
import com.example.demo.services.FabricanteServiceImpl;

@RestController
@RequestMapping("/api/v1")
public class FabricanteController {
	
	@Autowired
	FabricanteServiceImpl fabricanteServideImpl;
	
	@GetMapping("/fabricantes")
	public List<Fabricante> listarFabricantes(){
		return fabricanteServideImpl.listarFabricantes();
	}
	
	@PostMapping("/fabricantes")
	public Fabricante salvarFabricante(@RequestBody Fabricante fabricante) {
		
		return fabricanteServideImpl.guardarFabricante(fabricante);
	}
	
	@GetMapping("/fabricantes/{id}")
	public Fabricante fabricanteXID(@PathVariable(name="id") Integer id) {
		
		Fabricante fabricante_xid= new Fabricante();
		
		fabricante_xid=fabricanteServideImpl.fabricanteXID(id);
		
		System.out.println("Fabricante XID: "+fabricante_xid);
		
		return fabricante_xid;
	}
	
	@PutMapping("/fabricantes/{id}")
	public Fabricante actualizarFabricante(@PathVariable(name="id")Integer id,@RequestBody Fabricante fabricante) {
		
		Fabricante fabricante_seleccionado= new Fabricante();
		Fabricante fabricante_actualizado= new Fabricante();
		
		fabricante_seleccionado= fabricanteServideImpl.fabricanteXID(id);
		
		fabricante_seleccionado.setId(fabricante.getId());
		fabricante_seleccionado.setNombre(fabricante.getNombre());
		
		fabricante_actualizado = fabricanteServideImpl.actualizarFabricante(fabricante_seleccionado);
		
		System.out.println("El fabricante actualizado es: "+ fabricante_actualizado);
		
		return fabricante_actualizado;
	}
	
	@DeleteMapping("/fabricantes/{id}")
	public void eleiminarFabricante(@PathVariable(name="id")Integer id) {
		fabricanteServideImpl.eliminarFabricante(id);
	}
	
	
}

