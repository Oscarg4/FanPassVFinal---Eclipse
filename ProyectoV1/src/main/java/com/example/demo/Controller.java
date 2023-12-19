package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	@GetMapping(value= "aboutUs", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Aboutuss> obtenerAboutuss(){
		return id_clientes.obtenerAboutus();
	}
		
	@GetMapping(value= "contacto", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Contactoo> obtenerContactoo(){
		return id_clientes.obtenerContacto();
	}
	
	@GetMapping(value = "id", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<ClienteV1> obtenerClientesConIdSuperiorAUno() {
        return id_clientes.obtenerClientesConIdSuperiorAUno();
    }
	
	@GetMapping(value = "letrao", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<ClienteV1> obtenerClientesConLetraO() {
        return id_clientes.obtenerClientesConLetraO();
    }
	
	@PostMapping(value = "cliente/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> agregarCliente(@RequestBody ClienteV1 cliente)
	{
		id_clientes.insertarCliente(cliente);
		return ResponseEntity.ok("Cliente agregado correctamente.");
	}
	
	@PutMapping(value = "cliente/update", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> actualizarCliente(@RequestBody ClienteV1 cliente)
	{
		id_clientes.actualizarCliente(cliente);
		return ResponseEntity.ok("Cliente actualizado correctamente.");
	}
	
	@DeleteMapping(value = "cliente/delete/{clienteId}" )
	public ResponseEntity<String> eliminarCliente(@PathVariable Long clienteId)
	{
		id_clientes.eliminarCliente(clienteId);
		return ResponseEntity.ok("Cliente eliminado correctamente.");
	}
	
	

	
}
