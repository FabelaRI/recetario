package com.tecnm.morelia.itics.poo.recetario;

public class Main {
    public static void main(String[] args) {
        usuario usuarioR = new usuario("karlo", "Especialista en Reposteria",  "Mexico", 2345);
        usuarioR.mostrarInformacion();
        usuarioR.accederUsuario();

    }


}