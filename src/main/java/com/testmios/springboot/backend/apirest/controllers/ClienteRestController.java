package com.testmios.springboot.backend.apirest.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.testmios.springboot.backend.apirest.models.entity.Cliente;
import com.testmios.springboot.backend.apirest.models.services.IClienteService;
@CrossOrigin(origins= {"*"})
@RestController
@RequestMapping("/api")
public class ClienteRestController {

		@Autowired
		private IClienteService clienteService;
		@GetMapping("/clientes")
		public List<Cliente> index(){
			return clienteService.findAll();
		}
		
		@GetMapping("/clientes/{id}")
		public ResponseEntity<?> show(@PathVariable Long id) {
			Cliente cliente = null;
			Map<String,Object> response = new HashMap<>();
			try {
				cliente = clienteService.findById(id);
			} catch(DataAccessException e) {
				response.put("mensaje", "error al realizar la consulta en la base de datos!");
				response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
				return new ResponseEntity<Map<String,Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR); 
			}
			
			if(cliente == null) {
				response.put("mensaje", "El Cliente con ID:".concat(id.toString()).concat("No se encuentra en la base de datos"));
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.NOT_FOUND); 
			}
			return new ResponseEntity<Cliente>(cliente,HttpStatus.OK); 
		}
		
		@PostMapping("/clientes") //Save Client
		@ResponseStatus(HttpStatus.CREATED)
		public Cliente create(@RequestBody Cliente cliente) {
			return clienteService.save(cliente);
		}
		
		@PutMapping("/clientes/{id}") //Save Client
		@ResponseStatus(HttpStatus.CREATED)
		public Cliente update(@RequestBody Cliente cliente, @PathVariable long id) {
			Cliente clienteActual = clienteService.findById(id);
			clienteActual.setNombre(cliente.getNombre());
			clienteActual.setApellido(cliente.getApellido());
			clienteActual.setEmail(cliente.getEmail());
			return clienteService.save(clienteActual);
		}
		
		@DeleteMapping("/clientes/{id}")
		@ResponseStatus(HttpStatus.NO_CONTENT)
		public void delete(@PathVariable long id) {
			clienteService.delete(id);
		}
		
}

//ResponseEntity: Manejo de errores o excepciones
		

