package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Pelicula;

public interface IPeliculaService {
	// Metodos del CRUD
	public List<Pelicula> listarPeliculas(); // Listar All

	public Pelicula guardarPelicula(Pelicula pelicula); // Guarda un pelicula (CREATE)

	public Pelicula peliculaXCODIGO(Integer codigo); // Lee datos de un pelicula (READ)

	public Pelicula actualizarPelicula(Pelicula pelicula); // Actualiza datos de un pelicula (UPDATE)

	public void eliminarPelicula(Integer codigo);// Elimina el pelicula por codigo (DELETE)
}
