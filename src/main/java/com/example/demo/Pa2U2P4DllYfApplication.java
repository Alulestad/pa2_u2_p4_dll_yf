package com.example.demo;

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
		estudiante.setApellido("Florez");
		estudiante.setCedula("12431243");
		estudiante.setNombre("Yaniri");
		
		this.estudianteService.guardar(estudiante);
		
		
	}

}
