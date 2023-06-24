package com.example.demo.matricula.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.matricula.repo.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EstudianteRepoImpl implements EstudianteRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Estudiante estudiante) {
		this.entityManager.persist(estudiante);

	}

	@Override
	public Estudiante seleccionarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Estudiante.class, cedula);
	}

	@Override
	public void eliminar(String cedula) {
		Estudiante estudiante = this.seleccionarPorCedula(cedula);
		this.entityManager.remove(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.merge(estudiante);
	}

	@Override
	public Estudiante seleccionarPorApellido(String apellido) {
		// SQL
		// select * from estudiante e where e.estu_apellido="asdf"
		// select e.estu_nombre from estudiante e where e.estu_apellido="asdf"
		// JPQL
		// select e from Estudiante e where e.apellido="asdf"
		// select e.nombre from Estudiante e where e.apellido="asdf"

		// Creo el Query
		Query myQuery = this.entityManager.createQuery("select e from Estudiante e "
				+ "where e.apellido=:datoApellido");

		// Reemplazo la variable con el parametro apellido
		myQuery.setParameter("datoApellido", apellido);

		return (Estudiante) myQuery.getSingleResult();// Retorname un unico resultado
	}
	
	

	@Override
	public Estudiante seleccionarPorApellidoTyped(String apellido) {
		
		TypedQuery<Estudiante> myQueryTyped=this.entityManager.createQuery("select e from Estudiante e "
				+ "where e.apellido=:datoApellido",Estudiante.class);
		myQueryTyped.setParameter("datoApellido", apellido);
		
		return myQueryTyped.getSingleResult();
	}

	@Override
	public List<Estudiante> seleccionarListaPorApellido(String apellido) {
		// Creo el Query
		Query myQuery = this.entityManager.createQuery("select e from Estudiante e where e.apellido=:datoApellido");

		// Reemplazo la variable con el parametro apellido
		myQuery.setParameter("datoApellido", apellido);

		return  myQuery.getResultList();// Retorname la lista de resultados

	}

	@Override
	public List<Estudiante> seleccionarListaPorApellidoyNombre(String apellido, String nombre) {
		// Creo el Query
		Query myQuery = this.entityManager.createQuery("select e from Estudiante e "
				+ "where e.apellido=:datoApellido and e.nombre=:datoNombre");

		// Reemplazo las variablse 
		myQuery.setParameter("datoApellido", apellido);
		myQuery.setParameter("datoNombre", nombre);

		return  myQuery.getResultList();// Retorname la lista de resultados
	}
	
	

}
