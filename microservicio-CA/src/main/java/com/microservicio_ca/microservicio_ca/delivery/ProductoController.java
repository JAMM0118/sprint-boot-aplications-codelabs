package com.microservicio_ca.microservicio_ca.delivery;

import org.springframework.web.bind.annotation.*;

import com.microservicio_ca.microservicio_ca.application.ProductoService;
import com.microservicio_ca.microservicio_ca.application.usecase.ListarProductosUseCase;
import com.microservicio_ca.microservicio_ca.domain.model.Producto;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    private final ListarProductosUseCase listarProductosUseCase;

    public ProductoController(ListarProductosUseCase listarProductosUseCase) {
        this.listarProductosUseCase = listarProductosUseCase;
    }

    @GetMapping
    public List<Producto> obtenerProductos() {
        return listarProductosUseCase.ejecutar();
    }
    // private final ProductoService productoService;

    // public ProductoController(ProductoService productoService) {
    //     this.productoService = productoService;
    // }

    // @GetMapping
    // public List<Producto> obtenerProductos() {
    //     return productoService.listarProductos();
    // }

    // @GetMapping("/{id}")
    // public Producto obtenerProducto(@PathVariable Long id) {
    //     return productoService.buscarPorId(id);
    // }
}