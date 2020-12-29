package com.springboot.clienteapp.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="marca")
public class Marca implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_marca;
	@NotEmpty
	private String marca;
	public Long getId_marca() {
		return id_marca;
	}
	public void setId_marca(Long id_marca) {
		this.id_marca = id_marca;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Marca [id_marca=" + id_marca + ", marca=" + marca + "]";
	}
	
	
}
