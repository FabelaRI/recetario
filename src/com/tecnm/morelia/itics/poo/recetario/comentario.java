package com.tecnm.morelia.itics.poo.recetario;

public class comentario {
    private String comentario;
    private int calificacion;
    public comentario(String comentario, int calificacion) {
        this.comentario = comentario;
        this.calificacion = calificacion;
    }
    public String escribirComentario() {
        return comentario;
    }
    public int darCalificacion() {
        return calificacion;
    }
    public String mostrarComentario() {
        return comentario;
    }

}
