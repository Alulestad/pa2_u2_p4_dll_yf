package com.example.demo.matricula.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.matricula.repo.IMateriaRepo;
import com.example.demo.matricula.repo.modelo.Materia;

@Service
public class MateriaServiceImpl implements IMateriaService {
	@Autowired
	private IMateriaRepo iMateriaRepo;

	@Override
	public void agregar(Materia materia) {
		this.iMateriaRepo.insertar(materia);

	}

	@Override
	public Materia buscarPorID(Integer id) {
		return this.iMateriaRepo.seleccionarPorID(id);
	}

	@Override
	public void eliminarPorID(Integer id) {
		this.iMateriaRepo.eliminarPorID(id);

	}

	@Override
	public void actualizar(Materia materia) {
		this.iMateriaRepo.actualizar(materia);

	}

}
