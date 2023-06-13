package com.example.demo.banco.service;

import java.math.BigDecimal;

import com.example.demo.banco.repo.modelo.CtaBancaria;

public interface ICtaBancariaService {

	public void aperturar(String numero, String tipo, BigDecimal saldo, String cedula) ;
	public void actualizar(CtaBancaria bancaria);
	public BigDecimal consultarSaldoPorId(Integer id);
	
}
