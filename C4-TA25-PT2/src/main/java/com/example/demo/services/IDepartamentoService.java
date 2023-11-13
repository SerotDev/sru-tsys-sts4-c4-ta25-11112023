package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Departamento;

public interface IDepartamentoService {
	// Metodos del CRUD
	public List<Departamento> listarDepartamentos(); // Listar All

	public Departamento guardarDepartamento(Departamento departamento); // Guarda un departamento (CREATE)

	public Departamento departamentoXCODIGO(Integer codigo); // Lee datos de departamento (READ)

	public Departamento actualizarDepartamento(Departamento departamento); // Actualiza datos de un departamento (UPDATE)

	public void eliminarDepartamento(Integer codigo);// Elimina un departamento por codigo (DELETE)
}
