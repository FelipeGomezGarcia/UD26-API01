package com.example.api_rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api_rest.dao.IProveedorDAO;
import com.example.api_rest.dto.Proveedor;

@Service
public class ProveedorServiceImpl implements IProveedorService{
	
	@Autowired
	IProveedorDAO iProveedoreDAO;

	@Override
	public List<Proveedor> listarProveedores() {
		// TODO Auto-generated method stub
		return iProveedoreDAO.findAll();
	}

	@Override
	public Proveedor guardarProveedor(Proveedor proveedor) {
		// TODO Auto-generated method stub
		return iProveedoreDAO.save(proveedor);
	}

	@Override
	public Proveedor proveedorXID(String id) {
		// TODO Auto-generated method stub
		return iProveedoreDAO.findById(id).get();
	}

	@Override
	public Proveedor actualizarProveedor(String id, Proveedor proveedor) {
		// TODO Auto-generated method stub
		Proveedor proveedorActualizado = iProveedoreDAO.findById(id).get();
		
		proveedorActualizado.setNombre(proveedor.getNombre());
		
		return iProveedoreDAO.save(proveedorActualizado);
	}

	@Override
	public void eliminarProveedor(String id) {
		// TODO Auto-generated method stub
		iProveedoreDAO.deleteById(id);
	}
}
