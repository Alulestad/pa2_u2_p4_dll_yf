package com.example.demo.cajero.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cajero.repo.ISucursalBancoRepo;
import com.example.demo.cajero.repo.modelo.SucursalBanco;

@Service
public class SucursalBancoServiceImpl implements ISucursalBancoService {

	@Autowired
	private ISucursalBancoRepo iSucursalBancoRepo;

	@Override
	public void guardar(SucursalBanco sucursalBanco) {
		this.iSucursalBancoRepo.insertar(sucursalBanco);

	}

	@Override
	public SucursalBanco buscarPorId(Integer id) {

		return this.iSucursalBancoRepo.seleccionarPorId(id);
	}

	@Override
	public void actualizar(SucursalBanco sucursalBanco) {
		this.iSucursalBancoRepo.actualizar(sucursalBanco);

	}

	@Override
	public void borrarPorId(Integer id) {
		this.iSucursalBancoRepo.eliminarPorId(id);

	}

	@Override
	public SucursalBanco buscarPorFechaApertura(LocalDateTime fecha) {

		return this.iSucursalBancoRepo.seleccionarPorFechaApertura(fecha);
	}

	@Override
	public List<SucursalBanco> reportePorFechaApertura(LocalDateTime fecha) {

		return this.iSucursalBancoRepo.seleccionarTodosPorFechaApertura(fecha);
	}

	@Override
	public SucursalBanco buscarPorFechaAperturaTyped(LocalDateTime fecha) {

		return this.iSucursalBancoRepo.seleccionarPorFechaAperturaTyped(fecha);
	}

	@Override
	public List<SucursalBanco> reporteTodosPorFechaAperturaTyped(LocalDateTime fecha) {

		return this.iSucursalBancoRepo.seleccionarTodosPorFechaAperturaTyped(fecha);
	}

}
