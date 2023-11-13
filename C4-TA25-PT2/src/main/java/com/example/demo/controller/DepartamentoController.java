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

import com.example.demo.dto.Departamento;
import com.example.demo.services.DepartamentoServiceImpl;

@RestController
@RequestMapping("/api/v1")
public class DepartamentoController {
	
	@Autowired
	DepartamentoServiceImpl departamentoServideImpl;
	
	@GetMapping("/departamentos")
	public List<Departamento> listarDepartamentos(){
		return departamentoServideImpl.listarDepartamentos();
	}
	
	@PostMapping("/departamentos")
	public Departamento salvarDepartamento(@RequestBody Departamento departamento) {
		
		return departamentoServideImpl.guardarDepartamento(departamento);
	}
	
	@GetMapping("/departamentos/{codigo}")
	public Departamento departamentoXCODIGO(@PathVariable(name="codigo") Integer codigo) {
		
		Departamento departamento_x_codigo= new Departamento();
		
		departamento_x_codigo=departamentoServideImpl.departamentoXCODIGO(codigo);
		
		System.out.println("Departamento X codigo: " + departamento_x_codigo);
		
		return departamento_x_codigo;
	}
	
	@PutMapping("/departamentos/{codigo}")
	public Departamento actualizarDepartamento(@PathVariable(name="codigo")Integer codigo,@RequestBody Departamento departamento) {
		
		Departamento departamento_seleccionado= new Departamento();
		Departamento departamento_actualizado= new Departamento();
		
		departamento_seleccionado= departamentoServideImpl.departamentoXCODIGO(codigo);
		
		departamento_seleccionado.setCodigo(departamento.getCodigo());
		departamento_seleccionado.setNombre(departamento.getNombre());
		departamento_seleccionado.setPresupuesto(departamento.getPresupuesto());
		
		departamento_actualizado = departamentoServideImpl.actualizarDepartamento(departamento_seleccionado);
		
		System.out.println("El departamento actualizado es: "+ departamento_actualizado);
		
		return departamento_actualizado;
	}
	
	@DeleteMapping("/departamentos/{codigo}")
	public void eleiminarDepartamento(@PathVariable(name="codigo")Integer codigo) {
		departamentoServideImpl.eliminarDepartamento(codigo);
	}
	
	
}

