package com.example.demo.matricula.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.matricula.repo.EstudianteRepo;
import com.example.demo.matricula.repo.modelo.Estudiante;

@Service
public class EstudianteServiceImpl implements EstudianteService {

	@Autowired
	private EstudianteRepo estudianteRepo;

	@Override
	public void guardar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepo.insertar(estudiante);

	}

	@Override
	public Estudiante buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.seleccionarPorCedula(cedula);
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		this.estudianteRepo.eliminar(cedula);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepo.actualizar(estudiante);
	}

	@Override
	public Estudiante buscarPorApellido(String apellido) {
		return this.estudianteRepo.seleccionarPorApellido(apellido);
	}

	@Override
	public Estudiante buscarPorApellidoTyped(String apellido) {

		return this.estudianteRepo.seleccionarPorApellidoTyped(apellido);
	}

	@Override
	public List<Estudiante> reportePorApellido(String apellido) {
		return this.estudianteRepo.seleccionarListaPorApellido(apellido);
	}

	@Override
	public List<Estudiante> reportePorApellidoyNombre(String apellido, String nombre) {
		return this.estudianteRepo.seleccionarListaPorApellidoyNombre(apellido, nombre);
	}

}
