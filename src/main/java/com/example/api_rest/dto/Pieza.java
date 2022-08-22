package com.example.api_rest.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Piezas")
public class Pieza {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany
	@JoinColumn(name ="codigo")
	private List<Suministra> suministros;

	/**
	 * 
	 */
	public Pieza() {
		
	}

	/**
	 * @param codigo
	 * @param nombre
	 * @param suministros
	 */
	public Pieza(int codigo, String nombre, List<Suministra> suministros) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.suministros = suministros;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
		return "Pieza [codigo=" + codigo + ", nombre=" + nombre +"]";
	}
	
		
}
