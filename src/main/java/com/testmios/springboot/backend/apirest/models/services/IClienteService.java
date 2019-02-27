package com.testmios.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.testmios.springboot.backend.apirest.models.entity.Cliente;

public interface IClienteService {
	
	public Cliente findById(long id);

	public List<Cliente> findAll();
	
	public Page<Cliente> findAll(Pageable page);
	
	public Cliente save(Cliente cliente);
	
	public void delete (long id);
	
}
