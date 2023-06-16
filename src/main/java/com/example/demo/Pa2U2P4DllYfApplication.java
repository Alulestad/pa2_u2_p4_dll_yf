package com.example.demo;

import java.awt.print.Printable;
import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.repo.IEmpleadoRepo;
import com.example.demo.banco.repo.modelo.Ciudadano;
import com.example.demo.banco.repo.modelo.CtaBancaria;
import com.example.demo.banco.repo.modelo.Empleado;
import com.example.demo.banco.service.CtaBancariaServiceImpl;
import com.example.demo.banco.service.ICiudadanoService;
import com.example.demo.banco.service.ICtaBancariaService;
import com.example.demo.banco.service.IEmpleadoService;
import com.example.demo.matricula.repo.modelo.Estudiante;
import com.example.demo.matricula.service.EstudianteService;

@SpringBootApplication
public class Pa2U2P4DllYfApplication implements CommandLineRunner {

	@Autowired
	private ICiudadanoService iCiudadanoService;
	
	@Autowired
	private IEmpleadoService iEmpleadoService;

	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4DllYfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Unidad 2");
		
		Ciudadano ciu1= new  Ciudadano();
		ciu1.setApellido("Llumiquinga");
		ciu1.setCedula("123123");
		ciu1.setNombre("Daniel");
		
		
		Empleado empl1= new Empleado();
		empl1.setCargo("Vice presidente ejecutivo jr");
		empl1.setCiudadano(this.iCiudadanoService.buscaraPorId(Integer.valueOf(1)));
		empl1.setSueldo(new BigDecimal(1000));
		
		//ciu1.setEmpleado(empl1);
		
		
		this.iCiudadanoService.agregar(ciu1);
		ciu1.setCedula("12341234");
		this.iCiudadanoService.actualizar(ciu1);
		this.iCiudadanoService.buscaraPorId(Integer.valueOf(1));
		

		
		this.iEmpleadoService.agregar(empl1);
		empl1.setCargo("Vice presidente ejecutivo");
		this.iEmpleadoService.actualizar(empl1);
		this.iEmpleadoService.buscarPorId(Integer.valueOf(1));
		
		this.iCiudadanoService.borrarPorId(Integer.valueOf(1));
		this.iEmpleadoService.borrarPorId(Integer.valueOf(1));
		
	}

}
