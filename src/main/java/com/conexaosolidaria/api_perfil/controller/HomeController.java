package com.conexaosolidaria.api_perfil.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "API online! Veja /swagger-ui/index.html para documentação.";
    }
}
