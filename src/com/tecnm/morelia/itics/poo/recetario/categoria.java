package com.tecnm.morelia.itics.poo.recetario;

public class categoria {
    private String nombre;
    private String descripcion;
    public categoria(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;

    }
    public void agregarCategoria(){
        System.out.println("Agrega nueva categoria"+this.nombre);
        System.out.println("Agrega su descripcion"+this.nombre);
    }
}
