package com.testmios.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.testmios.springboot.backend.apirest.models.entity.Factura;

public interface IFacturaDao extends CrudRepository<Factura, Long> {

}
