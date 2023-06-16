package com.example.demo.banco.repo;

import com.example.demo.banco.repo.modelo.Ciudadano;
import com.example.demo.banco.repo.modelo.Empleado;

public interface IEmpleadoRepo {

	//CRUD: create, read, update, delete
	public void insertar(Empleado empleado);
	public Empleado seleccionarPorId(Integer id);
	public void actualizar(Empleado empleado);
	public void eliminarPorId(Integer id);
	
}
