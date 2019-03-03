package com.testmios.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.testmios.springboot.backend.apirest.models.entity.Cliente;
import com.testmios.springboot.backend.apirest.models.entity.Region;

public interface IClienteService {
	
	public Cliente findById(long id);

	public List<Cliente> findAll();
	
	public Page<Cliente> findAll(Pageable page);
	
	public Cliente save(Cliente cliente);
	
	public void delete (long id);
	
	public List<Region> findAllRegiones();
	
}
