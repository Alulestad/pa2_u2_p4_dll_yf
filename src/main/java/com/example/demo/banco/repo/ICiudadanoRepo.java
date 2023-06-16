package com.example.demo.banco.repo;

import com.example.demo.banco.repo.modelo.Ciudadano;

public interface ICiudadanoRepo {
	
	//create, read, update delete
	public void insertar(Ciudadano ciudadano);
	public Ciudadano seleccionarPorId(Integer id);
	public void actualizar(Ciudadano ciudadano);
	public void eliminarPorId(Integer id);
	

}
