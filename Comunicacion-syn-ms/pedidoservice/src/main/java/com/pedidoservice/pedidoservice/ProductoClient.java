package com.pedidoservice.pedidoservice;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "producto-service")
public interface ProductoClient {   

    @GetMapping("/productos/productos")
    List<ProductoDTO> obtenerProductos();
    
}
