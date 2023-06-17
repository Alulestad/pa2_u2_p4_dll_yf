package com.example.demo.banco.repo;

import com.example.demo.banco.repo.modelo.Ciudadano;
import com.example.demo.banco.repo.modelo.Hotel;

public interface IHotel {

	//create, read, update delete
		public void insertar(Hotel hotel);
		public Hotel seleccionarPorId(Integer id);
		public void actualizar(Hotel hotel);
		public void eliminarPorId(Integer id);
}
