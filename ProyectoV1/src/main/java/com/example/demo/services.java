package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
	
	@Service
	public class services {
		
			@Autowired
			private Dao id_cliente_dao;
			
			public List<ClienteV1> obtener_id_cliente(){
				return id_cliente_dao.obtener_id_cliente();
			}
			public List<Aboutuss> obtenerAboutus(){
				return id_cliente_dao.obtenerAboutus();
			}
			public List<Contactoo> obtenerContacto(){
				return id_cliente_dao.obtenerContacto();
			}
			 public List<ClienteV1> obtenerClientesConIdSuperiorAUno() {
			        return id_cliente_dao.obtenerClientesConIdSuperiorAUno();
			}
			 public List<ClienteV1> obtenerClientesConLetraO() {
			        return id_cliente_dao.obtenerClientesConLetraO();
			}
			public void insertarCliente(ClienteV1 cliente) 
			{
				id_cliente_dao.insertarCliente(cliente);
			}
			public void actualizarCliente(ClienteV1 cliente) 
			{
				id_cliente_dao.actualizarCliente(cliente);
			}
			public void eliminarCliente(Long clienteId) 
			{
				id_cliente_dao.eliminarCliente(clienteId);
			}
			
			
			}

			
	
