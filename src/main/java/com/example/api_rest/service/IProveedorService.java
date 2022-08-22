package com.example.api_rest.service;

import java.util.List;

import com.example.api_rest.dto.Proveedor;

public interface IProveedorService {

	public List<Proveedor> listarProveedores();
	
	public Proveedor guardarProveedor(Proveedor proveedor);
	
	public Proveedor proveedorXID(String id);
	
	public Proveedor actualizarProveedor(String id, Proveedor proveedor);
	
	public void eliminarProveedor(String id);
}
