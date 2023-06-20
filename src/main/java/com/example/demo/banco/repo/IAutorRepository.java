package com.example.demo.banco.repo;

import com.example.demo.banco.repo.modelo.Autor;

public interface IAutorRepository {

	public void insertar(Autor autor);
	public void actualizar(Autor autor);
	public Autor seleccionarPorId(Integer id);
	public void eliminarPorId(Integer id);
	
	
}
