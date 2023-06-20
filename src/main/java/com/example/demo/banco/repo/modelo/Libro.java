package com.example.demo.banco.repo.modelo;

import java.util.Set;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Component
@Table(name = "libro", schema = "public")
@Entity
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_libro")
	@SequenceGenerator(name = "seq_libro",sequenceName = "seq_libro",allocationSize = 1)
	@Column(name = "libr_id")
	private Integer id;
	@Column(name = "libr_titulo")
	private String titulo;
	@Column(name = "libr_editorial")
	private String editorial;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="autor_libro", 
	joinColumns= @JoinColumn(name="auli_id_libro"),inverseJoinColumns = @JoinColumn(name="auli_id_autor"))
	//se inicia haciendo el join column para libro, osea la tabla en la que me encuentro
	private Set<Autor> autores;

	// Set y get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public Set<Autor> getAutores() {
		return autores;
	}

	public void setAutores(Set<Autor> autores) {
		this.autores = autores;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", editorial=" + editorial  + "]";
	}

	
}
