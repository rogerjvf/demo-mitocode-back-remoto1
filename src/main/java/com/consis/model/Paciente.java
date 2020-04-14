package com.consis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Informacion del Paciente")
@Entity
@Table(name = "paciente")
public class Paciente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPaciente;
	
	@ApiModelProperty(notes = "Nombres debe tener un minimo de 3 caracteres ")
	@Column(name = "nombres", nullable = false, length = 70)
	@Size(min = 3, message = "Nombres debe tener un minimo de 3 caracteres ")
	private String nombres; 
	
	@ApiModelProperty(notes = "Apellidos debe tener un minimo de 3 caracteres ")
	@Column(name = "apellidos", nullable = false, length = 70)
	@Size(min = 3, message = "Apellidos debe tener un minimo de 3 caracteres ")
	private String apellidos;
	
	@ApiModelProperty(notes = "DNI debe tener 8 caracteres ")
	@Column(name = "dni", nullable = false, length = 8)
	@Size(min = 8, max = 8, message = "DNI debe tener 8 caracteres ")
	private String dni;
	
	@ApiModelProperty(notes = "Direccion debe tener un minimo de 5 caracteres ")
	@Column(name = "direccion", nullable = true, length = 150)
	@Size(min = 5, message = "Direccion debe tener un minimo de 5 caracteres ")
	private String direccion;
	
	@ApiModelProperty(notes = "Telefono debe tener 9 caracteres ")
	@Column(name = "telefono", nullable = true, length = 9)
	@Size(min = 9, message = "Telefono debe tener 9 caracteres ")
	private String telefono; 
	
	@ApiModelProperty(notes = "")
	@Email
	private String email;
	
	public Integer getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
