package com.sena.practica_jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/hello/")
public class HelloWorldController {

    @GetMapping("")
    public String getMethodName() {
        return "Hola mundo como estan, esta es una prueba de Jenkins integrada correctamente";
    }
}
