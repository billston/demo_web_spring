package com.billston.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.billston.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{
	
}
