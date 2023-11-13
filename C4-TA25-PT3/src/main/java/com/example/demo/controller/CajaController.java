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

import com.example.demo.dto.Caja;
import com.example.demo.services.CajaServiceImpl;

@RestController
@RequestMapping("/api/v1")
public class CajaController {

	@Autowired
	CajaServiceImpl cajaServideImpl;
	
	@GetMapping("/cajas")
	public List<Caja> listarCajas(){
		return cajaServideImpl.listarCajas();
	}
	
	@PostMapping("/cajas")
	public Caja salvarCaja(@RequestBody Caja caja) {
		
		return cajaServideImpl.guardarCaja(caja);
	}
	
	@GetMapping("/cajas/{numReferencia}")
	public Caja cajaXNUMREF(@PathVariable(name="numReferencia") String numReferencia) {
		
		Caja caja_x_numRef= new Caja();
		
		caja_x_numRef = cajaServideImpl.cajaXNUMREF(numReferencia);
		
		System.out.println("Caja X numero de referencia: " + caja_x_numRef);
		
		return caja_x_numRef;
	}
	
	@PutMapping("/cajas/{numReferencia}")
	public Caja actualizarCaja(@PathVariable(name="numReferencia")String numReferencia,@RequestBody Caja caja) {
		
		Caja caja_seleccionado= new Caja();
		Caja caja_actualizado= new Caja();
		
		caja_seleccionado= cajaServideImpl.cajaXNUMREF(numReferencia);
		
		caja_seleccionado.setNumReferencia(caja.getNumReferencia());
		caja_seleccionado.setContenido(caja.getContenido());
		caja_seleccionado.setValor(caja.getValor());
		caja_seleccionado.setAlmacen(caja.getAlmacen());
		
		caja_actualizado = cajaServideImpl.actualizarCaja(caja_seleccionado);
		
		System.out.println("El caja actualizado es: " + caja_actualizado);
		
		return caja_actualizado;
	}
	
	@DeleteMapping("/cajas/{numReferencia}")
	public void eliminarCaja(@PathVariable(name="numReferencia")String numReferencia) {
		cajaServideImpl.eliminarCaja(numReferencia);
	}
	
}

