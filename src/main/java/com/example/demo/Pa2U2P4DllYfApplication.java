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

		Estudiante estudiante1 = this.estudianteService.buscarEstudianteDinamico("asdf", "asdfsf", Double.valueOf(200));

		System.out.println(estudiante1);

		Estudiante estudiante2 = this.estudianteService.buscarEstudianteDinamico("asdf", "asdfsf", Double.valueOf(100));

		System.out.println(estudiante2);
		
		int nActualizados= this.estudianteService.actualizarPorApellido("nombre2", "apellido1");
		System.out.println("Numero de actualizados: "+nActualizados);
		int nEliminados= this.estudianteService.eliminarPorNombre("nombre2");
		System.out.println("Numero de eliminados: "+nEliminados);
		
		
	}

}
