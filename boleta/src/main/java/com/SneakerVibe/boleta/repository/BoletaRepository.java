package com.SneakerVibe.boleta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.SneakerVibe.boleta.model.Boleta;

public interface BoletaRepository extends JpaRepository<Boleta, Long> {

}
