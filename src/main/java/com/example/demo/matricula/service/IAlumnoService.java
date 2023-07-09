package com.example.demo.matricula.service;

import com.example.demo.matricula.repo.modelo.Alumno;

public interface IAlumnoService {

	public void agregar(Alumno alumno);

	public Alumno buscarPorID(Integer id);

	public void eliminarPorID(Integer id);

	public void actualizar(Alumno alumno);
}
