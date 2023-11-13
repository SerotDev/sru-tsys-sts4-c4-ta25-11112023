package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Fabricante;

public interface IFabricanteService {
	// Metodos del CRUD
	public List<Fabricante> listarFabricantes(); // Listar All

	public Fabricante guardarFabricante(Fabricante fabricante); // Guarda un fabricante (CREATE)

	public Fabricante fabricanteXID(Integer id); // Lee datos de fabricante (READ)

	public Fabricante actualizarFabricante(Fabricante fabricante); // Actualiza datos de un fabricante (UPDATE)

	public void eliminarFabricante(Integer id);// Elimina un fabricante por id/(codigo) (DELETE)
}
