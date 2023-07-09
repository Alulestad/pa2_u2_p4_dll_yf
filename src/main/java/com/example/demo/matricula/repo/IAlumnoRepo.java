package com.example.demo.matricula.repo;

import com.example.demo.matricula.repo.modelo.Alumno;

public interface IAlumnoRepo {

	public void insertar(Alumno alumno);

	public Alumno seleccionarPorID(Integer id);

	public void eliminarPorID(Integer id);

	public void actualizar(Alumno alumno);
}
