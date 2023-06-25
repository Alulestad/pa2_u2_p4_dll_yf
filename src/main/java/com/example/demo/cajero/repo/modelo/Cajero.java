package com.example.demo.cajero.repo.modelo;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Component
@Table(name = "cajero", schema = "public")
@Entity
public class Cajero {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cajero")
	@SequenceGenerator(name = "seq_cajero", sequenceName = "seq_cajero", allocationSize = 1)
	@Column(name = "caje_id")
	private Integer id;
	@Column(name = "caje_numero")
	private Integer numero;
	@Column(name = "caje_tipo")
	private String tipo; // normal o preferencial

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "caje_suba_id")
	private SucursalBanco sucursalBanco;

	// gets y sets
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public SucursalBanco getSucursalBanco() {
		return sucursalBanco;
	}

	public void setSucursalBanco(SucursalBanco sucursalBanco) {
		this.sucursalBanco = sucursalBanco;
	}

	@Override
	public String toString() {
		return "Cajero [id=" + id + ", numero=" + numero + ", tipo=" + tipo + "]";
	}

	
}
