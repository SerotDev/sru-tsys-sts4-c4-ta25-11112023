package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDepartamentoDAO;
import com.example.demo.dto.Departamento;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService{
	
	//Utilizamos los metodos de la interface IDepartamentoDAO, parecido a instaciar una clase pero para el CRUD.
	@Autowired
	IDepartamentoDAO iDepartamentoDAO;
	
	@Override
	public List<Departamento> listarDepartamentos() {
		
		return iDepartamentoDAO.findAll();
	}

	@Override
	public Departamento guardarDepartamento(Departamento departamento) {
		
		return iDepartamentoDAO.save(departamento);
	}

	@Override
	public Departamento departamentoXCODIGO(Integer codigo) {
		
		return iDepartamentoDAO.findById(codigo).get();
	}

	@Override
	public Departamento actualizarDepartamento(Departamento departamento) {
		
		return iDepartamentoDAO.save(departamento);
	}

	@Override
	public void eliminarDepartamento(Integer codigo) {
		
		iDepartamentoDAO.deleteById(codigo);
	}

}