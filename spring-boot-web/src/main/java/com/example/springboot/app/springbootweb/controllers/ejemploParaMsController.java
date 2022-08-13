package com.example.springboot.app.springbootweb.controllers;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class ejemploParaMsController{
    //ver parametros desde la url
    @GetMapping("/string")
    public String param(@RequestParam(name="texto", required = false,defaultValue = "Valor cualquiera") String cadena,Model model)
    {
        model.addAttribute("resultado", "el texto enviado es: "+cadena);
        return "params/ver";
    }
    //ruta:     /params/string

    //enviar parametros
    @GetMapping("/")
    public String index(@RequestParam(name="texto", required = false,defaultValue = "Valor cualquiera") String cadena,Model model)
    {
        model.addAttribute("resultado", "el texto enviado es: "+cadena);
        return "params/index";
    }
    //ruta:     /params/

    //recibir parametro
    @GetMapping("/mix-params")
    public String param(@RequestParam(required = false,defaultValue = "valor cualquiera") String cadena,@RequestParam (required = false, defaultValue = "0")Integer numero,Model model)
    {
        model.addAttribute("resultado", "el texto enviado es: "+cadena+" y el numero es: "+numero);
        return "params/ver";
    }
    // ruta:    /params/mix-params?texto=holaa&numero=15

    // 
    @GetMapping("/mix-params-request")
    public String param(HttpServletRequest request,Model model)
    {
        String cadena = request.getParameter("texto");
        Integer numero = 0;

        try {
            numero = Integer.parseInt(request.getParameter("numero"));
        } catch (Exception e){
            // todo: handle exception
            // si no es un numero pongale 0
            numero = 0;
        }
        model.addAttribute("resultado", "el texto enviado es: "+cadena+" y el numero es: "+numero);
        return "params/ver";
        // ruta:    /params/mix-params-request?texto=11&numero=11
        
    }
}