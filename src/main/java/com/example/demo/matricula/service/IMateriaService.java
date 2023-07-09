package com.example.demo.matricula.service;

import com.example.demo.matricula.repo.modelo.Materia;

public interface IMateriaService {

	public void agregar(Materia materia);

	public Materia buscarPorID(Integer id);

	public void eliminarPorID(Integer id);

	public void actualizar(Materia materia);
}
