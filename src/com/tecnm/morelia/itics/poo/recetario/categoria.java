package com.tecnm.morelia.itics.poo.recetario;

public class categoria implements Informacion{
    private String[] nombre;
    private String categoria;
    private String descripcion;
    private int tamanio;
    public categoria( String descripcion, String categoria) {
        nombre = new String[tamanio];
        this.descripcion = descripcion;
        this.categoria = categoria;

    }
    @Override
    public void mostrarInformacion() {

    }

    @Override
    public void modificarInformacion() {

    }
    public void agregarRecetas(){

    }
}
