package com.example.demo.banco.service;

import com.example.demo.banco.repo.modelo.Ciudadano;
import com.example.demo.banco.repo.modelo.Empleado;

public interface IEmpleadoService {

	//CRUD: create, read, update, delete
	public void agregar(Empleado empleado);
	public Empleado buscarPorId(Integer id);
	public void actualizar(Empleado empleado);
	public void borrarPorId(Integer id);
	
}
