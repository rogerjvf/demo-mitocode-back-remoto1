 package com.consis.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.consis.exception.ModelNotFoundException;
import com.consis.model.Paciente;
import com.consis.service.IPacienteService;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
	
	@Autowired
	private IPacienteService service;
	
	@GetMapping
	public ResponseEntity<List<Paciente>> listar(){
		List <Paciente> lista= service.listar();
		return new ResponseEntity<List <Paciente>>(lista, HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}") 
	public ResponseEntity<Paciente> leerPorId(@PathVariable("id") Integer id) {
		System.out.println("Controller El id del paciente a consultar  es:"+id);
		Paciente obj = service.leerPorId(id); 
		if (obj.getIdPaciente()==null) {
			System.out.println("no existe  es:"+id);
			throw new ModelNotFoundException("Id no encontrado "+id);
		}else		
			return new ResponseEntity<Paciente>(obj,HttpStatus.OK); 
	}
	
	@PostMapping
	public ResponseEntity<Object> registrar(@Valid @RequestBody Paciente paci) {
		System.out.println(paci.getNombres()+" "+paci.getApellidos());
		Paciente obj = service.registrar(paci);
		if (obj.getIdPaciente()>0) {
			URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdPaciente()).toUri();
			return ResponseEntity.created(location).build();
		}else		
		return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@PutMapping
	public ResponseEntity<Object> modificar(@Valid @RequestBody Paciente paci) {
		service.modificar(paci);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}
	

}
