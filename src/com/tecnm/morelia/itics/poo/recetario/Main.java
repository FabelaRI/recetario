package com.tecnm.morelia.itics.poo.recetario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean i=true;
        usuario us1 = new usuario("paco","Especialista en Reposteria","Mexico", "1234");
        categoria cat1 = new categoria("Frituras", "Platillos que se cocinan sumergiéndolas en aceite caliente.",3);
        categoria cat2 = new categoria("Horneados", "Platillos que Se cocinan en horno con calor seco.",3);
        categoria cat3 = new categoria("Asados", "Platillos que se preparan directamente al fuego o parrilla.",3);
        categoria cat4 = new categoria("Al vapor", "Platillos que se cuecen con el vapor del agua.",3);
        presentacion rec1 = new presentacion(1, "papas a la francesa", 4,"primero se fríen a baja temperatura para cocerlas por dentro,\ny luego se doran a una temperatura más alta para obtener esa costra dorada tan deseada.");
        presentacion rec2 = new presentacion(2, "pastel de chocolate", 8,"Comenzamos separando 350 gramos de chocolate negro\n de cobertura y 50 gramos de mantequilla para la elaboración de una ganache de chocolate\n con la que rellenar y cubrir el pastel. Reservamos ambos ingredientes y procedemos con la elaboración de la masa para el pastel.");
        presentacion rec3 = new presentacion(3, "carne asada", 4," se hacen a la parrilla marinando la pieza con sal gruesa o pimienta. \nEn el este caso, el adobo es diferente, se agregan varios condimentos para darle ese sabor particular entre ácido y fresco.");
        presentacion rec4 = new presentacion(4, "tamales", 12," Para el relleno necesitas carne de cerdo y lo ideal es usar un corte jugoso como paleta o aguja. ");
        presentacion rec5 = new presentacion(2, "", 6,"");
        comentario com1 = new comentario("",0);
        cat1.añadirRecetas(rec1);
        cat2.añadirRecetas(rec2);
        cat3.añadirRecetas(rec3);
        cat4.añadirRecetas(rec4);
        Scanner sc = new Scanner(System.in);
        while(i==true){
            System.out.println("___ACCESO AL RECETARIO___\n1_ACCEDER CON TU USUARIO\n2_CREAR UN USUARIO");
            int puntuacion = sc.nextInt();
            sc.nextLine();

            if(puntuacion==1||puntuacion==2){
                if(puntuacion==1){
                    System.out.println("Introduce tu nombre de usuario:");
                    String nombreComprobacion = sc.nextLine();

                    System.out.println("introduce su ID:");
                    String idComprobacion = sc.nextLine();

                    if(us1.accederUsuario(nombreComprobacion, idComprobacion)){
                        break;
                    }else{
                        System.out.println("NO ES VALIDO ESTE USUARIO; ESCRIBELO UNA VEZ MAS");
                    }
                }
                if(puntuacion==2){
                    System.out.println("Introduce tu nombre de usuario:");
                    String nombreNuev = sc.nextLine();
                    String a= nombreNuev;

                    System.out.println("introduce su ID:");
                    String idNuev = sc.nextLine();
                    String b= idNuev;

                    System.out.println("introduce una descripcion:");
                    String descripcionNuev = sc.nextLine();
                    String c= descripcionNuev;

                    System.out.println("introduce una ubicacion:");
                    String ubicacionNuev = sc.nextLine();
                    String d= ubicacionNuev;

                    us1.crearUsuario(a,b,c,d);
                }
            }
        }
        while(i==true){
            us1.mostrarInformacion();
            System.out.println("QUE DESEAS HACER:\n1_MODIFICAR TU USUARIO\n2_BUSCAR CATEGORIAS\n3_BUSCAR RECETA\n4_ESCRIBIR RECETA");
            int opcion2 = sc.nextInt();
            if(opcion2==1){
                System.out.println("---MODIFICAR TU USUARIO----");
                us1.modificarInformacion();
            }
            if(opcion2==2){
                System.out.println("---BUSCAR CATEGORIAS----");
                int eleccion = categoria.seleccionarCategoria();
                if(eleccion==1){
                    cat1.mostrarInformacion();
                }
                else if(eleccion==2){
                    cat2.mostrarInformacion();
                }
                else if(eleccion==3){
                    cat3.mostrarInformacion();
                }
                else if(eleccion==4){
                    cat4.mostrarInformacion();
                }

            }
            if(opcion2==3){
                System.out.println("---BUSCAR RECETA----");
                System.out.println("1_"+rec1.darNombre() +"\n2_"+ rec2.darNombre()+"\n3_"+ rec3.darNombre()+"\n4_"+ rec4.darNombre()+"\n5_"+ rec5.darNombre()+"\nSELECCIONA UNA DE LAS OPCIONES:");
                int opReceta = sc.nextInt();
                if(opReceta<=5){
                    if(opReceta==1){
                        rec1.mostrarReceta();
                        System.out.println("QUIERES GUARDAR LA RECETA COMO UN ARCHIVO:\n1_Archivo de texto\n2_Archivo binario\n3_NO");
                        int opGuardar=sc.nextInt();
                        if(opGuardar==1){
                            rec1.escribirArchivo();
                        }
                        else if(opGuardar==2){
                            rec1.escribirArchivoBinario();
                        }

                    }
                    if(opReceta==2){
                        rec2.mostrarReceta();
                        System.out.println("QUIERES GUARDAR LA RECETA COMO UN ARCHIVO:\n1_Archivo de texto\n2_Archivo binario\n3_NO");
                        int opGuardar1=sc.nextInt();
                        if(opGuardar1==1){
                            rec2.escribirArchivo();
                        }
                        else if(opGuardar1==2){
                            rec2.escribirArchivoBinario();
                        }
                    }
                    if(opReceta==3){
                        rec3.mostrarReceta();
                        System.out.println("QUIERES GUARDAR LA RECETA COMO UN ARCHIVO:\n1_Archivo de texto\n2_Archivo binario\n3_NO");
                        int opGuardar2=sc.nextInt();
                        if(opGuardar2==1){
                            rec3.escribirArchivo();
                        }
                        else if(opGuardar2==2){
                            rec3.escribirArchivoBinario();
                        }
                    }
                    if(opReceta==4){
                        rec4.mostrarReceta();
                        System.out.println("QUIERES GUARDAR LA RECETA COMO UN ARCHIVO:\n1_Archivo de texto\n2_Archivo binario\n3_NO");
                        int opGuardar3=sc.nextInt();
                        if(opGuardar3==1){
                            rec4.escribirArchivo();
                        }
                        else if(opGuardar3==2){
                            rec4.escribirArchivoBinario();
                        }
                    }
                    if(opReceta==5){
                        rec5.mostrarReceta();
                        System.out.println("QUIERES GUARDAR LA RECETA COMO UN ARCHIVO:\n1_Archivo de texto\n2_Archivo binario\n3_NO");
                        int opGuardar4=sc.nextInt();
                        if(opGuardar4==1){
                            rec5.escribirArchivo();
                        }
                        else if(opGuardar4==2){
                            rec5.escribirArchivoBinario();
                        }
                    }
                }
                System.out.println("DESEAS DEJAR UN COMENTARIO Y PUNTUACION:\n1_SI\n2_NO");
                int opComentario = sc.nextInt();
                if(opComentario==1 ){
                    com1.escribirComentario();
                    com1.darCalificacion();
                }
                System.out.println("COMENTARIOS EXISTENTES:");
                com1.mostrarComentario();

            }
            if(opcion2==4){
                System.out.println("---ESCRIBIR RECETA----");
                rec5.agregarReceta();
            }
            System.out.println("DESEAS REALIZAR OTRA OPCION:\n1_SI\n2_NO");
            int opDesicion = sc.nextInt();
            if(opDesicion==2 ){
                System.out.println("CIERRE DE SESION.....");
                 i=false;
            }


        }
    }


}