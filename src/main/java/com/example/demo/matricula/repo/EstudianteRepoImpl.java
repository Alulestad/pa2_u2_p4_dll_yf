package com.example.demo.matricula.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.matricula.repo.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
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
		Query myQuery = this.entityManager
				.createQuery("select e from Estudiante e " + "where e.apellido=:datoApellido");

		// Reemplazo la variable con el parametro apellido
		myQuery.setParameter("datoApellido", apellido);

		return (Estudiante) myQuery.getSingleResult();// Retorname un unico resultado
	}

	@Override
	public Estudiante seleccionarPorApellidoTyped(String apellido) {

		TypedQuery<Estudiante> myQueryTyped = this.entityManager
				.createQuery("select e from Estudiante e " + "where e.apellido=:datoApellido", Estudiante.class);
		myQueryTyped.setParameter("datoApellido", apellido);

		return myQueryTyped.getSingleResult();
	}

	@Override
	public List<Estudiante> seleccionarListaPorApellido(String apellido) {
		// Creo el Query
		Query myQuery = this.entityManager.createQuery("select e from Estudiante e where e.apellido=:datoApellido");

		// Reemplazo la variable con el parametro apellido
		myQuery.setParameter("datoApellido", apellido);

		return myQuery.getResultList();// Retorname la lista de resultados

	}

	@Override
	public List<Estudiante> seleccionarListaPorApellidoyNombre(String apellido, String nombre) {
		// Creo el Query
		Query myQuery = this.entityManager
				.createQuery("select e from Estudiante e " + "where e.apellido=:datoApellido and e.nombre=:datoNombre");

		// Reemplazo las variablse
		myQuery.setParameter("datoApellido", apellido);
		myQuery.setParameter("datoNombre", nombre);

		return myQuery.getResultList();// Retorname la lista de resultados
	}

	@Override
	public Estudiante seleccionarPorApellidoNamedTypedQuery(String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myTypedQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorApellido",
				Estudiante.class);
		myTypedQuery.setParameter("datoApellido", apellido);

		return myTypedQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoNamedQuery(String apellido) {
		Query myTypedQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorApellido", Estudiante.class);
		myTypedQuery.setParameter("datoApellido", apellido);

		return (Estudiante) myTypedQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoNativeQuery(String apellido) {

		Query myQuery = this.entityManager.createNativeQuery(
				"" + "select * from estudiante e where e.estu_apellido=:datoApellido", Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);

		return (Estudiante) myQuery.getSingleResult();

	}

	@Override
	public Estudiante seleccionarPorApellidoNamedNativeQuery(String apellido) {
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorApellidoNative",
				Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);

		return myQuery.getSingleResult();

	}

	@Override
	public Estudiante seleccionarPorNombreNamedQuery(String nombre) {
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombre",
				Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);

		return myQuery.getSingleResult();

	}

	@Override
	public Estudiante seleccionarPorNombreNamedNativeQuery(String nombre) {
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombreNative",
				Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);

		return myQuery.getSingleResult();
	}

	////
	@Override
	public Estudiante seleccionarPorApellidoCriteriaAPIQuery(String apellido) {

		// La interfaz CriteriaBuilder, de constructor permite construir desde 0 el SQL
		CriteriaBuilder myCriteriaBuilder = this.entityManager.getCriteriaBuilder();

		// 1. Especificamos el tipo de retorno que tiene mi query
		CriteriaQuery<Estudiante> myCriteriaQuery = myCriteriaBuilder.createQuery(Estudiante.class);

		// 2. Empezamos a declarar el SQL
		// 2.1 Definimos el FROM (root). OBS: el from no necesariamente es igual al tipo
		// de retorno
		Root<Estudiante> myTablaFrom = myCriteriaQuery.from(Estudiante.class);// from estudiante

		// 3. Construir las condiciones de mi SQL
		// En Criteria API Query las condiciones se las conoce como Predicado
		// e.apellido=:datoApelido
		Predicate condicionApellido = myCriteriaBuilder.equal(myTablaFrom.get("apellido"), apellido);

		// 4. Armamos mi SQL final
		myCriteriaQuery.select(myTablaFrom).where(condicionApellido);

		// 5. La ejecucion del Query lo realizamos con TypedQuery
		TypedQuery<Estudiante> myTypedQuery = this.entityManager.createQuery(myCriteriaQuery);

		return myTypedQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarEstudianteDinamico(String nombre, String apellido, Double peso) {

		CriteriaBuilder myConstructor = this.entityManager.getCriteriaBuilder();
		// 1. Especificamos el tipo de retorno que tiene mi query
		CriteriaQuery<Estudiante> myQuery = myConstructor.createQuery(Estudiante.class);
		// 2. Empezamos a declarar el SQL
		// 2.1 Definimos el FROM (root). OBS: el from no necesariamente es igual al tipo
		// de retorno
		Root<Estudiante> myTablaFrom = myQuery.from(Estudiante.class);

		// 3. Construir las condiciones de mi SQL
		// >100 e.nombre=? and e.apellido=?
		// <=100 e.nombre=? or e.apellido=?

		// e.nombre=?
		Predicate pNombre = myConstructor.equal(myTablaFrom.get("nombre"), nombre);

		// e.apellido=?
		Predicate pApellido = myConstructor.equal(myTablaFrom.get("apellido"), apellido);

		Predicate predicadoFinal = null;
		if (peso.compareTo(Double.valueOf(100)) <= 0) {
			predicadoFinal = myConstructor.or(pNombre, pApellido);
		} else {
			predicadoFinal = myConstructor.and(pNombre, pApellido);
		}

		// 4. Armamos mi SQL final
		myQuery.select(myTablaFrom).where(predicadoFinal);

		// 5. La ejecucion del Query lo realizamos con TypedQuery
		TypedQuery<Estudiante> myTypedQuery = this.entityManager.createQuery(myQuery);

		return myTypedQuery.getSingleResult();
	}

	@Override
	public int eliminarPorNombre(String nombre) {
		// delete from estudiante e where e.estu_nombre=?
		// delete from Estudiante e where e.nombre=:datoNombre
		Query myQuery = this.entityManager.createQuery("delete from Estudiante e where e.nombre=:datoNombre");
		myQuery.setParameter("datoNombre", nombre);

		return myQuery.executeUpdate(); // Numero de registros afectados, esta devolucion tambien se ve en el postgres

	}

	@Override
	public int actualizarPorApellido(String nombre, String apellido) {
		// SQL
		// update estudiante set estu_nombre=? where estu_apellido=?
		// JPQL
		// update Estudiante e set e.nombre=:datoNombre where e.apellido=:datoApellido

		Query myQuery = this.entityManager.createQuery(""
				+ "update Estudiante e set e.nombre=:datoNombre where e.apellido=:datoApellido");
		myQuery.setParameter("datoNombre", nombre);
		myQuery.setParameter("datoApellido", apellido);

		return myQuery.executeUpdate(); // Numero de registros afectados, esta devolucion tambien se ve en el postgres

	}

}
