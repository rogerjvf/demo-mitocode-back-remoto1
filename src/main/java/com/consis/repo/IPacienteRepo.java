package com.consis.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.consis.model.Paciente;

//@Repository //pasa a ser opcional ya que JpaRepository contiene el manejo de las instacias(inyeccion de dependencias) con spring
public interface IPacienteRepo extends JpaRepository<Paciente,Integer>{  

}
