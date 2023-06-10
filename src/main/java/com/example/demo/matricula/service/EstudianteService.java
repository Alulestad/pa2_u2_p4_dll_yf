package com.example.demo.matricula.service;

import com.example.demo.matricula.repo.modelo.Estudiante;

public interface EstudianteService {

	
	public void guardar(Estudiante estudiante);
	public Estudiante buscarPorCedula(String cedula);
	public void borrar(String cedula);
	public void actualizar(Estudiante estudiante);
}
