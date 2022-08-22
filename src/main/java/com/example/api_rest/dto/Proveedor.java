package com.example.api_rest.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Proveedores")
public class Proveedor {

	@Id
	@Column(name="id")
	private String id;
	@Column(name="nombre")
	private String nombre;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<Suministra> suministros;

	/**
	 * 
	 */
	public Proveedor() {
		
	}

	/**
	 * @param id
	 * @param nombre
	 * @param suministros
	 */
	public Proveedor(String id, String nombre, List<Suministra> suministros) {
		this.id = id;
		this.nombre = nombre;
		this.suministros = suministros;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the suministros
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Suministra")
	public List<Suministra> getSuministros() {
		return suministros;
	}

	/**
	 * @param suministros the suministros to set
	 */
	public void setSuministros(List<Suministra> suministros) {
		this.suministros = suministros;
	}

	@Override
	public String toString() {
		return "Proveedor [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
}
