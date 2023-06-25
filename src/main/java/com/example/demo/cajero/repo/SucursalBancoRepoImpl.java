package com.example.demo.cajero.repo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.example.demo.cajero.repo.modelo.SucursalBanco;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SucursalBancoRepoImpl implements ISucursalBancoRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(SucursalBanco sucursalBanco) {
		this.entityManager.persist(sucursalBanco);

	}

	@Override
	public SucursalBanco seleccionarPorId(Integer id) {
		
		return this.entityManager.find(SucursalBanco.class, id);
	}

	@Override
	public void actualizar(SucursalBanco sucursalBanco) {
		this.entityManager.merge(sucursalBanco);

	}

	@Override
	public void eliminarPorId(Integer id) {
		SucursalBanco sucursalBanco1=this.seleccionarPorId(id);
		this.entityManager.remove(sucursalBanco1);

	}

	@Override
	public SucursalBanco seleccionarPorFechaApertura(LocalDateTime fecha) {
		Query query=this.entityManager.createQuery("select sb from SucursalBanco sb where "
				+ "sb.fechaApertura=:datoFechaApertura");
		query.setParameter("datoFechaApertura", fecha);
		
		
		
		return (SucursalBanco)query.getSingleResult();
	}

	@Override
	public List<SucursalBanco> seleccionarTodosPorFechaApertura(LocalDateTime fecha) {
		Query query=this.entityManager.createQuery("select sb from SucursalBanco sb where "
				+ "sb.fechaApertura=:datoFechaApertura");
		query.setParameter("datoFechaApertura", fecha);
		
		return query.getResultList();
	}

	@Override
	public SucursalBanco seleccionarPorFechaAperturaTyped(LocalDateTime fecha) {
		TypedQuery<SucursalBanco> typedQuery=this.entityManager.createQuery(""
				+ "select sb from SucursalBanco sb where "
				+ "sb.fechaApertura=:datoFechaApertura",SucursalBanco.class);
		typedQuery.setParameter("datoFechaApertura", fecha);
		
		return typedQuery.getSingleResult();
	}

	@Override
	public List<SucursalBanco> seleccionarTodosPorFechaAperturaTyped(LocalDateTime fecha) {
		TypedQuery<SucursalBanco> typedQuery=this.entityManager.createQuery(""
				+ "select sb from SucursalBanco sb where "
				+ "sb.fechaApertura=:datoFechaApertura",SucursalBanco.class);
		typedQuery.setParameter("datoFechaApertura", fecha);
		
		return typedQuery.getResultList();
	}

}
