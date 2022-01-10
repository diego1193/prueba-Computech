package com.tienda_prueba.prueba.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import java.io.Serializable;
import java.util.Optional;

import com.tienda_prueba.prueba.model.Usuarios;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuarios, Serializable> {

	public abstract Optional<Usuarios> findByUsuario(String usuario);
}