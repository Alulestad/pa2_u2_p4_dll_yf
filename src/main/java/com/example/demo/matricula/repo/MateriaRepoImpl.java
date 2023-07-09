package com.example.demo.matricula.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.matricula.repo.modelo.Materia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MateriaRepoImpl implements IMateriaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Materia materia) {
		this.entityManager.persist(materia);

	}

	@Override
	public Materia seleccionarPorID(Integer id) {
		return this.entityManager.find(Materia.class, id);
	}

	@Override
	public void eliminarPorID(Integer id) {
		Materia materia=this.seleccionarPorID(id);
		this.entityManager.remove(materia);
	}

	@Override
	public void actualizar(Materia materia) {
		
		this.entityManager.merge(materia);
		
	}

}
