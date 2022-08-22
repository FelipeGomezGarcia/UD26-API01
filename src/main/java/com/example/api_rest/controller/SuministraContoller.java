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

import com.example.api_rest.dto.Suministra;
import com.example.api_rest.service.SuministraServiceImpl;

@RestController
@RequestMapping("/api")
public class SuministraContoller {

	@Autowired
	SuministraServiceImpl suministraServiceImpl;
	
	@GetMapping("/suministros")
	public List<Suministra> listarSuminitros(){
		return suministraServiceImpl.listarSuministros();
	}
	
	@GetMapping("/suministros/{id}")
	public Suministra suministroXID(@PathVariable(name="id")int id) {
		return suministraServiceImpl.suministroXID(id);
	}
	
	@PostMapping("/suministros")
	public Suministra guardarSuministro(@RequestBody Suministra suministro) {
		return suministraServiceImpl.guardarSuministro(suministro);
	}
	
	@PutMapping("/suministros/{id}")
	public Suministra actualizarSuministro(@PathVariable(name="id") int id, @RequestBody Suministra suministro) {
		return suministraServiceImpl.actualizarSuministro(id, suministro);
	}
	
	@DeleteMapping("/suministros/{id}")
	public void eliminarSuministro(@PathVariable(name="id") int id) {
		suministraServiceImpl.eliminarSuministro(id);
	}
}
