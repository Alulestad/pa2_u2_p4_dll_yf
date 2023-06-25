package com.example.demo.cajero.service;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.cajero.repo.modelo.SucursalBanco;

public interface ISucursalBancoService {

	//create, read, update, delete
	public void guardar(SucursalBanco sucursalBanco);
	public SucursalBanco buscarPorId(Integer id);
	public void actualizar(SucursalBanco sucursalBanco);
	public void borrarPorId(Integer id);
	
	//Query Singular
	public SucursalBanco buscarPorFechaApertura(LocalDateTime fecha);
	//Query Lista
	public List<SucursalBanco> reportePorFechaApertura(LocalDateTime fecha);
	//TypedQuery Singular
	public SucursalBanco buscarPorFechaAperturaTyped(LocalDateTime fecha);
	//TypedQuery Lista
	public List<SucursalBanco> reporteTodosPorFechaAperturaTyped(LocalDateTime fecha);
}
