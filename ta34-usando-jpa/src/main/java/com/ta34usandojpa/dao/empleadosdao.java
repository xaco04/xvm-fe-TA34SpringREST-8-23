package com.ta34usandojpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ta34usandojpa.dto.Trabajo;
import com.ta34usandojpa.dto.empleados;

public interface empleadosdao extends JpaRepository<empleados, Integer> {
		public List<empleados> findByTrabajo(Trabajo trabajo);
}
