package com.springboot.clienteapp.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.validation.constraints.NotEmpty;


@Entity
@Table(name="auto")
public class Auto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_auto;
	@NotEmpty
	private String anho;
	@NotEmpty
	private String chapa;
	@NotEmpty
	private String chasis;
	@NotEmpty
	private String disponible;
	@NotEmpty
	private String modelo;
	
	private double precio;
	
	private Long cantidadcambios;
	
	private String historialmantenimiento;
	
	private char tipoautomovil;

	private char gps;

	public Long getCantidadcambios() {
		return cantidadcambios;
	}
	public void setCantidadcambios(Long cantidadcambios) {
		this.cantidadcambios = cantidadcambios;
	}
	public String getHistorialmantenimiento() {
		return historialmantenimiento;
	}
	public void setHistorialmantenimiento(String historialmantenimiento) {
		this.historialmantenimiento = historialmantenimiento;
	}
	public char getTipoautomovil() {
		return tipoautomovil;
	}
	public void setTipoautomovil(char tipoautomovil) {
		this.tipoautomovil = tipoautomovil;
	}
	public char getGps() {
		return gps;
	}
	public void setGps(char gps) {
		this.gps = gps;
	}
	public Long getId_auto() {
		return id_auto;
	}
	public void setId_auto(Long id_auto) {
		this.id_auto = id_auto;
	}
	public String getAnho() {
		return anho;
	}
	public void setAnho(String anho) {
		this.anho = anho;
	}
	public String getChapa() {
		return chapa;
	}
	public void setChapa(String chapa) {
		this.chapa = chapa;
	}
	public String getChasis() {
		return chasis;
	}
	public void setChasis(String chasis) {
		this.chasis = chasis;
	}
	public String getDisponible() {
		return disponible;
	}
	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Auto [id_auto=" + id_auto + ", anho=" + anho + ", chapa=" + chapa + ", chasis=" + chasis
				+ ", disponible=" + disponible + ", modelo=" + modelo + ", precio=" + precio + ", cantidadcambios="
				+ cantidadcambios + ", historialmantenimiento=" + historialmantenimiento + ", tipoautomovil="
				+ tipoautomovil + ", gps=" + gps + "]";
	}
	
	
	
}
