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
		
		Set<Autor> autores= new HashSet<>();
		autores.add(a1);
		l1.setAutores(autores);
		l2.setAutores(autores);
		
		Set<Libro> libros= new HashSet<>();
		libros.add(l1);
		libros.add(l2);
		
		a1.setLibros(libros);
		
		
		this.iAutorService.agregar(a1);
		a1.setApellido("actualizado");
		this.iAutorService.actualizar(a1);
		Autor autor= this.iAutorService.buscarPorId(2);
		System.out.println(autor);
		this.iAutorService.borrarPorId(3);
		
	}

}
