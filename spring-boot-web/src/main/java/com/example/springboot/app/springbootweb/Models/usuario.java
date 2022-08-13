package com.example.springboot.app.springbootweb.Models;

public class usuario {
    //Atributos
    private String Nombre,Apellido,Email;

    //Metodos
    public usuario(String nombre, String apellido, String email) {
        Nombre = nombre;
        Apellido = apellido;
        Email = email;
    }

    public usuario() {
        Nombre = "";
        Apellido = "";
        Email = "";
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    
    
    
    
    
    
}
