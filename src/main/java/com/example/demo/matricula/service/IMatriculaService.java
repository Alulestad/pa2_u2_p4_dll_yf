package com.example.demo.matricula.service;

import com.example.demo.matricula.repo.modelo.Matricula;

public interface IMatriculaService {

	public void agregar(Matricula matricula);

	public Matricula buscarPorID(Integer id);

	public void eliminarPorID(Integer id);

	public void actualizar(Matricula matricula);
}
