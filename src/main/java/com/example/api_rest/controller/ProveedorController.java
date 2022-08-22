package com.example.api_rest.controller;

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

import com.example.api_rest.dto.Proveedor;
import com.example.api_rest.service.ProveedorServiceImpl;

@RestController
@RequestMapping("/api")
public class ProveedorController {
	
	@Autowired
	ProveedorServiceImpl proveedorServiceImpl;
	
	@GetMapping("/proveedores")
	public List<Proveedor> listarProveedores(){
		return proveedorServiceImpl.listarProveedores();
	}
	
	@GetMapping("/proveedores/{id}")
	public Proveedor proveedorXID(@PathVariable(name="id")String id) {
		return proveedorServiceImpl.proveedorXID(id);
	}
	
	@PostMapping("/proveedores")
	public Proveedor guardarProveedor(@RequestBody Proveedor proveedor) {
		return proveedorServiceImpl.guardarProveedor(proveedor);
	}
	
	@PutMapping("/proveedores/{id}")
	public Proveedor actualizarProveedor(@PathVariable(name="id") String id, @RequestBody Proveedor proveedor) {
		return proveedorServiceImpl.actualizarProveedor(id, proveedor);
	}
	
	@DeleteMapping("/proveedores/{id}")
	public void eliminarProveedor(@PathVariable(name="id") String id) {
		proveedorServiceImpl.eliminarProveedor(id);
	}
}
