package com.billston.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.billston.model.Persona;
import com.billston.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer>{
	Usuario findByNombre(String nombre);
}
