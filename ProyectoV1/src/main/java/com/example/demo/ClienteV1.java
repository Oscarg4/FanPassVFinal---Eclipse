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
 * The persistent class for the cliente database table.
 * 
 */
@Entity(name="cliente")
@Table(name="cliente")
@NamedQuery(name="cliente.findAll", query="SELECT c FROM cliente c")
public class ClienteV1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_cliente")
	private int idCliente;

	@Column(name="ape_cliente")
	private String apeCliente;

	private String dni;

	@Column(name="nombre_cliente")
	private String nombreCliente;

	public ClienteV1() {
	}

	public int getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getApeCliente() {
		return this.apeCliente;
	}

	public void setApeCliente(String apeCliente) {
		this.apeCliente = apeCliente;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombreCliente() {
		return this.nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

}