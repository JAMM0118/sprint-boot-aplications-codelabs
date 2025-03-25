package com.microservicio_ca.microservicio_ca.application;

import java.util.List;

import org.springframework.stereotype.Service;
import com.microservicio_ca.microservicio_ca.domain.model.Producto;
import com.microservicio_ca.microservicio_ca.domain.repository.ProductoRepository;

@Service
public class ProductoService {
    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    public Producto buscarPorId(Long id) {
        return productoRepository.findById(id).orElse(null);
    }
}