package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Empleado;

public interface IEmpleadoService {
	// Metodos del CRUD
	public List<Empleado> listarEmpleados(); // Listar All

	public Empleado guardarEmpleado(Empleado empleado); // Guarda un empleado (CREATE)

	public Empleado empleadoXDNI(String dni); // Lee datos de un empleado (READ)

	public Empleado actualizarEmpleado(Empleado empleado); // Actualiza datos de un empleado (UPDATE)

	public void eliminarEmpleado(String dni);// Elimina el empleado por id/(codigo) (DELETE)
}
