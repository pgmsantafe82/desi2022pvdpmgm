package com.tsti.smn.capaPresentacion.clima;

import java.util.Date;


public class ClimaBuscarForm {

	private Date fecha;

	private Long idCiudad;

	
	public ClimaBuscarForm() {
		super();
	}

	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Long getIdCiudad() {
		return idCiudad;
	}
	public void setIdCiudad(Long idCiudad) {
		this.idCiudad = idCiudad;
	}
}
