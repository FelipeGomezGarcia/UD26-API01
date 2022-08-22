package com.example.api_rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api_rest.dao.ISuministraDAO;
import com.example.api_rest.dto.Suministra;

@Service
public class SuministraServiceImpl implements ISuministraService{

	@Autowired
	ISuministraDAO iSuministraDAO;

	@Override
	public List<Suministra> listarSuministros() {
		// TODO Auto-generated method stub
		return iSuministraDAO.findAll();
	}

	@Override
	public Suministra guardarSuministro(Suministra suministro) {
		// TODO Auto-generated method stub
		return iSuministraDAO.save(suministro);
	}

	@Override
	public Suministra suministroXID(int id) {
		// TODO Auto-generated method stub
		return iSuministraDAO.findById(id).get();
	}

	@Override
	public Suministra actualizarSuministro(int id, Suministra suministro) {
		// TODO Auto-generated method stub
		Suministra suministroActualizado = iSuministraDAO.findById(id).get();
		
		suministroActualizado.setPieza(suministro.getPieza());
		suministroActualizado.setProveedor(suministro.getProveedor());
		suministroActualizado.setPrecio(suministro.getPrecio());
		
		return iSuministraDAO.save(suministroActualizado);
	}

	@Override
	public void eliminarSuministro(int id) {
		// TODO Auto-generated method stub
		iSuministraDAO.deleteById(id);
	}
}
