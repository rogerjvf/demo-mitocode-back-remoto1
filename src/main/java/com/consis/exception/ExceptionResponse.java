package com.consis.exception;

import java.util.Date;

public class ExceptionResponse {
	
	private Date timeStamp;
	private String mensaje;
	private String detalles;
	
	public ExceptionResponse() {
		
	}

	public ExceptionResponse(Date timeStamp, String mensaje, String detalles) {
		this.timeStamp = timeStamp;
		this.mensaje = mensaje;
		this.detalles = detalles;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}
	
	

}
