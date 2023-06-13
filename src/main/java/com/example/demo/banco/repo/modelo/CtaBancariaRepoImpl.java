package com.example.demo.banco.repo.modelo;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CtaBancariaRepoImpl implements ICtaBancariaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(CtaBancaria bancaria) {
		this.entityManager.persist(bancaria);

	}

	@Override
	public void actualizar(CtaBancaria bancaria) {
		
		this.entityManager.merge(bancaria);
		
	}

	@Override
	public CtaBancaria seleccionarPorId(Integer id) {
		// TODO Auto-generated method stub
		
		return this.entityManager.find(CtaBancaria.class, id);
	}

}
