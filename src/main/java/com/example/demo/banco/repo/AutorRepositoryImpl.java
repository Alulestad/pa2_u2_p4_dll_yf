package com.example.demo.banco.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.repo.modelo.Autor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AutorRepositoryImpl implements IAutorRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Autor autor) {
		this.entityManager.persist(autor);
	}

	@Override
	public void actualizar(Autor autor) {
		this.entityManager.merge(autor);
	}

	@Override
	public Autor seleccionarPorId(Integer id) {
		Autor autor= this.entityManager.find(Autor.class, id);
		return autor;
	}

	@Override
	public void eliminarPorId(Integer id) {
		Autor autor= this.entityManager.find(Autor.class, id);
		this.entityManager.remove(autor);
		
	}

}
