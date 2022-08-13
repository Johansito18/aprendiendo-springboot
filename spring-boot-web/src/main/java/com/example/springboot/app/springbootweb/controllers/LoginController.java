package com.example.springboot.app.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login")
public class LoginController {
    
    @GetMapping("/log")
    public String login(@RequestParam(name="usuario", required = false, defaultValue = "Valor por defecto") String Usuario, @RequestParam(name="password", required = false, defaultValue = "Valor por defecto") String Password, Model model)
    {
        model.addAttribute("titulo","Iniciar Sesión");
        model.addAttribute("resultado", "El usuario es: "+Usuario);
        model.addAttribute("resultado2", "la contraseña es: "+Password);
        return "login/verlogin";
    }

}