package com.tienda_prueba.prueba.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.tienda_prueba.prueba.model.Clientes;

@Repository
public interface ClientesRepository extends MongoRepository<Clientes, Integer>{

}
