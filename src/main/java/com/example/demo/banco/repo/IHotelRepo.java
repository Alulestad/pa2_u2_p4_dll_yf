package com.example.demo.banco.repo;

import com.example.demo.banco.repo.modelo.Hotel;
import com.example.demo.banco.repo.modelo.dto.HotelDTO;

public interface IHotelRepo {

	// create, read, update delete
	public void insertar(Hotel hotel);

	public Hotel seleccionarPorId(Integer id);

	public void actualizar(Hotel hotel);

	public void eliminarPorId(Integer id);
	
	public HotelDTO seleccionarPorIdDTO(Integer id);
	
	public Hotel seleccionarHabitacionesPorId(Integer id);
}
