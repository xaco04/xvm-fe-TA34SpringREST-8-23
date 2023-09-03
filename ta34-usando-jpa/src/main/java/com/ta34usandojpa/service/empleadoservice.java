package com.ta34usandojpa.service;


import java.util.List;

import com.ta34usandojpa.dto.empleados;
import com.ta34usandojpa.dto.Trabajo;

public interface empleadoservice {
	
	public List<empleados> listEmpleado();
	
	public empleados searchEmpleadoId(int id);
	
	public List<empleados> searchEmpleadoTrabajo(Trabajo trabajo);
	
	public empleados saveEmpleado(empleados empleado);
	
	public empleados updatedEmpleado(empleados empleado);
	
	public void deleteEmpleado(int id);

}
