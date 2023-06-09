package com.example.demo.matricula.service;

import java.util.List;

import com.example.demo.matricula.repo.modelo.Estudiante;
import com.example.demo.matricula.repo.modelo.dto.EstudianteDTO;

public interface EstudianteService {

	public void guardar(Estudiante estudiante);

	public Estudiante buscarPorCedula(String cedula);

	public void borrar(String cedula);

	public void actualizar(Estudiante estudiante);

	public Estudiante buscarPorApellido(String apellido);

	public Estudiante buscarPorApellidoTyped(String apellido);

	public List<Estudiante> reportePorApellidoyNombre(String apellido, String nombre);

	public List<Estudiante> reportePorApellido(String apellido);

	public Estudiante buscarPorApellidoNamedTypedQuery(String apellido);

	public Estudiante buscarPorApellidoNamedQuery(String apellido);

	public Estudiante buscarPorApellidoNativeQuery(String apellido);

	public Estudiante buscarPorApellidoNamedNativeQuery(String apellido);

	public Estudiante buscarPorNombreNamedQuery(String nombre);

	public Estudiante buscarPorNombreNamedNativeQuery(String nombre);

	public Estudiante buscarPorApellidoCriteriaAPIQuery(String apellido);

	public Estudiante buscarEstudianteDinamico(String nombre, String apellido, Double peso);

	public int eliminarPorNombre(String nombre);

	public int actualizarPorApellido(String nombre, String apellido);

	// DTO
	public List<EstudianteDTO> buscarTodosDTO();
}
