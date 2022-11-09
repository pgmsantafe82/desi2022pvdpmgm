package com.tsti.smn.capaServicios;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsti.smn.capaDaos.IClimaRepo;
import com.tsti.smn.capaPresentacion.clima.ClimaBuscarForm;
import com.tsti.smn.pojos.Clima;

@Service
public class ClimaServiceImpl implements ClimaService {

	@Autowired
	IClimaRepo repo;
	
	@Override
	public List<Clima> getAll() {
		
//		try {
//			List<Clima> climaLst =new ArrayList<Clima>();
//			
//			Ciudad c1 = new Ciudad(1L,"Santa Fe");
//			EstadoClima e1 = new EstadoClima(1L, "Despejado");
//			Clima cl1 = new Clima(1l, new java.util.Date(), c1, 20.8f, 75f, e1);
//			climaLst.add(cl1);
//
//			Ciudad c2 = new Ciudad(2L,"Cordoba");
//			EstadoClima e2 = new EstadoClima(2L, "Nublado");
//			Clima cl2 = new Clima(1l, new java.util.Date(), c2, 30.2f, 60f, e2);
//			climaLst.add(cl2);
//
//			return climaLst;
			
//		} catch (ParseException e) {
//			
//			e.printStackTrace();
//			
//			return new ArrayList<Clima>();
//		}
		return repo.findAll();
	}

	@Override
	public List<Clima> filter(ClimaBuscarForm filter) {
		
//		try {
//			Ciudad c1 = new Ciudad(1L,"Santa Fe");
//			EstadoClima e1 = new EstadoClima(1L, "Despejado");
//
//			List<Clima> climaLst = new ArrayList<Clima>();
//			
//			Clima cl1 = new Clima(1l, new java.util.Date(), c1, 20f, 75f, e1);
//		
//			climaLst.add(cl1);
//			
//			return climaLst;
//			
//		} catch (ParseException e) {
//			
//			e.printStackTrace();
//			
//			return new ArrayList<Clima>();
//		}
		
		//ver https://docs.spring.io/spring-data/jpa/docs/1.5.0.RELEASE/reference/html/jpa.repositories.html
//		if(filter.getIdCiudad()==null && filter.getFecha()==null)
//			return repo.findAll();
//		else
//			return repo.findByIdCiudadOrFecha(filter.getIdCiudad(),filter.getFecha());

		return repo.findByCiudadIdAndFecha(filter.getIdCiudad(), new Date());
		//return repo.findAll();
}

	
	@Override
	public void save(Clima clima) {

		repo.save(clima);
	}

	@Override
	public Clima getClimaById(Long idClima) throws Exception {
		
//		Ciudad c1 = new Ciudad(1L,"Santa Fe");
//		EstadoClima e1 = new EstadoClima(1L, "Despejado");
//
//		Clima cl1 = new Clima(1l, new java.util.Date(), c1, 20f, 75f, e1);
//
//		return cl1; 
		
		Optional<Clima> clima = repo.findById(idClima);
		
		if(clima!=null) {
			
			return clima.get();
			
		} else {
			
			throw new Exception("No existe la persona con el id="+idClima);
		}
	}

	@Override
	public void deleteClimaByid(Long idClima) {
		repo.deleteById(idClima);
	}

	
}
