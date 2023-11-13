package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Sala;

public interface ISalaService {
	// Metodos del CRUD
	public List<Sala> listarSalas(); // Listar All

	public Sala guardarSala(Sala sala); // Guarda un sala (CREATE)

	public Sala salaXCODIGO(Integer codigo); // Lee datos de sala (READ)

	public Sala actualizarSala(Sala sala); // Actualiza datos de un sala (UPDATE)

	public void eliminarSala(Integer codigo);// Elimina un sala por codigo (DELETE)
}
