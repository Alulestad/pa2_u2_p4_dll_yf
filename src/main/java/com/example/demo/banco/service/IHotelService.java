package com.example.demo.banco.service;

import com.example.demo.banco.repo.modelo.Hotel;

public interface IHotelService {

	// create, read, update delete
	public void agregar(Hotel hotel);

	public Hotel buscarPorId(Integer id);

	public void actualizar(Hotel hotel);

	public void borrarPorId(Integer id);
}
