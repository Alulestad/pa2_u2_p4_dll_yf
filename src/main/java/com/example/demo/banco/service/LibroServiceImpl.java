package com.example.demo.banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.repo.ILibroRepository;
import com.example.demo.banco.repo.LibroRepositoryImpl;
import com.example.demo.banco.repo.modelo.Libro;

@Service
public class LibroServiceImpl implements ILibroService{
	
	@Autowired
	private ILibroRepository iLibroRepository;

	@Override
	public void crear(Libro libro) {
		this.iLibroRepository.insertar(libro);
		
	}

	@Override
	public void actualizar(Libro libro) {
		this.iLibroRepository.actualizar(libro);		
	}

	@Override
	public Libro buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.iLibroRepository.seleccionarPorId(id);
	}

	@Override
	public void borrarPorId(Integer id) {
		// TODO Auto-generated method stub
		this.iLibroRepository.eliminarPorId(id);
	}

}
