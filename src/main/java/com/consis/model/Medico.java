package com.consis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Informacion de Medico")
@Entity
@Table(name="medico")
public class Medico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer idMedico;
	
	@Column(name="nombres", nullable=false, length=70)
	@ApiModelProperty(notes = "Nombre debe contener mas de 3 caracteres")
	@Size(min = 3, message = "Nombre debe contener mas de 3 caracteres")
	private String nombres;
	
	@Column(name="apellidos", nullable=false, length=70)
	@ApiModelProperty(notes = "apellidos debe contener mas de 3 caracteres")
	@Size(min = 3, message = "Apellidos debe contener mas de 3 caracteres")
	private String apellidos;
	
	@Column(name="CMP", nullable=false, length=12)
	@ApiModelProperty(notes = "CPM debe contener 12 caracteres")
	@Size(min = 12, message = "CPM debe contener 12 caracteres")
	private String CMP;
	
	public Integer getIdMedico() {
		return idMedico;
	}
	public void setIdMedico(Integer idMedico) {
		this.idMedico = idMedico;
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
	public String getCMP() {
		return CMP;
	}
	public void setCMP(String cMP) {
		CMP = cMP;
	}
	

}
