package com.conexaosolidaria.api_perfil.controller;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "API online! Veja /swagger-ui para documentação.";
    }
}
