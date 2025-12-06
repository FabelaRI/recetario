package com.tecnm.morelia.itics.poo.recetario;

import java.util.Scanner;

public class comentario {
    private String comentario;
    private int calificacion;
    public comentario(String comentario, int calificacion) {
        this.comentario = comentario;
        this.calificacion = calificacion;
    }
    public  void escribirComentario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ESCRIBE TU COMENTARIO DE LA RECETA AQUI:");
        String reseña = sc.nextLine();
        this.comentario = reseña;

    }
    public void darCalificacion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("REGISTRA TU PUNTUACION DE LA RECETA AQUI\n (REGISTRALA EN UN VALOR DE 1-10):");
        int puntuacion = sc.nextInt();
        if(1<=puntuacion && puntuacion<=10){
            this.calificacion = puntuacion;
        }else{
            while(puntuacion<=1||puntuacion>=10){
                System.out.println("NO ES VALIDA ESA PUNTUACION\nINTENTALO UNA VEZ MAS");
                puntuacion = sc.nextInt();
            }
        }
        this.calificacion = puntuacion;
    }
    public void mostrarComentario() {
        System.out.println("Comentario Registrado:"+this.comentario);
        System.out.println("Calificacion Registrada:"+this.calificacion);
    }

}
