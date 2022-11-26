package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Escuela;
import com.example.demo.modelo.Salon;
import com.example.demo.services.EscuelaServices;
import com.example.demo.services.SalonServices;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping ("/escuelas/")
public class EscuelaRest {
	
	@Autowired
	private EscuelaServices escuelaServices;
	
//	@GetMapping
//	private ResponseEntity<List<Escuela>> getAllEscuela(){
//		
//		return ResponseEntity.ok(escuelaServices.findAll());
//	}

	
//	
	@GetMapping	("{id}")
	private ResponseEntity<List<Escuela>> getAllSalonByAlumno(@PathParam ("id") Long idSalon){
		 return ResponseEntity.ok(escuelaServices.findAllByAlumno(idSalon));
	}

}
