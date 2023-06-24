package com.example.demo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.repo.modelo.Autor;
import com.example.demo.banco.repo.modelo.Libro;
import com.example.demo.banco.service.IAutorService;
import com.example.demo.banco.service.ICiudadanoService;
import com.example.demo.banco.service.IEmpleadoService;
import com.example.demo.banco.service.IHabitacionService;
import com.example.demo.banco.service.IHotelService;
import com.example.demo.banco.service.ILibroService;
import com.example.demo.matricula.repo.EstudianteRepo;
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
		System.out.println("##################QUERY##################");
		Estudiante estudiante= this.estudianteService.buscarPorApellido("asdfsf");
		System.out.println(estudiante);
		
		List<Estudiante> estudiantes1= this.estudianteService.reportePorApellido("Florez");
		System.out.println("Reporte de estudantes por apellido");
		for(Estudiante estu:estudiantes1) {
			System.out.println(estu);
		}
		
		List<Estudiante> estudiantes2= this.estudianteService.reportePorApellidoyNombre("Florez","Yaniry");
		System.out.println("Reporte de estudantes por apellido y nombre");
		for(Estudiante estu:estudiantes2) {
			System.out.println(estu);
		}
		
		System.out.println("##################TYPED QUERY##################");
		Estudiante estudiante2= this.estudianteService.buscarPorApellidoTyped("asdfsf");
		System.out.println(estudiante2);
		
	}

}
