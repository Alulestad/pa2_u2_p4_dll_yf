package com.example.demo.banco.repo.modelo;


public interface ICtaBancariaRepo {
	public void insertar(CtaBancaria bancaria) ;
	public void actualizar(CtaBancaria bancaria);
	public CtaBancaria seleccionarPorId(Integer id);
	
}
