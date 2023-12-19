package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

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
	public List<ClienteV1> obtenerClientesConIdSuperiorAUno() {
        return entityManager.createQuery("SELECT c FROM cliente c WHERE c.idCliente > 1", ClienteV1.class)
            .getResultList();
    }
	public List<ClienteV1> obtenerClientesConLetraO() {
        return entityManager.createQuery("SELECT c FROM cliente c WHERE LOWER(c.nombreCliente) LIKE '%o%'", ClienteV1.class)
            .getResultList();
    }
	@Transactional
	public void insertarCliente(ClienteV1 cliente)
	{
		entityManager.persist(cliente);
	}
	
	@Transactional
	public void actualizarCliente(ClienteV1 cliente)
	{
		entityManager.merge(cliente);
	}
	
	@Transactional
	public void eliminarCliente(Long clienteId)
	{
		ClienteV1 cliente = entityManager.find(ClienteV1.class, clienteId);
		if(cliente != null) 
		{
			entityManager.remove(cliente);
		}
	}

}
