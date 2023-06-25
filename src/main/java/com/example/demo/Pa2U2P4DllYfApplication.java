package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
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
	private ISucursalBancoService iSucursalBancoService;
	

	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4DllYfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Unidad 2");
		SucursalBanco sucursalBanco1=new SucursalBanco();
		sucursalBanco1.setDireccion("Amazonas y Patria");
		sucursalBanco1.setFechaApertura(LocalDateTime.of(1999, 1, 2, 0, 0));
		sucursalBanco1.setPresupuesto(new BigDecimal(100000));
		
		//this.iSucursalBancoService.guardar(sucursalBanco1);
		
		System.out.println("###################Query###################");
		SucursalBanco encontradoSucursalBanco1= 
				this.iSucursalBancoService.buscarPorFechaApertura(LocalDateTime.of(1999, 1, 2, 0, 0));
		System.out.println(encontradoSucursalBanco1);
		List<SucursalBanco> encontradoSucursalesBanco1=
				this.iSucursalBancoService.reportePorFechaApertura(LocalDateTime.of(1999, 1, 1, 0, 0));
		System.out.println(encontradoSucursalesBanco1);
		
		System.out.println("###################TypedQuery###################");
		SucursalBanco encontradoSucursalBanco2= 
				this.iSucursalBancoService.buscarPorFechaAperturaTyped(LocalDateTime.of(1999, 1, 2, 0, 0));
		System.out.println(encontradoSucursalBanco2);
		List<SucursalBanco> encontradoSucursalesBanco2=
				this.iSucursalBancoService.reporteTodosPorFechaAperturaTyped(LocalDateTime.of(1999, 1, 1, 0, 0));
		System.out.println(encontradoSucursalesBanco2);
		
	}

}
