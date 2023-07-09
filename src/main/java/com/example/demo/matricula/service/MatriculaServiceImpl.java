package com.example.demo.matricula.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.matricula.repo.IMatriculaRepo;
import com.example.demo.matricula.repo.modelo.Matricula;

import jakarta.persistence.PersistenceContext;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepo iMatriculaRepo;

	@Override
	public void agregar(Matricula matricula) {
		this.iMatriculaRepo.insertar(matricula);
	}

	@Override
	public Matricula buscarPorID(Integer id) {

		return this.iMatriculaRepo.seleccionarPorID(id);
	}

	@Override
	public void eliminarPorID(Integer id) {
		this.iMatriculaRepo.eliminarPorID(id);
	}

	@Override
	public void actualizar(Matricula matricula) {
		this.iMatriculaRepo.actualizar(matricula);
	}

}
