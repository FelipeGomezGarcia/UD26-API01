package com.example.api_rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api_rest.dao.IPiezaDAO;
import com.example.api_rest.dto.Pieza;

@Service
public class PiezaServiceImpl implements IPiezaService{

	@Autowired
	IPiezaDAO iPiezaDAO;

	@Override
	public List<Pieza> listarPiezas() {
		// TODO Auto-generated method stub
		return iPiezaDAO.findAll();
	}

	@Override
	public Pieza guardarPieza(Pieza pieza) {
		// TODO Auto-generated method stub
		return iPiezaDAO.save(pieza);
	}

	@Override
	public Pieza piezaXID(int id) {
		// TODO Auto-generated method stub
		return iPiezaDAO.findById(id).get();
	}

	@Override
	public Pieza actualizarPieza(int id, Pieza pieza) {
		// TODO Auto-generated method stub
		Pieza piezaActualizada = iPiezaDAO.findById(id).get();
		
		piezaActualizada.setNombre(pieza.getNombre());
		
		return iPiezaDAO.save(piezaActualizada);
	}

	@Override
	public void eliminarPieza(int id) {
		// TODO Auto-generated method stub
		iPiezaDAO.deleteById(id);
	}
}
