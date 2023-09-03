package com.ta34usandojpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta34usandojpa.dao.empleadosdao;
import com.ta34usandojpa.dto.Trabajo;
import com.ta34usandojpa.dto.empleados;

@Service
public class EFempleadosservice implements empleadoservice {
	
	@Autowired
	empleadosdao empleadosdao;
	
	@Override
	public List<empleados> listEmpleado() {
		return empleadosdao.findAll();
	}
	
	@Override
	public empleados searchEmpleadoId(int id) {
		return empleadosdao.findById(id).get();
	}
	
	@Override
	public List<empleados> searchEmpleadoTrabajo(Trabajo trabajo){
		return empleadosdao.findByTrabajo(trabajo);
		
	}
	
	@Override
	public empleados saveEmpleado(empleados empleado) {
		return empleadosdao.save(empleado);
	}
	
	@Override
	public empleados updatedEmpleado(empleados empleado) {
		return empleadosdao.save(empleado);
		
	}
	@Override
	public void deleteEmpleado(int id) {
		empleadosdao.deleteById(id);
	}
	
	
}
