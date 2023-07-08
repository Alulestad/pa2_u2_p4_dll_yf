package com.example.demo.banco.repo.modelo.dto;

import java.util.List;

import com.example.demo.banco.repo.modelo.Habitacion;

public class HotelDTOHabitaciones {

	List<Habitacion> habitaciones;

	
	
	public HotelDTOHabitaciones(List<Habitacion> habitaciones) {
		super();
		this.habitaciones = habitaciones;
	}

	public HotelDTOHabitaciones() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Habitacion> getHabitacions() {
		return habitaciones;
	}

	public void setHabitacions(List<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	@Override
	public String toString() {
		return "HotelDTOHabitaciones [habitacions=" + habitaciones + "]";
	}
	
	
}
