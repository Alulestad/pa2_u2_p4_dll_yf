package com.example.demo.matricula.repo;

import com.example.demo.matricula.repo.modelo.Estudiante;

public interface EstudianteRepo {
	
	public void insertar(Estudiante estudiante);
	public Estudiante seleccionarPorCedula(String cedula);
	public void eliminar(String cedula);
	public void actualizar(Estudiante estudiante);

}
