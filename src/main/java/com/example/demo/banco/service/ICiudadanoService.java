package com.example.demo.banco.service;

import com.example.demo.banco.repo.modelo.Ciudadano;

public interface ICiudadanoService {
	
	//create, read, update delete
	public void agregar(Ciudadano ciudadano);
	public Ciudadano buscaraPorId(Integer id);
	public void actualizar(Ciudadano ciudadano);
	public void borrarPorId(Integer id);
	

}
