package com.example.demo;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;


/**
 * The persistent class for the contacto database table.
 * 
 */
@Entity(name="contacto")
@Table(name="contacto")
@NamedQuery(name="contacto.findAll", query="SELECT c FROM contacto c")
public class Contactoo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="nombre_empresa")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String nombreEmpresa;

	private String correo;

	@Column(name="num_telefono")
	private int numTelefono;

	private String web;

	public Contactoo() {
	}

	public String getNombreEmpresa() {
		return this.nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getNumTelefono() {
		return this.numTelefono;
	}

	public void setNumTelefono(int numTelefono) {
		this.numTelefono = numTelefono;
	}

	public String getWeb() {
		return this.web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

}