package com.tsti.smn.capaServicios;

import java.util.List;

import com.tsti.smn.pojos.EstadoClima;

public interface EstadoClimaService {

	List<EstadoClima> getAll();
		
	EstadoClima getById(Long idEstadoClima);
	
}
