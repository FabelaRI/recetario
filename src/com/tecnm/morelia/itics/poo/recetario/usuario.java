package com.tecnm.morelia.itics.poo.recetario;

public class usuario {
    private String nombre;
    private String descripcion;
    private String contraseña;
    public usuario(String nombre, String descripcion,  String contraseña) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.contraseña = contraseña;

    }
    public void setNombre() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("contraseña:" + contraseña);


    }
}
