package com.consis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consis.model.Paciente;
import com.consis.service.IPacienteService;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
	
	@Autowired
	private IPacienteService service;
	
	@GetMapping
	public List<Paciente> listar(){
		return service.listar();
	}
	
	@GetMapping(value = "/{id}") 
	public Paciente leerPorId(@PathVariable("id") Integer id) {
		System.out.println("Controller El id del paciente a borrar es:"+id);
		Paciente obj= service.leerPorId(id);
		return obj;
	}
	
	@PostMapping
	public void registrar(@RequestBody Paciente paci) {
		System.out.println(paci.getPaciente()+" "+paci.getApellidos());
		service.registrar(paci);
	}
	
	@PutMapping
	public void modificar(@RequestBody Paciente paci) {
		service.modificar(paci);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}
	

}
