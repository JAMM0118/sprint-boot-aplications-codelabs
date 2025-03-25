package com.microservicio_ca.microservicio_ca.application.usecase;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservicio_ca.microservicio_ca.domain.model.Producto;
import com.microservicio_ca.microservicio_ca.domain.repository.ProductoRepository;

@Service
public class ListarProductosUseCase {
    private final ProductoRepository productoRepository;

    public ListarProductosUseCase(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> ejecutar() {
        return productoRepository.findAll();
    }
}
