package com.example.demo.banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.repo.IMatriculaRepo;
import com.example.demo.banco.repo.modelo.Matricula;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepo iMatriculaRepo;
	
	@Override
	public void guardar(Matricula matricula) {
		this.iMatriculaRepo.insertar(matricula);
	}

}
