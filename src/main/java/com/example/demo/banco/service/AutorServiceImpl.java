package com.example.demo.banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.example.demo.banco.repo.IAutorRepository;
import com.example.demo.banco.repo.modelo.Autor;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class AutorServiceImpl implements IAutorService {

	@Autowired
	private IAutorRepository iAutorRepository;

	@Override
	public void agregar(Autor autor) {
		this.iAutorRepository.insertar(autor);

	}

	@Override
	public void actualizar(Autor autor) {
		this.iAutorRepository.actualizar(autor);
	}

	@Override
	public Autor buscarPorId(Integer id) {
		return this.iAutorRepository.seleccionarPorId(id);
	}

	@Override
	public void borrarPorId(Integer id) {
		this.iAutorRepository.eliminarPorId(id);
	}

}
