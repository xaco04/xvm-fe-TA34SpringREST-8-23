package com.ta34usandojpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ta34usandojpa.dto.Trabajo;
import com.ta34usandojpa.dto.empleados;
import com.ta34usandojpa.service.EFempleadosservice;

@RestController
public class empleadoCont {
	@Autowired
	EFempleadosservice EFempleadosservice;

	@GetMapping("/empleados")
	public List<empleados> listarEmpleados() {

		return EFempleadosservice.listEmpleado();
	}

	@GetMapping("/empleados/{id}")
	public empleados buscarEmpleadoPorId(@PathVariable(name = "id") int id) {

		return EFempleadosservice.searchEmpleadoId(id);
	}

	@GetMapping("/empleados/trabajo/{trabajo}")
	public List<empleados> buscarEmpleadoPorTrabajo(@PathVariable(name = "trabajo") Trabajo trabajo) {

		return EFempleadosservice.searchEmpleadoTrabajo(trabajo);
	}

	@PostMapping("/empleados")
	public empleados guardarEmpleado(@RequestBody empleados empleado) {

		switch (empleado.getTrabajo()) {
			case Programador:
				empleado.setSalario(1000);
				break;
	
			case Professor:
				empleado.setSalario(2000);
				break;
	
			case Medico:
				empleado.setSalario(3000);
				break;
	
			case Bombero:
				empleado.setSalario(1500);
				break;
				
			case Policia:
				empleado.setSalario(1200);
				break;
	
			default:
				empleado.setSalario(900);
				break;
		}

		return EFempleadosservice.saveEmpleado(empleado);
	}

	@PutMapping("/empleados/{id}")
	public empleados actualizarEmpleado(@PathVariable(name = "id") int id, @RequestBody empleados empleado) {

	    empleados empleadoSeleccionado = EFempleadosservice.searchEmpleadoId(id);
	    empleadoSeleccionado.setNombre(empleado.getNombre());
	    empleadoSeleccionado.setTrabajo(empleado.getTrabajo());

	    switch (empleado.getTrabajo()) {
	        case Programador:
	            empleadoSeleccionado.setSalario(1000);
	            break;

	        case Professor:
	            empleadoSeleccionado.setSalario(2000);
	            break;

	        case Medico:
	            empleadoSeleccionado.setSalario(3000);
	            break;

	        case Bombero:
	            empleadoSeleccionado.setSalario(1500);
	            break;

	        case Policia:
	            empleadoSeleccionado.setSalario(1200);
	            break;

	        default:
	            empleadoSeleccionado.setSalario(900);
	            break;
	    }

	    empleados empleadoActualizado = EFempleadosservice.updatedEmpleado(empleadoSeleccionado);

	    return empleadoActualizado;
	}


	
	@DeleteMapping("/empleados/{id}")
	public void eliminarEmpleado(@PathVariable(name = "id") int id) {
		
		EFempleadosservice.deleteEmpleado(id);
	}
}




