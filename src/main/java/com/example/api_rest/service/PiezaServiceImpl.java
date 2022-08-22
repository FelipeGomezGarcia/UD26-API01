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
	public Pieza piezaXID(int codigo) {
		// TODO Auto-generated method stub
		return iPiezaDAO.findById(codigo).get();
	}

	@Override
	public Pieza actualizarPieza(int codigo, Pieza pieza) {
		// TODO Auto-generated method stub
		Pieza piezaActualizada = iPiezaDAO.findById(codigo).get();
		
		piezaActualizada.setNombre(pieza.getNombre());
		
		return iPiezaDAO.save(piezaActualizada);
	}

	@Override
	public void eliminarPieza(int codigo) {
		// TODO Auto-generated method stub
		iPiezaDAO.deleteById(codigo);
	}
}
