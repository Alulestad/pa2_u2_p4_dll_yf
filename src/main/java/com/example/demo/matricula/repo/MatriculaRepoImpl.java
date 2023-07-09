package com.example.demo.matricula.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.matricula.repo.modelo.Matricula;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MatriculaRepoImpl implements IMatriculaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Matricula matricula) {
		this.entityManager.persist(matricula);

	}

	@Override
	public Matricula seleccionarPorID(Integer id) {
		
		return this.entityManager.find(Matricula.class, id);
	}

	@Override
	public void eliminarPorID(Integer id) {
		Matricula matricula=this.seleccionarPorID(id);
		this.entityManager.remove(matricula);
	}

	@Override
	public void actualizar(Matricula matricula) {
		this.entityManager.merge(matricula);

	}

}
