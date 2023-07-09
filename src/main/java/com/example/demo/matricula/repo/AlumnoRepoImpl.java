package com.example.demo.matricula.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.matricula.repo.modelo.Alumno;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AlumnoRepoImpl implements IAlumnoRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Alumno alumno) {
		this.entityManager.persist(alumno);

	}

	@Override
	public Alumno seleccionarPorID(Integer id) {

		return this.entityManager.find(Alumno.class, id);
	}

	@Override
	public void eliminarPorID(Integer id) {

		Alumno alumno=this.seleccionarPorID(id);
		this.entityManager.remove(alumno);
	}

	@Override
	public void actualizar(Alumno alumno) {
		this.entityManager.merge(alumno);

	}

}
