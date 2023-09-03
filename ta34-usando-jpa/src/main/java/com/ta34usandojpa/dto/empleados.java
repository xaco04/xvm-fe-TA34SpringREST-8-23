package com.ta34usandojpa.dto;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "empleados")
public class empleados {
	
	//Propiedades
	@Id	//Indico que es clave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Se generara automaticamente
	private int id;
	
	@Column(name = "salario")
	private double salario;

	@Column(name = "nombre")
	private String nombre;

	@Enumerated(EnumType.STRING)
	@Column(name = "trabajo")
	private Trabajo trabajo;


	// Constructores
    public empleados() {
        // Deja el cuerpo del constructor vacío o inicializa valores predeterminados si es necesario
    }
	
	
	
	public empleados(int id, String nombre, Trabajo trabajo, double salario) {
		this.id = id;
		this.nombre = nombre;
		this.trabajo = trabajo;
		this.salario = salario;
	}
	
	
	//Getters
		public int getId() {
			return id;
		}
		public double getSalario() {
			return salario;
		}
		public String getNombre() {
			return nombre;
		}
		
		public Trabajo getTrabajo() {
			return trabajo;
		}
		//Setters
		
		public void setId(int id) {
			this.id = id;
		}
		
		public void setSalario(double salario) {
			this.salario = salario;
		}
		
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public void setTrabajo(Trabajo trabajo) {
			this.trabajo = trabajo;
		}
		
		@Override
		public String toString() {
			return "id = " + id + " | nombre = " + nombre + " | trabajo = " + trabajo + " | salario = " + salario;
		}

}
