package com.example.demo.matricula.repo.modelo;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Component
@Table(name = "estudiante", schema = "public")
@Entity
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

	@Override
	public String toString() {
		return "Estudiante [estu_id=" + estu_id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ "]";
	}

}
