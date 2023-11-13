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

import com.example.demo.dto.Pelicula;
import com.example.demo.services.PeliculaServiceImpl;

@RestController
@RequestMapping("/api/v1")
public class PeliculaController {

	@Autowired
	PeliculaServiceImpl peliculaServideImpl;
	
	@GetMapping("/peliculas")
	public List<Pelicula> listarPeliculas(){
		return peliculaServideImpl.listarPeliculas();
	}
	
	@PostMapping("/peliculas")
	public Pelicula salvarPelicula(@RequestBody Pelicula pelicula) {
		return peliculaServideImpl.guardarPelicula(pelicula);
	}
	
	@GetMapping("/peliculas/{codigo}")
	public Pelicula peliculaXCODIGO(@PathVariable(name="codigo") Integer codigo) {
		Pelicula pelicula_x_codigo= new Pelicula();
		pelicula_x_codigo = peliculaServideImpl.peliculaXCODIGO(codigo);
		System.out.println("Pelicula X codigo: " + pelicula_x_codigo);
		return pelicula_x_codigo;
	}
	
	@PutMapping("/peliculas/{codigo}")
	public Pelicula actualizarPelicula(@PathVariable(name="codigo")Integer codigo,@RequestBody Pelicula pelicula) {
		
		Pelicula pelicula_seleccionado= new Pelicula();
		Pelicula pelicula_actualizado= new Pelicula();
		
		pelicula_seleccionado= peliculaServideImpl.peliculaXCODIGO(codigo);
		
		pelicula_seleccionado.setCodigo(pelicula.getCodigo());
		pelicula_seleccionado.setNombre(pelicula.getNombre());
		pelicula_seleccionado.setCalificacion(pelicula.getCalificacion());
		
		pelicula_actualizado = peliculaServideImpl.actualizarPelicula(pelicula_seleccionado);
		
		System.out.println("El pelicula actualizado es: " + pelicula_actualizado);
		
		return pelicula_actualizado;
	}
	
	@DeleteMapping("/peliculas/{codigo}")
	public void eliminarPelicula(@PathVariable(name="codigo")Integer codigo) {
		peliculaServideImpl.eliminarPelicula(codigo);
	}
	
}

