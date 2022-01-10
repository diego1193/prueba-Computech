package com.tienda_prueba.prueba.resource;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tienda_prueba.prueba.model.*;
import com.tienda_prueba.prueba.repository.*;

@RestController
public class UsuariosController {

	@Autowired
	private UsuarioRepository repository;
	
	@PostMapping("/register")
	public String saveUser(@RequestBody Usuarios usuario) {
		repository.save(usuario);
		return "Usuario creado con exito";
	}
	
	@GetMapping("/findAllUsuarios")
	public List<Usuarios> getUsuarios(){
		return repository.findAll();
	}
	
	@GetMapping("/findAllUsuarios/{id}")
	public Optional<Usuarios> getUsuarios(@PathVariable int id){
		return repository.findById(id);
	}
	
	@DeleteMapping("/deleteUsuario/{id}")
	public String deleteUser(@PathVariable int id) {
		repository.deleteById(id);
		return "Usuario eliminado con exito N." + id;
	}
}
