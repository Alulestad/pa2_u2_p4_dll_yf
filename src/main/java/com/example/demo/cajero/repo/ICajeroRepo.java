package com.example.demo.cajero.repo;

import com.example.demo.cajero.repo.modelo.Cajero;
import com.example.demo.cajero.repo.modelo.SucursalBanco;

public interface ICajeroRepo {

	//create, read, update, delete
	public void insertar(Cajero cajero);
	public Cajero seleccionarPorId(Integer id);
	public void actualizar(Cajero cajero);
	public void eliminarPorId(Integer id);
}
