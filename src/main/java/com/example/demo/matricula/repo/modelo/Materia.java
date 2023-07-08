package com.example.demo.matricula.repo.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity

@Table(name = "materia")

public class Materia {

	@Id

	@GeneratedValue(generator = "seq_materia", strategy = GenerationType.SEQUENCE)

	@SequenceGenerator(name = "seq_materia", sequenceName = "seq_materia", allocationSize = 1)

	@Column(name = "mat_id")

	private Integer id;

	@Column(name = "mat_nombre")

	private String nombre;

	@OneToMany(mappedBy = "materia")

	private List<Matricula> matriculas;

	// GETTERS Y SETTERS

	public Integer getId() {

		return id;

	}

	public void setId(Integer id) {

		this.id = id;

	}

	public String getNombre() {

		return nombre;

	}

	public void setNombre(String nombre) {

		this.nombre = nombre;

	}

	public List<Matricula> getMatriculas() {

		return matriculas;

	}

	public void setMatriculas(List<Matricula> matriculas) {

		this.matriculas = matriculas;

	}

	@Override

	public String toString() {

		return "Materia [id=" + id + ", nombre=" + nombre + ", matriculas=" + matriculas + "]";

	}

}