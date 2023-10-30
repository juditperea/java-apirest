package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    @GetMapping("/index")
    public String index() {
        return "index"; // Devuelve el nombre del archivo HTML sin la extensión
    }
}