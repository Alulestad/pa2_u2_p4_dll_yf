package com.example.demo.banco.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.repo.modelo.Ciudadano;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class CiudadanoRepoImpl implements ICiudadanoRepo {

	@PersistenceContext
	public EntityManager entityManager;
	
	@Override
	public void insertar(Ciudadano ciudadano) {
		this.entityManager.persist(ciudadano);
	}

	@Override
	public Ciudadano seleccionarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Ciudadano.class, id);
	}

	@Override
	public void actualizar(Ciudadano ciudadano) {
		this.entityManager.merge(ciudadano);

	}

	@Override
	public void eliminarPorId(Integer id) {
		Ciudadano aEliminar=this.seleccionarPorId(id);
		this.entityManager.remove(aEliminar);

	}

}
