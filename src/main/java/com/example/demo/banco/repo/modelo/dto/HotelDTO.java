package com.example.demo.banco.repo.modelo.dto;

public class HotelDTO {

	private String nombre;

	public HotelDTO() {
		super();
	}

	public HotelDTO(String nombre) {
		super();
		this.nombre = nombre;
	}

	//get y set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "HotelDTO [nombre=" + nombre + "]";
	}
	
	
}
