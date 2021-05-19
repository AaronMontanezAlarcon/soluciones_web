package com.amontanez.demo.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amontanez.demo.dao.IEmpleadoDAO;
import com.amontanez.demo.entity.Empleado;

@Service
public class EmpleadoServiceimpl implements IEmpleadoService{
	
	@Autowired
	private IEmpleadoDAO empleadoDAO;

	@Override
	public void save(Empleado empleado) {
		empleadoDAO.save(empleado);
		
	}

	@Override
	public List<Empleado> findAll() {
		return (List<Empleado>)empleadoDAO.findAll();
	}
	
}
