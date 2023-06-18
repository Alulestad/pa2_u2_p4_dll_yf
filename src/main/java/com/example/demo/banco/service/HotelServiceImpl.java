package com.example.demo.banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.repo.IHabitacionRepo;
import com.example.demo.banco.repo.IHotelRepo;
import com.example.demo.banco.repo.modelo.Habitacion;
import com.example.demo.banco.repo.modelo.Hotel;

@Service
public class HotelServiceImpl implements IHotelService {
	
	@Autowired
	private IHotelRepo iHotelRepo;
	
	@Override
	public void agregar(Hotel hotel) {
		this.iHotelRepo.insertar(hotel);
		
	}

	@Override
	public Hotel buscarPorId(Integer id) {
		return this.iHotelRepo.seleccionarPorId(id);
	}

	@Override
	public void actualizar(Hotel hotel) {
		this.iHotelRepo.actualizar(hotel);
	}

	@Override
	public void borrarPorId(Integer id) {
		this.iHotelRepo.eliminarPorId(id);
	}

}
