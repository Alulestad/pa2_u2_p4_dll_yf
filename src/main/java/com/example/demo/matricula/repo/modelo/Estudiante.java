package com.example.demo.matricula.repo.modelo;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Component
@Table(name = "estudiante", schema = "public")
@Entity

@NamedQueries({
		@NamedQuery(name = "Estudiante.buscarPorApellido", query = "select e from Estudiante e where e.apellido=:datoApellido"),
		@NamedQuery(name = "Estudiante.buscarPorNombre", query = "select e from Estudiante e where e.nombre=:datoNombre") })

@NamedNativeQueries({
		@NamedNativeQuery(name = "Estudiante.buscarPorApellidoNative", query = "select * from estudiante e where e.estu_apellido=:datoApellido", resultClass = Estudiante.class),
		@NamedNativeQuery(name = "Estudiante.buscarPorNombreNative", query = "select * from estudiante e where e.estu_nombre=:datoNombre", resultClass = Estudiante.class) })

public class Estudiante {

	@Id
	@GeneratedValue(generator = "seq_estudiante", strategy = GenerationType.SEQUENCE)
	// nombre del generador, estrategia : secuencia

	@SequenceGenerator(name = "seq_estudiante", sequenceName = "seq_estudiante", allocationSize = 1)
	// nombre cualquiera, nombre de la secuencia en la bd, el incremento

	@Column(name = "estu_id")
	private Integer estu_id;
	@Column(name = "estu_cedula")
	private String cedula;
	@Column(name = "estu_nombre")
	private String nombre;
	@Column(name = "estu_apellido")
	private String apellido;
	@Column(name = "estu_peso")
	private Double peso;
	
	
	
	
	// gets y sets
	public String getCedula() {
		return cedula;
	}

	public Integer getEstu_id() {
		return estu_id;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public void setEstu_id(Integer estu_id) {
		this.estu_id = estu_id;
	}

	@Override
	public String toString() {
		return "Estudiante [estu_id=" + estu_id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", peso=" + peso + "]";
	}

}
