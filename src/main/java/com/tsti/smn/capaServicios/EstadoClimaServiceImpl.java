package com.tsti.smn.capaServicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsti.smn.capaDaos.IEstadoClimaRepo;
import com.tsti.smn.pojos.EstadoClima;

@Service
public class EstadoClimaServiceImpl implements EstadoClimaService {
//	Logger LOG = LoggerFactory.getLogger(CiudadService.class);
//	
	@Autowired
	IEstadoClimaRepo repo;
	
	
	@Override
	public List<EstadoClima> getAll() {
		
//		List<EstadoClima> estadosLst = new ArrayList<EstadoClima>();
//		
//		EstadoClima e1 = new EstadoClima(1L, "Despejado");
//		estadosLst.add(e1);
//		
//		EstadoClima e2 = new EstadoClima(2L, "Nublado");
//		estadosLst.add(e2);
//		
//		EstadoClima e3 = new EstadoClima(3L, "Lluvioso");
//		estadosLst.add(e3);
//		
//		EstadoClima e4 = new EstadoClima(4L, "Nevando");
//		estadosLst.add(e4);
//		
//
//		return estadosLst;
		
		return repo.findAll();
	}



	@Override
	public EstadoClima getById(Long idEstadoClima) {
		
//		EstadoClima e = new EstadoClima(1L, "Despejado");
//		return e;
		
		return repo.findById(idEstadoClima).get();
	}
	

}
