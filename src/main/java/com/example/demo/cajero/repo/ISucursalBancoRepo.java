package com.example.demo.cajero.repo;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.cajero.repo.modelo.SucursalBanco;

public interface ISucursalBancoRepo {
	//create, read, update, delete
	public void insertar(SucursalBanco sucursalBanco);
	public SucursalBanco seleccionarPorId(Integer id);
	public void actualizar(SucursalBanco sucursalBanco);
	public void eliminarPorId(Integer id);
	
	//Query Singular
	public SucursalBanco seleccionarPorFechaApertura(LocalDateTime fecha);
	//Query Lista
	public List<SucursalBanco> seleccionarTodosPorFechaApertura(LocalDateTime fecha);
	//TypedQuery Singular
	public SucursalBanco seleccionarPorFechaAperturaTyped(LocalDateTime fecha);
	//TypedQuery Lista
	public List<SucursalBanco> seleccionarTodosPorFechaAperturaTyped(LocalDateTime fecha);
	
	
}
