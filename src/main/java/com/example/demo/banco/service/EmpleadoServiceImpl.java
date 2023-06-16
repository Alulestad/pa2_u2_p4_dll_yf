package com.example.demo.banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.repo.IEmpleadoRepo;
import com.example.demo.banco.repo.modelo.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	@Autowired
	private IEmpleadoRepo empleadoRepo;

	@Override
	public void agregar(Empleado empleado) {
		this.empleadoRepo.insertar(empleado);

	}

	@Override
	public Empleado buscarPorId(Integer id) {
		return this.empleadoRepo.seleccionarPorId(id);
	}

	@Override
	public void actualizar(Empleado empleado) {
		this.empleadoRepo.actualizar(empleado);

	}

	@Override
	public void borrarPorId(Integer id) {
		this.empleadoRepo.eliminarPorId(id);
	}

}
