package com.example.demo.banco.service;

import com.example.demo.banco.repo.modelo.Habitacion;

public interface IHabitacionService {

	// create, read, update delete
	public void agregar(Habitacion hotel);

	public Habitacion buscarPorId(Integer id);

	public void actualizar(Habitacion habitacion);

	public void borrarPorId(Integer id);
}
