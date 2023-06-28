package com.example.demo.matricula.repo;

import java.util.List;

import com.example.demo.matricula.repo.modelo.Estudiante;

public interface EstudianteRepo {

	public void insertar(Estudiante estudiante);

	public Estudiante seleccionarPorCedula(String cedula);

	public void eliminar(String cedula);

	public void actualizar(Estudiante estudiante);
	
	public Estudiante seleccionarPorApellido(String apellido);
	
	public Estudiante seleccionarPorApellidoTyped(String apellido);
	
	public List<Estudiante> seleccionarListaPorApellidoyNombre(String apellido,String nombre);
	
	public List<Estudiante> seleccionarListaPorApellido(String apellido);
	
	public Estudiante seleccionarPorApellidoNamedTypedQuery(String apellido);
	
	public Estudiante seleccionarPorApellidoNamedQuery(String apellido);
	
	public Estudiante seleccionarPorApellidoNativeQuery(String apellido);
	
	public Estudiante seleccionarPorApellidoNamedNativeQuery(String apellido);
	
	public Estudiante seleccionarPorNombreNamedQuery(String nombre);

	public Estudiante seleccionarPorNombreNamedNativeQuery(String nombre);
	
	public Estudiante seleccionarPorApellidoCriteriaAPIQuery(String apellido);

}
