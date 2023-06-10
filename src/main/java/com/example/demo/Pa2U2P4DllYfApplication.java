package com.example.demo;

import java.awt.print.Printable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.matricula.repo.modelo.Estudiante;
import com.example.demo.matricula.service.EstudianteService;

@SpringBootApplication
public class Pa2U2P4DllYfApplication implements CommandLineRunner {

	@Autowired
	private EstudianteService estudianteService;
	
	
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
		
		//this.estudianteService.guardar(estudiante);
		//Estudiante encontrado= this.estudianteService.buscarPorCedula("766554");
		//System.out.println(encontrado);
		estudiante.setApellido("asdfsf");
		this.estudianteService.actualizar(estudiante);
		//System.out.println(encontrado);
		this.estudianteService.borrar("766554");
		this.estudianteService.guardar(estudiante);
		
		
		
	}

}
