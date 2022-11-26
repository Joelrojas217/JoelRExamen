package com.example.demo.modelo;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name="escuela")
public class Escuela implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		private long id;
	@ManyToOne
	@JoinColumn
	private String nombre;
	
	public Escuela() {
		
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
		public Escuela(String nombre) {
			super();
			this.nombre = nombre;
		}
		
		
		
		
		
}
