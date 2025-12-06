package com.tecnm.morelia.itics.poo.recetario;

import java.util.Scanner;

public class categoria {
    public presentacion[] recetaRegistradas;
    private int tamanio;
    private String nombreCategoria;
    private String descripcion;
    private int contador;
    public categoria( String nombreCategoria,String descripcion, int tamanio) {
        this.nombreCategoria = nombreCategoria;
        this.descripcion = descripcion;
        recetaRegistradas = new presentacion[tamanio];
        contador=0;

    }
    public void mostrarInformacion() {
        System.out.println("----------------------------------");
        System.out.println("Categoria: " + this.nombreCategoria);
        System.out.println("Descripcion: " + this.descripcion);
        System.out.println("listado de recetas: " );
        for (int i = 0; i < contador; i++) {
            System.out.println("- " + recetaRegistradas[i].darNombre());
        }
        System.out.println("----------------------------------");
    }

    public static int seleccionarCategoria(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1_FRITURAS\n2_HORNEADOS\n3_ASADOS\n4_AL VAPOR\nSELECCIONA LA NUMERACION DE UNA DE LAS CATEGORIAS:");
        int seleccion = sc.nextInt();
        while(seleccion<1||seleccion>4){
            System.out.println("NO EXISTE ESA OPCION A SELECCIONAR");
            seleccion = sc.nextInt();
        }
        return seleccion;
        }
    public void añadirRecetas(presentacion receta) {
        if (contador < recetaRegistradas.length) {
            recetaRegistradas[contador] = receta;
            contador++;
        } else {
            System.out.println("No se pueden agregar más recetas.");
        }


    }


}
