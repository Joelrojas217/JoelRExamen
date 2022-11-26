package com.example.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.io.Serializable;

import javax.accessibility.*;
@Entity
@Table (name = "alumno")
public class Alumno implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nombre;
	private String apellido;
	private String edad;
	
	@ManyToOne
	@JoinColumn (name="id_escuela")
	private Escuela escuela;
	@ManyToOne
	@JoinColumn (name="id_salon")
	private Salon salon;
	
	
	public Alumno() {
		
	}
	
	
	public Alumno(String nombre, String apellido, String edad, Escuela escuela, Salon salon) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.escuela = escuela;
		this.salon = salon;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public Escuela getEscuela() {
		return escuela;
	}
	public void setEscuela(Escuela escuela) {
		this.escuela = escuela;
	}
	public Salon getSalon() {
		return salon;
	}
	public void setSalon(Salon salon) {
		this.salon = salon;
	}
	
	
	
	
}
