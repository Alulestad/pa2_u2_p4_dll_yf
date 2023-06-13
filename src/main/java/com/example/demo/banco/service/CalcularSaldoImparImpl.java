package com.example.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("impar")

public class CalcularSaldoImparImpl implements ICalcularSaldo {

	@Override
	public BigDecimal calcular(BigDecimal monto) {
		// TODO Auto-generated method stub
		return monto;
	}

}
