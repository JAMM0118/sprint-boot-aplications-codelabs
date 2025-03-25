
package com.pedidoservice.pedidoservice;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    
    private final ProductoClient productoClient;


    public PedidoController(ProductoClient productoClient) {
        this.productoClient = productoClient;
    }

    @GetMapping("/crear")
    public ResponseEntity<?> crearPedido(){
        List<ProductoDTO> productos = productoClient.obtenerProductos();
        return ResponseEntity.ok("Pedido creado con productos: " + productos);
    }    
}