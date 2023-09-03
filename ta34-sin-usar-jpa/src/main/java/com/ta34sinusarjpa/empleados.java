package com.ta34sinusarjpa;

public class empleados {
	
	//Atributos
	private int id;
	private double salario;
	private String nombre;
	private Trabajo trabajo;
	
	//Constructores 
	public empleados() {
		this.id = 0;
		this.salario = 0;
		this.nombre = "";
		this.trabajo = Trabajo.Programador;
		// TODO Auto-generated constructor stub
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
