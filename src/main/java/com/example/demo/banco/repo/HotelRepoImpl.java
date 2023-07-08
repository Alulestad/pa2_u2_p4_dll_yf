package com.example.demo.banco.repo;

import java.util.List;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.example.demo.banco.repo.modelo.Hotel;
import com.example.demo.banco.repo.modelo.dto.HotelDTO;
import com.example.demo.banco.repo.modelo.dto.HotelDTOHabitaciones;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class HotelRepoImpl implements IHotelRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Hotel hotel) {
		this.entityManager.persist(hotel);
	}

	@Override
	public Hotel seleccionarPorId(Integer id) {
		return this.entityManager.find(Hotel.class, id);
	}

	@Override
	public void actualizar(Hotel hotel) {
		this.entityManager.merge(hotel);
	}

	@Override
	public void eliminarPorId(Integer id) {
		Hotel hotel = this.seleccionarPorId(id);
		this.entityManager.remove(hotel);
	}

	@Override
	public HotelDTO seleccionarPorIdDTO(Integer id) {
		TypedQuery<HotelDTO> myQuery=this.entityManager.createQuery(""
				+ "select new com.example.demo.banco.repo.modelo.dto.HotelDTO(h.nombre) "
				+ "from Hotel h",HotelDTO.class);	
		
		return myQuery.getSingleResult();
	}

	@Override
	public Hotel seleccionarHabitacionesPorIdDTO(Integer id) {
		TypedQuery<Hotel> myQuery=this.entityManager.createQuery(""
				+ "select h "
				+ "from Hotel h",Hotel.class);	

		myQuery.getSingleResult().getHabitaciones().size();//demanda

		return myQuery.getSingleResult();
	}

	
	
}
