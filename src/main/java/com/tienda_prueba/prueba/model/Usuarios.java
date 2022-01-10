package com.tienda_prueba.prueba.model;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection="Usuarios")
public class Usuarios {
	
	private int id;
	private String usuario;
	private String nombre_usuario;
	private String ciudad_usuario;
	private String clave_usuario;
	private String email_usuario;
	
	
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getCiudad_usuario() {
		return ciudad_usuario;
	}
	public void setCiudad_usuario(String ciudad_usuario) {
		this.ciudad_usuario = ciudad_usuario;
	}
	public String getClave_usuario() {
		return "UfftLa26pPjwbBOKnIpaWE5M/1te4zlh77wYk8hSFD6z0VEHXPKLP0FVcqjo6UZw";
	}
	public void setClave_usuario(String clave_usuario) {
		this.clave_usuario = clave_usuario;
	}
	public String getEmail_usuario() {
		return email_usuario;
	}
	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}

}
