package com.example.demo.matricula.repo;

import com.example.demo.matricula.repo.modelo.Matricula;

public interface IMatriculaRepo {

	public void insertar(Matricula matricula);

	public Matricula seleccionarPorID(Integer id);

	public void eliminarPorID(Integer id);

	public void actualizar(Matricula matricula);
}
