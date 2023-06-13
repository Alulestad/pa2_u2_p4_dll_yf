package com.example.demo.banco.repo.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Component
@Table(name = "cta_bancaria", schema = "public")
@Entity
public class CtaBancaria {

	@Id
	@GeneratedValue(generator = "seq_cta_bancaria",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name="seq_cta_bancaria", sequenceName = "seq_cta_bancaria",allocationSize = 1)
	@Column(name = "cuenta_id")
	private Integer id;
	@Column(name = "cuenta_numero")
	private String numero;
	@Column(name = "cuenta_tipo")
	private String tipo;
	@Column(name = "cuenta_fecha_apertura")
	private LocalDateTime fechaApertura;//without time zone
	@Column(name = "cuenta_saldo")
	private BigDecimal saldo;  //numeric con 6 decimales
	@Column(name = "cuenta_cedula")
	private String cedula;
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public LocalDateTime getFechaApertura() {
		return fechaApertura;
	}
	public void setFechaApertura(LocalDateTime fechaApertura) {
		this.fechaApertura = fechaApertura;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "CtaBancaria [id=" + id + ", numero=" + numero + ", tipo=" + tipo + ", fechaApertura=" + fechaApertura
				+ ", saldo=" + saldo + ", cedula=" + cedula + "]";
	}
	
	
	
	
}
