package com.example.springboot.app.springbootweb.controllers;

import java.util.ArrayList;
import java.util.List;

import com.example.springboot.app.springbootweb.Models.usuario;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class IndexController {
    
    @GetMapping({"/index","/","/home"}) //mejor forma de hacerlo
    public String index(Model model)
    {
        model.addAttribute("titulo","Hola Spring Web");
        return "index"; //retornando el nombre del html que vamos a hacer//
    }

    @GetMapping("/perfil")
    public String perfil(Model model)
    {
        usuario usuario = new usuario();

        usuario.setNombre("Johansito");
        usuario.setApellido("Alvarez");
        usuario.setEmail("Johan@gmail.com");

        model.addAttribute("usuario",usuario);
        model.addAttribute("titulo","Perfil del Usuario "+usuario.getNombre());
        return "perfil"; //retornando el nombre del html que vamos a hacer//
    }

    @GetMapping("/listar")
    public String listar(Model model)
    {
        List<usuario> usuarios = new ArrayList<>();

        usuarios.add(new usuario("Johansito","Alvarez","johan@gmail.com"));
        usuarios.add(new usuario("Carmelo","Lames","carmel@gmail.com"));
        usuarios.add(new usuario("juanito","Alva","juanito@gmail.com"));

        model.addAttribute("usuarios",usuarios);
        model.addAttribute("titulo","Listado de usuarios");
        return "listar"; //retornando el nombre del html que vamos a hacer//
    }
    
    @ModelAttribute("usuarios")
    public List<usuario> poblarUsuarios()
    {
        List<usuario> usuarios = new ArrayList<>();

        usuarios.add(new usuario("Johansito","Alvarez","johan@gmail.com"));
        usuarios.add(new usuario("Carmelo","Lames","carmel@gmail.com"));
        usuarios.add(new usuario("juanito","Alva","juanito@gmail.com"));

        return usuarios;

    }
}
