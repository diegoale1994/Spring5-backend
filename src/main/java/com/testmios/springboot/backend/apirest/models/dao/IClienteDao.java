package com.testmios.springboot.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.testmios.springboot.backend.apirest.models.entity.Cliente;
import com.testmios.springboot.backend.apirest.models.entity.Region;

public interface IClienteDao extends JpaRepository<Cliente,Long> {
	
	@Query("from Region")
	public List<Region> findAllRegiones();
	Page<Cliente> findAllByOrderByCreateAtDesc(Pageable page);
}
