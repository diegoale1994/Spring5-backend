package com.testmios.springboot.backend.apirest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.testmios.springboot.backend.apirest.models.entity.Factura;
import com.testmios.springboot.backend.apirest.models.services.IClienteService;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/api")
public class FacturaRestController {

	@Autowired
	private IClienteService clienteService;
	
	@GetMapping("/facturas/id/{id}")
	@ResponseStatus(code=HttpStatus.OK)
	public Factura show(@PathVariable("id") Long id) {
		return clienteService.findFacturaById(id);
	}
	
}