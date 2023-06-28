package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
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
import com.example.demo.cajero.repo.modelo.SucursalBanco;
import com.example.demo.cajero.service.ISucursalBancoService;
import com.example.demo.matricula.repo.EstudianteRepo;
import com.example.demo.matricula.repo.modelo.Estudiante;
import com.example.demo.matricula.service.EstudianteService;

@SpringBootApplication
public class Pa2U2P4DllYfApplication implements CommandLineRunner {


	@Autowired
	private ILibroService iLibroService;
	
	@Autowired
	private IAutorService iAutorService;
	
	
	@Autowired
	private EstudianteService estudianteService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4DllYfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Unidad 2");
		Set<Libro> libros=new HashSet();
		
		System.out.println("Apellido Named Typed Query");
		Estudiante estudianteNamedTypedQuery= this.estudianteService.buscarPorApellidoNamedTypedQuery("asdfsf");
		System.out.println(estudianteNamedTypedQuery);
		
		System.out.println("Apellido Named Query");
		Estudiante estudianteNamedQuery= this.estudianteService.buscarPorApellidoNamedQuery("asdfsf");
		System.out.println(estudianteNamedQuery);
		
		System.out.println("Apellido Native Query");
		Estudiante estudianteNativeQuery= this.estudianteService.buscarPorApellidoNativeQuery("asdfsf");
		System.out.println(estudianteNativeQuery);
		
		System.out.println("Apellido Named Native Query");
		Estudiante estudianteNamedNativeQuery= this.estudianteService.buscarPorApellidoNamedNativeQuery("asdfsf");
		System.out.println(estudianteNamedNativeQuery);
		
		
		System.out.println("Nombre Native Query");
		Estudiante estudianteNombreNamedQuery= this.estudianteService.buscarPorNombreNamedQuery("asdf");
		System.out.println(estudianteNombreNamedQuery);
		
		System.out.println("Nombre Named Native Query");
		Estudiante estudianteNombreNamedNativeQuery= this.estudianteService.buscarPorNombreNamedNativeQuery("asdf");
		System.out.println(estudianteNombreNamedNativeQuery);
		
		System.out.println("Apellido Criteria API Query");
		Estudiante estudianteApellidoCriteriaAPIQuery= this.estudianteService.buscarPorApellidoCriteriaAPIQuery("asdfsf");
		System.out.println(estudianteApellidoCriteriaAPIQuery);
		
	}

}
