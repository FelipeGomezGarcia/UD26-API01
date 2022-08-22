package com.example.api_rest.service;

import java.util.List;

import com.example.api_rest.dto.Suministra;

public interface ISuministraService {

	public List<Suministra> listarSuministros();
	
	public Suministra guardarSuministro(Suministra suministro);
	
	public Suministra suministroXID(int id);
	
	public Suministra actualizarSuministro(int id, Suministra suministro);
	
	public void eliminarSuministro(int id);
}
