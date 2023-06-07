package com.example.demo.matricula.repo.modelo;

import org.springframework.stereotype.Component;

@Component
public class Estudiante {
	
	private String cedula;
	private String nombre;
	private String apellido;
	
	//gets y sets
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	@Override
	public String toString() {
		return "Estudiante [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	

}
