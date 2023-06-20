package com.example.demo.banco.repo;

import com.example.demo.banco.repo.modelo.Autor;
import com.example.demo.banco.repo.modelo.Libro;

public interface ILibroRepository {

	// CRUD
	public void insertar(Libro libro);

	public void actualizar(Libro libro);

	public Libro seleccionarPorId(Integer id);

	public void eliminarPorId(Integer id);
}
