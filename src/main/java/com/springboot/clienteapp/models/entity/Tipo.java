package com.springboot.clienteapp.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="tipo")
public class Tipo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_tipo;
	@NotEmpty
	private String tipo;
	public Long getId_tipo() {
		return id_tipo;
	}
	public void setId_tipo(Long id_tipo) {
		this.id_tipo = id_tipo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Tipo [id_tipo=" + id_tipo + ", tipo=" + tipo + "]";
	}
	public Tipo(Long id_tipo, @NotEmpty String tipo) {
		this.id_tipo = id_tipo;
		this.tipo = tipo;
	}
	public Tipo() {
	}
	
	
}
