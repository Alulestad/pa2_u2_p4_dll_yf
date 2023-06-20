package com.example.demo.banco.service;

import com.example.demo.banco.repo.modelo.Autor;

public interface IAutorService {

	// CRUD
	public void agregar(Autor autor);

	public void actualizar(Autor autor);

	public Autor buscarPorId(Integer id);

	public void borrarPorId(Integer id);
}
