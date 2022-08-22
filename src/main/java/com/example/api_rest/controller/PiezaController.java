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

import com.example.api_rest.dto.Pieza;
import com.example.api_rest.service.PiezaServiceImpl;

@RestController
@RequestMapping("/api")
public class PiezaController {

	@Autowired
	PiezaServiceImpl piezaServiceImpl;
	
	@GetMapping("/piezas")
	public List<Pieza> listarPiezas(){
		return piezaServiceImpl.listarPiezas();
	}
	
	@GetMapping("/piezas/{codigo}")
	public Pieza piezaXID(@PathVariable(name="codigo")int codigo) {
		return piezaServiceImpl.piezaXID(codigo);
	}
	
	@PostMapping("/piezas")
	public Pieza guardarPieza(@RequestBody Pieza pieza) {
		return piezaServiceImpl.guardarPieza(pieza);
	}
	
	@PutMapping("/piezas/{codigo}")
	public Pieza actualizarPieza(@PathVariable(name="codigo") int codigo, @RequestBody Pieza pieza) {
		return piezaServiceImpl.actualizarPieza(codigo, pieza);
	}
	
	@DeleteMapping("/piezas/{codigo}")
	public void eliminarPieza(@PathVariable(name="codigo") int codigo) {
		piezaServiceImpl.eliminarPieza(codigo);
	}
}
