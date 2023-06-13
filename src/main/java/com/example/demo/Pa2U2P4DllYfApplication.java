package com.example.demo;

import java.awt.print.Printable;
import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.repo.modelo.CtaBancaria;
import com.example.demo.banco.service.CtaBancariaServiceImpl;
import com.example.demo.banco.service.ICtaBancariaService;
import com.example.demo.matricula.repo.modelo.Estudiante;
import com.example.demo.matricula.service.EstudianteService;

@SpringBootApplication
public class Pa2U2P4DllYfApplication implements CommandLineRunner {

	@Autowired
	private EstudianteService estudianteService;
	
	
	@Autowired
	private ICtaBancariaService ctaBancariaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4DllYfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Unidad 2");
		
		Estudiante estudiante= new Estudiante();
		estudiante.setApellido("Rivera");
		estudiante.setCedula("766554");
		estudiante.setNombre("Mabely");
		
		this.estudianteService.guardar(estudiante);
		
		
		System.out.println("############BANCO##############");
		this.ctaBancariaService.aperturar("1234", "A", new BigDecimal(100), "12341234");
		CtaBancaria bancaria= new CtaBancaria();
		bancaria.setCedula("1234124");
		bancaria.setId(5);
		this.ctaBancariaService.actualizar(bancaria);
		this.ctaBancariaService.consutarPorId(4);
		
		
		
	}

}
