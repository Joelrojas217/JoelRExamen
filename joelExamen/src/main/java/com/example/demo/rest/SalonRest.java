package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Salon;
import com.example.demo.services.SalonServices;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping ("/salones/")
public class SalonRest {

	
	@Autowired
	private SalonServices salonServices;
	
//	@GetMapping
//	private ResponseEntity<List<Salon>> getAllSalon(){
//		
//		return ResponseEntity.ok(salonServices.findAll());
//	}
//	
	@GetMapping	("{id}")
	private ResponseEntity<List<Salon>> getAllSalonByEscuela(@PathParam ("id") Long idSalon){
		 return ResponseEntity.ok(salonServices.findAllBySalon(idSalon));
	}
	
}
