package com.example.demo.banco.service;

import java.util.List;

import com.example.demo.banco.repo.modelo.Hotel;
import com.example.demo.banco.repo.modelo.dto.HotelDTO;
import com.example.demo.banco.repo.modelo.dto.HotelDTOHabitaciones;

public interface IHotelService {

	// create, read, update delete
	public void agregar(Hotel hotel);

	public Hotel buscarPorId(Integer id);

	public void actualizar(Hotel hotel);

	public void borrarPorId(Integer id);
	
	public HotelDTO buscarPorIdDTO(Integer id);
	
	public Hotel buscarHabitacionesPorIdDTO(Integer id);
}
