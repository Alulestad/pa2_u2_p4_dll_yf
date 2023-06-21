package com.example.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.repo.modelo.Alumno;
import com.example.demo.banco.repo.modelo.Autor;
import com.example.demo.banco.repo.modelo.Libro;
import com.example.demo.banco.repo.modelo.Materia;
import com.example.demo.banco.repo.modelo.Matricula;
import com.example.demo.banco.service.IAutorService;
import com.example.demo.banco.service.ICiudadanoService;
import com.example.demo.banco.service.IEmpleadoService;
import com.example.demo.banco.service.IHabitacionService;
import com.example.demo.banco.service.IHotelService;
import com.example.demo.banco.service.ILibroService;
import com.example.demo.banco.service.IMatriculaService;

@SpringBootApplication
public class Pa2U2P4DllYfApplication implements CommandLineRunner {

	@Autowired
	private ICiudadanoService iCiudadanoService;
	
	@Autowired
	private IEmpleadoService iEmpleadoService;
	
	@Autowired
	private IHabitacionService iHabitacionService;
	
	@Autowired
	private IHotelService iHotelService;

	@Autowired
	private IAutorService iAutorService;
	
	@Autowired
	private ILibroService iLibroService;
	
	
	@Autowired
	private IMatriculaService iMatriculaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4DllYfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Unidad 2");
		Alumno alumno1= new Alumno();
		alumno1.setNombre("Daniel Ll");
		
		Alumno alumno2= new Alumno();
		alumno2.setNombre("Yaniri F");
		
		Alumno alumno3= new Alumno();
		alumno3.setNombre("Bernardo M");
		
		Materia materia1= new Materia();
		materia1.setNombre("Programacion 1");
		
		Materia materia2= new Materia();
		materia2.setNombre("Programacion 2");
		
		Materia materia3= new Materia();
		materia3.setNombre("Programacion 3");
		
		Matricula matricula1=new Matricula();
		matricula1.setFechaMatricula(LocalDateTime.now());
		matricula1.setNumero("1");
		
		Matricula matricula1_2=new Matricula();
		matricula1_2.setFechaMatricula(LocalDateTime.now());
		matricula1_2.setNumero("1");
		
		matricula1.setAlumno(alumno1);
		matricula1.setMateria(materia1);
		
		matricula1_2.setAlumno(alumno1);
		matricula1_2.setMateria(materia2);

		List<Matricula> matriculas1= new ArrayList<>();
		matriculas1.add(matricula1);
		matriculas1.add(matricula1_2);
		
		alumno1.setMatriculas(matriculas1);
		
		materia1.setMatriculas(matriculas1);
		materia2.setMatriculas(matriculas1);
		
		this.iMatriculaService.guardar(matricula1);
		
		
	}

}
