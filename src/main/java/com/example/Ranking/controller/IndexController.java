package com.example.Ranking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class IndexController {
    @GetMapping("/Jogadores")
    public String abrir () {return "Jogadores";
}}
