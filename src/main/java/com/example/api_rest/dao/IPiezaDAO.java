package com.example.api_rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api_rest.dto.Pieza;

public interface IPiezaDAO extends JpaRepository<Pieza, Integer>{

}
