package com.example.demo.matricula.service;

import java.util.List;

import com.example.demo.matricula.repo.modelo.Estudiante;

public interface EstudianteService {

	public void guardar(Estudiante estudiante);

	public Estudiante buscarPorCedula(String cedula);

	public void borrar(String cedula);

	public void actualizar(Estudiante estudiante);

	public Estudiante buscarPorApellido(String apellido);
	
	public Estudiante buscarPorApellidoTyped(String apellido);
	
	public List<Estudiante> reportePorApellidoyNombre(String apellido,String nombre);
	
	public List<Estudiante> reportePorApellido(String apellido);
	
	

}
