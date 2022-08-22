package com.example.api_rest.service;

import java.util.List;

import com.example.api_rest.dto.Pieza;

public interface IPiezaService {
	
	public List<Pieza> listarPiezas();
	
	public Pieza guardarPieza(Pieza pieza);
	
	public Pieza piezaXID(int codigo);
	
	public Pieza actualizarPieza(int codigo, Pieza pieza);
	
	public void eliminarPieza(int codigo);
}
