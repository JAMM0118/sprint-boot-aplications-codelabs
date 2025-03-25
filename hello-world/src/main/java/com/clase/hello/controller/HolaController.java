package com.clase.hello.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HolaController {

    @GetMapping("/hola")
    public String hola() {
        return "Hola Mundo";
    }
}
