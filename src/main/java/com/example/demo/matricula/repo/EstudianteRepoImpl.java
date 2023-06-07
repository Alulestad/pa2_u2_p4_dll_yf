package com.example.demo.matricula.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.matricula.repo.modelo.Estudiante;

@Repository
public class EstudianteRepoImpl implements EstudianteRepo {

	private static List<Estudiante> baseDatos= new ArrayList<>();
	
	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		
		baseDatos.add(estudiante);

	}

}
