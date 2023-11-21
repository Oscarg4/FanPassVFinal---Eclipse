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
	}
