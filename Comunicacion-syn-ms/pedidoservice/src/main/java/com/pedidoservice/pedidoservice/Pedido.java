package com.pedidoservice.pedidoservice;

public record Pedido(String id, ProductoDTO producto, int cantidad) {
    
}
