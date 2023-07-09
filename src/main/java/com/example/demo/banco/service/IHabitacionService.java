package com.example.demo.banco.service;

import com.example.demo.banco.repo.modelo.Habitacion;
import com.example.demo.banco.repo.modelo.dto.HabitacionesDTOIdHotel;

public interface IHabitacionService {

	// create, read, update delete
	public void agregar(Habitacion hotel);

	public Habitacion buscarPorId(Integer id);

	public void actualizar(Habitacion habitacion);

	public void borrarPorId(Integer id);
	
	public HabitacionesDTOIdHotel reporteNumeroHabitacionesPorIDHotel(Integer id);
}
