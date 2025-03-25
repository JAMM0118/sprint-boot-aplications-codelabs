package com.microservicio_ca.microservicio_ca.infrastructure.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.microservicio_ca.microservicio_ca.domain.model.Producto;
import com.microservicio_ca.microservicio_ca.domain.repository.ProductoRepository;

@Repository
public interface ProductoRepositoryImpl extends JpaRepository<Producto, Long>, ProductoRepository {
    @Override
    List<Producto> findAll();

    @Override
    Optional<Producto> findById(Long id);
}