package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ISalaDAO;
import com.example.demo.dto.Sala;

@Service
public class SalaServiceImpl implements ISalaService{
	
	//Utilizamos los metodos de la interface ISalaDAO, parecido a instaciar una clase pero para el CRUD.
	@Autowired
	ISalaDAO iSalaDAO;
	
	@Override
	public List<Sala> listarSalas() {
		
		return iSalaDAO.findAll();
	}

	@Override
	public Sala guardarSala(Sala sala) {
		
		return iSalaDAO.save(sala);
	}

	@Override
	public Sala salaXCODIGO(Integer codigo) {
		
		return iSalaDAO.findById(codigo).get();
	}

	@Override
	public Sala actualizarSala(Sala sala) {
		
		return iSalaDAO.save(sala);
	}

	@Override
	public void eliminarSala(Integer codigo) {
		
		iSalaDAO.deleteById(codigo);
		
	}

}