package com.example.demo.banco.repo;

import com.example.demo.banco.repo.modelo.Habitacion;
import com.example.demo.banco.repo.modelo.dto.HabitacionesDTOIdHotel;

public interface IHabitacionRepo {

	// create, read, update delete
	public void insertar(Habitacion hotel);

	public Habitacion seleccionarPorId(Integer id);

	public void actualizar(Habitacion habitacion);

	public void eliminarPorId(Integer id);
	
	
	public HabitacionesDTOIdHotel seleccionarTodosNumeroHabitacionesPorIDHotel(Integer id);
}
