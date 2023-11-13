package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IAlmacenDAO;
import com.example.demo.dto.Almacen;

@Service
public class AlmacenServiceImpl implements IAlmacenService{
	
	//Utilizamos los metodos de la interface IAlmacenDAO, parecido a instaciar una clase pero para el CRUD.
	@Autowired
	IAlmacenDAO iAlmacenDAO;
	
	@Override
	public List<Almacen> listarAlmacenes() {
		
		return iAlmacenDAO.findAll();
	}

	@Override
	public Almacen guardarAlmacen(Almacen almacen) {
		
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public Almacen almacenXCODIGO(Integer codigo) {
		
		return iAlmacenDAO.findById(codigo).get();
	}

	@Override
	public Almacen actualizarAlmacen(Almacen almacen) {
		
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public void eliminarAlmacen(Integer codigo) {
		
		iAlmacenDAO.deleteById(codigo);
	}

}