package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	private services id_clientes;
	
	@GetMapping(value= "cliente", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<ClienteV1> obtener_id_cliente(){
		return id_clientes.obtener_id_cliente();
		
	}
	@GetMapping(value= "aboutus", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Aboutuss> obtenerAboutuss(){
		return id_clientes.obtenerAboutus();
	}
		
	@GetMapping(value= "contacto", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Contactoo> obtenerContactoo(){
		return id_clientes.obtenerContacto();
	}
	
}
