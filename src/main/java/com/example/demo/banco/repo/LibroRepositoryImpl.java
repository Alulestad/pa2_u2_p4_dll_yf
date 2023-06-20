package com.example.demo.banco.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.repo.modelo.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class LibroRepositoryImpl implements ILibroRepository{
	
	@PersistenceContext
	private EntityManager entityManager;
	

	@Override
	public void insertar(Libro libro) {
        this.entityManager.persist(libro);		
	}

	@Override
	public void actualizar(Libro libro) {
		this.entityManager.merge(libro);
		
	}

	@Override
	public Libro seleccionarPorId(Integer id) {
		Libro libro= this.entityManager.find(Libro.class, id);
		
		return libro;
	}

	@Override
	public void eliminarPorId(Integer id) {
		Libro libro= this.entityManager.find(Libro.class, id);
		
		this.entityManager.remove(libro);
	}

}
