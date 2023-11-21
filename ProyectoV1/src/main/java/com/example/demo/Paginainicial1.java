package com.example.demo;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

import java.sql.Timestamp;


/**
 * The persistent class for the paginainicial database table.
 * 
 */
@Entity(name="paginainicial")
@Table(name="paginainicial")
@NamedQuery(name="paginainicial.findAll", query="SELECT p FROM paginainicial p")
public class Paginainicial1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_pagina")
	private int idPagina;

	@Lob
	private String contenido;

	@Lob
	private String descripcion;

	@Column(name="fecha_creacion")
	private Timestamp fechaCreacion;

	private String titulo;

	public Paginainicial1() {
	}

	public int getIdPagina() {
		return this.idPagina;
	}

	public void setIdPagina(int idPagina) {
		this.idPagina = idPagina;
	}

	public String getContenido() {
		return this.contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Timestamp getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}