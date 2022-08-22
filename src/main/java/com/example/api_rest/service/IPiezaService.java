package com.example.api_rest.service;

import java.util.List;

import com.example.api_rest.dto.Pieza;

public interface IPiezaService {
	
	public List<Pieza> listarPiezas();
	
	public Pieza guardarPieza(Pieza pieza);
	
	public Pieza piezaXID(int id);
	
	public Pieza actualizarPieza(int id, Pieza pieza);
	
	public void eliminarPieza(int id);
}
