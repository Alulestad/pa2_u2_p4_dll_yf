package com.example.demo.matricula.service;

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

}
