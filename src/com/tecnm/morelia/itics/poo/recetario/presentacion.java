package com.tecnm.morelia.itics.poo.recetario;

public class presentacion {
    private String nombre;
    private int porcion;
    private String preparacion;
    private int puntuacionGeneral;
    public presentacion(String nombre, int porcion, String preparacion, int puntuacionGeneral) {
        this.nombre = nombre;
        this.porcion = porcion;
        this.preparacion = preparacion;
        this.puntuacionGeneral = puntuacionGeneral;
    }
    public void agregarReceta() {
        System.out.println("Agregando receta...");
    }
    public void mostrarReceta() {
        System.out.println("Mostrando receta...");
    }
    public void modificarReceta() {
        System.out.println("Modificando receta...");
    }



}
