package com.example.demo.banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.repo.IHabitacionRepo;
import com.example.demo.banco.repo.modelo.Habitacion;
import com.example.demo.banco.repo.modelo.dto.HabitacionesDTOIdHotel;

@Service
public class HabitacionServiceImpl implements IHabitacionService {

	@Autowired
	private IHabitacionRepo iHabitacionRepo;
	
	@Override
	public void agregar(Habitacion hotel) {
		this.iHabitacionRepo.insertar(hotel);

	}

	@Override
	public Habitacion buscarPorId(Integer id) {
		return this.iHabitacionRepo.seleccionarPorId(id);
	}

	@Override
	public void actualizar(Habitacion habitacion) {
		this.iHabitacionRepo.actualizar(habitacion);
	}

	@Override
	public void borrarPorId(Integer id) {
		this.iHabitacionRepo.eliminarPorId(id);
	}

	@Override
	public HabitacionesDTOIdHotel reporteNumeroHabitacionesPorIDHotel(Integer id) {
		// TODO Auto-generated method stub
		return this.iHabitacionRepo.seleccionarTodosNumeroHabitacionesPorIDHotel(id);
	}

	
}
