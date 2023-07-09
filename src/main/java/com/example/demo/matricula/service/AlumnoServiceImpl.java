package com.example.demo.matricula.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.matricula.repo.IAlumnoRepo;
import com.example.demo.matricula.repo.modelo.Alumno;

@Service
public class AlumnoServiceImpl implements IAlumnoService {

	@Autowired
	private IAlumnoRepo iAlumnoRepo;
	
	@Override
	public void agregar(Alumno alumno) {
		this.iAlumnoRepo.insertar(alumno);

	}

	@Override
	public Alumno buscarPorID(Integer id) {
		return this.iAlumnoRepo.seleccionarPorID(id);
	}

	@Override
	public void eliminarPorID(Integer id) {
		this.iAlumnoRepo.eliminarPorID(id);
	}

	@Override
	public void actualizar(Alumno alumno) {
		this.iAlumnoRepo.actualizar(alumno);
	}

}
