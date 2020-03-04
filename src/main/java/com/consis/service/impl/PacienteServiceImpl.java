package com.consis.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consis.model.Paciente;
import com.consis.repo.IPacienteRepo;
import com.consis.service.IPacienteService;

@Service
public class PacienteServiceImpl implements IPacienteService{
	
	@Autowired
	private IPacienteRepo repo;

	@Override
	public void registrar(Paciente paciente) {
		repo.save(paciente);
	}

	@Override
	public void modificar(Paciente paciente) {
		repo.save(paciente);
	}

	@Override
	public List<Paciente> listar() {
		return repo.findAll();
	}

	@Override
	public Paciente leerPorId(Integer id) {
		System.out.println("Service El id del paciente a borrar es:"+id);		
		Optional<Paciente> paci = repo.findById(id);
		return paci.isPresent()==true ? paci.get() : new Paciente();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}
		
}
