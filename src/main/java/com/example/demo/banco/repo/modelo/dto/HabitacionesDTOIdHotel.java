package com.example.demo.banco.repo.modelo.dto;

import java.util.List;

import com.example.demo.banco.repo.IHotelRepo;
import com.example.demo.banco.repo.modelo.Habitacion;
import com.example.demo.banco.repo.modelo.Hotel;

public class HabitacionesDTOIdHotel extends Hotel{

	private String numero;


	
	
	public HabitacionesDTOIdHotel(String numero) {
		super();
		this.numero = numero;
	}

	public HabitacionesDTOIdHotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Get y set
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "HabitacionesDTOIdHotel [numero=" + numero + "]";
	}

	
	



	
	


	
	
	
}
