package com.testmios.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.testmios.springboot.backend.apirest.models.dao.IClienteDao;
import com.testmios.springboot.backend.apirest.models.dao.IFacturaDao;
import com.testmios.springboot.backend.apirest.models.entity.Cliente;
import com.testmios.springboot.backend.apirest.models.entity.Factura;
import com.testmios.springboot.backend.apirest.models.entity.Region;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteDao clienteDao;
	
	@Autowired
	private IFacturaDao facturaDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return (List<Cliente>) clienteDao.findAll();
	}
	
	@Override
	@Transactional(readOnly=true)
	public Page<Cliente> findAll(Pageable page) {
		// TODO Auto-generated method stub
		return clienteDao.findAllByOrderByCreateAtDesc(page);
	} 
	
	
	@Override
	@Transactional(readOnly=true)
	public Cliente findById(long id) {
		// TODO Auto-generated method stub
		return clienteDao.findById(id).orElse(null);
	}
	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteDao.save(cliente);
	}
	@Override
	@Transactional
	public void delete(long id) {
	clienteDao.deleteById(id);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Region> findAllRegiones() {
		// TODO Auto-generated method stub
		return clienteDao.findAllRegiones();
	}

	@Override
	@Transactional(readOnly=true)
	public Factura findFacturaById(Long id) {
		return facturaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Factura saveFactura(Factura factura) {
		return facturaDao.save(factura);
	}

	@Override
	@Transactional
	public void deleteFacura(Long id) {
		facturaDao.deleteById(id);
	}

}
