package com.example.demo;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;


/**
 * The persistent class for the aboutus database table.
 * 
 */
@Entity(name="aboutus")
@Table(name="aboutus")
@NamedQuery(name="aboutus.findAll", query="SELECT a FROM aboutus a")
public class Aboutuss implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id_aboutUs;

	@Lob
	@Column(name="descripcion_empresa")
	private String descripcionEmpresa;

	@Column(name="nombre_empresa")
	private String nombreEmpresa;

	public Aboutuss() {
	}

	public int getId_aboutUs() {
		return this.id_aboutUs;
	}

	public void setId_aboutUs(int id_aboutUs) {
		this.id_aboutUs = id_aboutUs;
	}

	public String getDescripcionEmpresa() {
		return this.descripcionEmpresa;
	}

	public void setDescripcionEmpresa(String descripcionEmpresa) {
		this.descripcionEmpresa = descripcionEmpresa;
	}

	public String getNombreEmpresa() {
		return this.nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

}