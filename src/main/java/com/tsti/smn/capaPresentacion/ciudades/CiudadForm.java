package com.tsti.smn.capaPresentacion.ciudades;

import com.tsti.smn.pojos.Ciudad;
import com.tsti.smn.pojos.Persona;

/**
 * Objeto necesario para insertar o eliminar una persona. 
 * Nótese que en lugar de referenciar al objeto Ciudad, reemplaza ese atributo por el idCiudad, lo cual resulta mas sencillo de representar en JSON
 *
 */
public class CiudadForm {



//	@NotNull
//	@Size(min=2, max=30)
	private String nombre;
//	@NotNull
	private Long idProvincia;
	
	
	public CiudadForm() {
		super();
	}
	public CiudadForm(Ciudad p) {
		super();
		this.nombre=p.getNombre();
		this.idProvincia=p.getProvincia().getId();
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public Long getIdProvincia() {
		return idProvincia;
	}
	public void setIdProvincia(Long idProvincia) {
		this.idProvincia = idProvincia;
	}
	public Ciudad toPojo()
	{
		Ciudad c = new Ciudad();
		c.setNombre(this.getNombre());
		return c;
	}
	
	
}
