package com.example.demo.cajero.repo.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Component
@Table(name = "sucursal_banco", schema = "public")
@Entity
public class SucursalBanco {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_sucursal_banco")
	@SequenceGenerator(name = "seq_sucursal_banco", sequenceName = "seq_sucursal_banco", allocationSize = 1)
	@Column(name = "suba_id")
	private Integer id;
	@Column(name = "suba_direccion")
	private String direccion;
	@Column(name = "suba_presupuesto")
	private BigDecimal presupuesto;
	@Column(name = "suba_fecha_apertura")
	private LocalDateTime fechaApertura;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Cajero> cajeros;

	//gets y sets
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public BigDecimal getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(BigDecimal presupuesto) {
		this.presupuesto = presupuesto;
	}

	public LocalDateTime getFechaApertura() {
		return fechaApertura;
	}

	public void setFechaApertura(LocalDateTime fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public List<Cajero> getCajeros() {
		return cajeros;
	}

	public void setCajeros(List<Cajero> cajeros) {
		this.cajeros = cajeros;
	}

	@Override
	public String toString() {
		return "SucursalBanco [id=" + id + ", direccion=" + direccion + ", presupuesto=" + presupuesto
				+ ", fechaApertura=" + fechaApertura + "]";
	}
	
	

}
