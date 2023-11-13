package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Almacen;

public interface IAlmacenService {
	// Metodos del CRUD
	public List<Almacen> listarAlmacenes(); // Listar All

	public Almacen guardarAlmacen(Almacen almacen); // Guarda un almacen (CREATE)

	public Almacen almacenXCODIGO(Integer codigo); // Lee datos de almacen (READ)

	public Almacen actualizarAlmacen(Almacen almacen); // Actualiza datos de un almacen (UPDATE)

	public void eliminarAlmacen(Integer codigo);// Elimina un almacen por codigo (DELETE)
}
