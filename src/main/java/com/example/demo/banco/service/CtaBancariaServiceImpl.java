package com.example.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import com.example.demo.banco.repo.modelo.CtaBancaria;
import com.example.demo.banco.repo.modelo.ICtaBancariaRepo;

@Service
public class CtaBancariaServiceImpl implements ICtaBancariaService {

	@Autowired
	private ICtaBancariaRepo iCtaBancariaRepo;
	
	@Autowired
	@Qualifier(value = "par")
	private ICalcularSaldo iCalcularSaldoPar;
	@Autowired
	@Qualifier(value = "impar")
	private ICalcularSaldo iCalcularSaldoImpar;
	
	@Override
	public void aperturar(String numero, String tipo, BigDecimal saldo, String cedula) {
		CtaBancaria bancaria= new CtaBancaria();
		
		bancaria.setCedula(cedula);
		LocalDateTime date= LocalDateTime.now();
		bancaria.setFechaApertura(date);
		bancaria.setNumero(numero);
		bancaria.setTipo(tipo);
		
		BigDecimal saldotemp=new BigDecimal(0);
		if (date.getDayOfMonth()%2==0) {
			//es par
			saldotemp=this.iCalcularSaldoPar.calcular(saldo);
			
		}else {
			saldotemp=this.iCalcularSaldoImpar.calcular(saldo);
		}
		bancaria.setSaldo(saldotemp);
		
		
		this.iCtaBancariaRepo.insertar(bancaria);
		
	}

	@Override
	public void actualizar(CtaBancaria bancaria) {
		// TODO Auto-generated method stub
		this.iCtaBancariaRepo.actualizar(bancaria);
	}

	@Override
	public BigDecimal consultarSaldoPorId(Integer id) {
		CtaBancaria bancaria=this.iCtaBancariaRepo.seleccionarPorId(id);
		
		return bancaria.getSaldo();
	}



}
