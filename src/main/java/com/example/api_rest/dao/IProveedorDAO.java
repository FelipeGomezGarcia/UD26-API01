package com.example.api_rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api_rest.dto.Proveedor;

public interface IProveedorDAO extends JpaRepository<Proveedor, String>{

}
