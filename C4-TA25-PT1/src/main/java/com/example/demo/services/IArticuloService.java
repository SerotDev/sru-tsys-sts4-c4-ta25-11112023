package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Articulo;

public interface IArticuloService {
	// Metodos del CRUD
	public List<Articulo> listarArticulos(); // Listar All

	public Articulo guardarArticulo(Articulo articulo); // Guarda un articulo (CREATE)

	public Articulo articuloXID(Integer id); // Lee datos de un articulo (READ)

	public Articulo actualizarArticulo(Articulo articulo); // Actualiza datos de un articulo (UPDATE)

	public void eliminarArticulo(Integer id);// Elimina el articulo por id/(codigo) (DELETE)
}
