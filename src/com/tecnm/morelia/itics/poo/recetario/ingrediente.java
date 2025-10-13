package com.tecnm.morelia.itics.poo.recetario;

public class ingrediente {
    private String nombre;
    private int cantidad;
    public ingrediente(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    public void agregarIngrediente(){
        System.out.println("Agrega nuevo ingrediente"+this.nombre);
        System.out.println("Agrega su cantidad"+this.cantidad);

    }

}
