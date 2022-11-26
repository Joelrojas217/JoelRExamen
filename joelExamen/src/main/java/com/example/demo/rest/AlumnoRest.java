package com.example.demo.rest;


import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage.Body;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Alumno;
import com.example.demo.services.AlumnoServices;

@RestController 
@RequestMapping ("/alumnos/")
public class AlumnoRest {
	
	@Autowired
	private AlumnoServices alumnoServices;
	
	@GetMapping
	private ResponseEntity<List<Alumno>> getAllAlumno(){
		
		return ResponseEntity.ok(alumnoServices.findAll());
	}
	
	@PostMapping
	private ResponseEntity<Alumno> saveAlumno(@RequestBody Alumno alumno){
		
		Alumno alumnoGuardado=alumnoServices.save(alumno);
		try {
		return 	ResponseEntity.created(new URI("/alumnos/"+alumnoGuardado.getId())).body(alumnoGuardado);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
	}
	
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deleteAlumno(@PathVariable ("id") Long id){
		alumnoServices.deleteById(id);
		return ResponseEntity.ok(!(alumnoServices.findById(id)!=null));
		
		
		
		
	}
	
	


}
