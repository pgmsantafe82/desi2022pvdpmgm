package com.tsti.smn.capaPresentacion.ciudades;

public class CiudadesBuscarForm {
	private String nombre;
	private String provinciaSeleccionada;
	
	
//	private List<Provincia> provincias;

	
	
//	public List<Provincia> getProvincias() {
//		return provincias;
//	}
//	public void setProvincias(List<Provincia> provincias) {
//		this.provincias = provincias;
//	}
	
	public String getProvinciaSeleccionada() {
		return provinciaSeleccionada;
	}
	public void setProvinciaSeleccionada(String provinciaSeleccionada) {
		this.provinciaSeleccionada = provinciaSeleccionada;
	}
	
	public String getNombre() {
		if(nombre!=null && nombre.length()>0)
			return nombre;
		else
			return null;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
