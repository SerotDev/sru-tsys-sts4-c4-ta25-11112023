package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICajaDAO;
import com.example.demo.dto.Caja;

@Service
public class CajaServiceImpl implements ICajaService{

	@Autowired
	ICajaDAO iCajaDAO;
	
	@Override
	public List<Caja> listarCajas() {
		
		return iCajaDAO.findAll();
	}
	
	@Override
	public Caja guardarCaja(Caja caja) {
		
		return iCajaDAO.save(caja);
	}

	@Override
	public Caja cajaXNUMREF(String numReferencia) {
		
		return iCajaDAO.findById(numReferencia).get();
	}

	@Override
	public Caja actualizarCaja(Caja caja) {
		
		return iCajaDAO.save(caja);
	}

	@Override
	public void eliminarCaja(String numReferencia) {
		
		iCajaDAO.deleteById(numReferencia);
		
	}
}
