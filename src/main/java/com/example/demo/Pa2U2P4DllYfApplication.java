package com.example.demo;

import java.util.HashSet;
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
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4DllYfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Unidad 2");
		Autor a1= new Autor();
		a1.setApellido("Lara");
		a1.setNombre("Jorge");
		
		Autor a2= new Autor();
		a2.setApellido("Cervantes");
		a2.setNombre("Miguel");
		
		Libro l1=new Libro();
		l1.setEditorial("Planeta");
		l1.setTitulo("Quijote");
		
		Libro l2=new Libro();
		l2.setEditorial("Norma");
		l2.setTitulo("Cuentos 1");
		
		

		Set<Libro> libros= new HashSet<>();
		libros.add(l1);

		a1.setLibros(libros);
		a2.setLibros(libros);
		
		Set<Autor> autores= new HashSet<>();
		autores.add(a1);
		autores.add(a2);
		l1.setAutores(autores);
		
		
		this.iLibroService.crear(l1);
		l1.setEditorial("actualizado");
		this.iLibroService.actualizar(l1);
		Libro libro= this.iLibroService.buscarPorId(6);
		System.out.println(libro);
		this.iLibroService.borrarPorId(6);
		
		
	}

}
