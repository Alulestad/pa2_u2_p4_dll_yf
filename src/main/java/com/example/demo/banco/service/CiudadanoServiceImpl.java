package com.example.demo.banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.repo.ICiudadanoRepo;
import com.example.demo.banco.repo.modelo.Ciudadano;

@Service
public class CiudadanoServiceImpl implements ICiudadanoService {

	
	@Autowired
	private ICiudadanoRepo iCiudadanoRepo;
	
	@Override
	public void agregar(Ciudadano ciudadano) {
		this.iCiudadanoRepo.insertar(ciudadano);
	}

	@Override
	public Ciudadano buscaraPorId(Integer id) {
		return this.iCiudadanoRepo.seleccionarPorId(id);
	}

	@Override
	public void actualizar(Ciudadano ciudadano) {
		this.iCiudadanoRepo.actualizar(ciudadano);
	}

	@Override
	public void borrarPorId(Integer id) {
		this.iCiudadanoRepo.eliminarPorId(id);
	}

}
