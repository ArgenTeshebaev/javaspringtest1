package com.ArgenT.WebProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }

    @GetMapping("/map")
    public String map(Model model) {
        model.addAttribute("title", "Главная страница");
        return "map";
    }
    @GetMapping("/flag")
    public String flag(Model model) {
        model.addAttribute("title", "Главная страница");
        return "flag";
    }
    @GetMapping("/coa")
    public String coa(Model model) {
        model.addAttribute("title", "Главная страница");
        return "coa";
    }

}
