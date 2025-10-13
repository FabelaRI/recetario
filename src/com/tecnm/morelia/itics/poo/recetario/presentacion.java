package com.tecnm.morelia.itics.poo.recetario;

public class presentacion {
    private String nombre;
    private int porcion;
    private String preparacion;
    private int puntuacion;
    public presentacion(String nombre, int porcion, String preparacion, int puntuacion) {
        this.nombre = nombre;
        this.porcion = porcion;
        this.preparacion = preparacion;
        this.puntuacion = puntuacion;
    }
    public void agregarReceta() {
        System.out.println("Agregando receta...");
    }


}
