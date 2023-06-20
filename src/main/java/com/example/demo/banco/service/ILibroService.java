package com.example.demo.banco.service;

import com.example.demo.banco.repo.modelo.Libro;

public interface ILibroService {

	// CRUD
	public void crear(Libro libro);

	public void actualizar(Libro libro);

	public Libro buscarPorId(Integer id);

	public void borrarPorId(Integer id);
}
