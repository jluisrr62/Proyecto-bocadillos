package com.example.demo.modelo;

import java.util.HashSet;
import java.util.Set;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name = "usuarios")
public class Rol {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "nombre")
	private String nombre;

	@Column (name="username")
	private String username;
	
	@ManyToMany(mappedBy = "roles", fetch = FetchType.EAGER)
	private Set<Usuario> usuarios;
	
	public Rol(String nombre) {
		this.nombre = nombre;
		usuarios = new HashSet <Usuario>();
	}
	
	public Rol() {
		usuarios = new HashSet <Usuario>();
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Set<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	@Override
	public String toString() {

		return  "Usuario [id=" + id + ", nombre=" + nombre + "]"+"\n";

	}

	
}