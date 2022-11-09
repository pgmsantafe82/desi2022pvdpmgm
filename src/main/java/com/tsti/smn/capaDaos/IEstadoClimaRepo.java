package com.tsti.smn.capaDaos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tsti.smn.pojos.EstadoClima;

@Repository
public interface IEstadoClimaRepo extends JpaRepository<EstadoClima, Long> {


}
