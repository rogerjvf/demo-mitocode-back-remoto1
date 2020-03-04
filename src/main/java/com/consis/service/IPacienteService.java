package com.consis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.consis.model.Paciente;


public interface IPacienteService {
	
	void registrar(Paciente paciente);
	
	void modificar(Paciente paciente);
	
	List<Paciente> listar();
	
	Paciente leerPorId(Integer id);
	
	void eliminar(Integer id);

}
