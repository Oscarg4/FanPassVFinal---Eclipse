package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class Dao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<ClienteV1> obtener_id_cliente()
	{
		return entityManager.createQuery("Select c FROM cliente c", ClienteV1.class).getResultList();
	}
	
	public List<Aboutuss> obtenerAboutus()
	{
		return entityManager.createQuery("Select c FROM aboutus c", Aboutuss.class).getResultList();
	}
	
	public List<Contactoo> obtenerContacto()
	{
		return entityManager.createQuery("Select c FROM contacto c", Contactoo.class).getResultList();
	}

	
	
}
