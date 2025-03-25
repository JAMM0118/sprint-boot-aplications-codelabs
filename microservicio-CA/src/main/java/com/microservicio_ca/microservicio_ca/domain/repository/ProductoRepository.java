package com.microservicio_ca.microservicio_ca.domain.repository;

import java.util.List;
import java.util.Optional;

import com.microservicio_ca.microservicio_ca.domain.model.Producto;


public interface ProductoRepository {
    List<Producto> findAll();
    Optional<Producto> findById(Long id);
}
