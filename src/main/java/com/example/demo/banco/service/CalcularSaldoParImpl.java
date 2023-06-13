package com.example.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("par")

public class CalcularSaldoParImpl implements ICalcularSaldo {

	@Override
	public BigDecimal calcular(BigDecimal monto) {
		// TODO Auto-generated method stub
		BigDecimal saldotemp=monto.add(monto.multiply(new BigDecimal(0.05)));
		return saldotemp;
	}

}
