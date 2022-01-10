package com.tienda_prueba.prueba.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.tienda_prueba.prueba.dto.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import com.tienda_prueba.prueba.model.*;
import com.tienda_prueba.prueba.repository.*;

@RestController
public class UserController {
	
	@Autowired
	private UsuarioRepository repository;

	@PostMapping("user")
	public User login(@RequestParam("user") String username, @RequestParam("password") String pwd) {
		if (validaUsuario(username, pwd)==1) {
			System.out.println("Entraaaaa");
			String token = getJWTToken(username);
			User user = new User();
			user.setUser(username);
			user.setToken(token);		
			return user;
		}
		else {
			System.out.println(" Nooooo Entraaaaa");
			User user = new User();
			user.setUser("otro");		
			return user;
		}
	}

	private String getJWTToken(String username) {
		String secretKey = "mySecretKey";
		List<GrantedAuthority> grantedAuthorities = AuthorityUtils
				.commaSeparatedStringToAuthorityList("ROLE_USER");
		
		String token = Jwts
				.builder()
				.setId("softtekJWT")
				.setSubject(username)
				.claim("authorities",
						grantedAuthorities.stream()
								.map(GrantedAuthority::getAuthority)
								.collect(Collectors.toList()))
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 600000))
				.signWith(SignatureAlgorithm.HS512,
						secretKey.getBytes()).compact();

		return "Bearer " + token;
	}
	
	public int validaUsuario(String usuario, String password) {
		System.out.println(getUsuarios(usuario));
		if (getUsuarios(usuario).isEmpty()) {
			return 0;
		}
		return 1;
	}
	public Optional<Usuarios> getUsuarios(@PathVariable String usuario){
		
		return repository.findByUsuario(usuario);
		
	}
}
