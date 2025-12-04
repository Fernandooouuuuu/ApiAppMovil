package com.SneakerVibe.producto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SneakerVibe.producto.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
