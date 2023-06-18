package com.example.demo.banco.repo;

import javax.management.MBeanServerFactory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.example.demo.banco.repo.modelo.Habitacion;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class HabitacionRepoImpl implements IHabitacionRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Habitacion hotel) {
		this.entityManager.persist(hotel);
	}

	@Override
	public Habitacion seleccionarPorId(Integer id) {
		return this.entityManager.find(Habitacion.class, id);
	}

	@Override
	public void actualizar(Habitacion habitacion) {
		this.entityManager.merge(habitacion);

	}

	@Override
	public void eliminarPorId(Integer id) {
		Habitacion habitacion = this.seleccionarPorId(id);
		this.entityManager.remove(habitacion);
	}

}
