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

import com.example.demo.dto.Almacen;
import com.example.demo.services.AlmacenServiceImpl;

@RestController
@RequestMapping("/api/v1")
public class AlmacenController {
	
	@Autowired
	AlmacenServiceImpl almacenServideImpl;
	
	@GetMapping("/almacenes")
	public List<Almacen> listarAlmacenes(){
		return almacenServideImpl.listarAlmacenes();
	}
	
	@PostMapping("/almacenes")
	public Almacen salvarAlmacen(@RequestBody Almacen almacen) {
		
		return almacenServideImpl.guardarAlmacen(almacen);
	}
	
	@GetMapping("/almacenes/{codigo}")
	public Almacen almacenXCODIGO(@PathVariable(name="codigo") Integer codigo) {
		
		Almacen almacen_x_codigo= new Almacen();
		
		almacen_x_codigo=almacenServideImpl.almacenXCODIGO(codigo);
		
		System.out.println("Almacen X codigo: " + almacen_x_codigo);
		
		return almacen_x_codigo;
	}
	
	@PutMapping("/almacenes/{codigo}")
	public Almacen actualizarAlmacen(@PathVariable(name="codigo")Integer codigo,@RequestBody Almacen almacen) {
		
		Almacen almacen_seleccionado= new Almacen();
		Almacen almacen_actualizado= new Almacen();
		
		almacen_seleccionado= almacenServideImpl.almacenXCODIGO(codigo);
		
		almacen_seleccionado.setCodigo(almacen.getCodigo());
		almacen_seleccionado.setLugar(almacen.getLugar());
		almacen_seleccionado.setCapacidad(almacen.getCapacidad());
		
		almacen_actualizado = almacenServideImpl.actualizarAlmacen(almacen_seleccionado);
		
		System.out.println("El almacen actualizado es: "+ almacen_actualizado);
		
		return almacen_actualizado;
	}
	
	@DeleteMapping("/almacenes/{codigo}")
	public void eleiminarAlmacen(@PathVariable(name="codigo")Integer codigo) {
		almacenServideImpl.eliminarAlmacen(codigo);
	}
	
	
}

