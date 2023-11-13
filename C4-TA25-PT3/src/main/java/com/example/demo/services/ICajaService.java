package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Caja;

public interface ICajaService {
	// Metodos del CRUD
	public List<Caja> listarCajas(); // Listar All

	public Caja guardarCaja(Caja caja); // Guarda un caja (CREATE)

	public Caja cajaXNUMREF(String numReferencia); // Lee datos de un caja (READ)

	public Caja actualizarCaja(Caja caja); // Actualiza datos de un caja (UPDATE)

	public void eliminarCaja(String numReferencia);// Elimina el caja por numero de referencia (DELETE)
}
