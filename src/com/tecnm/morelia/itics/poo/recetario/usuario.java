package com.tecnm.morelia.itics.poo.recetario;
import java.util.Scanner;

public class usuario implements Informacion{
    private String[] usuariosRegistrados ={"Angel","Blanca","Carlos"};
    private String[] idRegistrados={"1234","2565","1678"};
    int tamanio = usuariosRegistrados.length;
    private int id;
    private String nombre;
    private String descripcion;
    private String ubicacion;
    public usuario(String nombre, String descripcion, String ubicacion, int id) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.id = id;


    }
    public void accederUsuario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre de usuario:");
        String nombre = sc.nextLine();
        System.out.println("introduce su ID:");
        String id = sc.nextLine();
        for(int i=0;i<tamanio;i++){
            if(usuariosRegistrados[i].equals(nombre)){
                System.out.println("es valido ese usuario");
                if(idRegistrados[i].equals(id)){
                    System.out.println("Es correcto ese ID");
                    int validacion = 1;
                } else{
                    System.out.println("No es correcto ese ID");
                    System.out.println("vuelve a intentarlo");
                    }
                break;
            }else{
                System.out.println("No es correcto ese usuario");
                System.out.println("Vuelve a intentarlo");
                break;
            }
        }

    }

    public void crearUsuario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre de usuario:");
        String nombre = sc.nextLine();
        System.out.println("introduce su ID:");
        String id = sc.nextLine();
        System.out.println("introduce una descripcion:");
        String descripcion = sc.nextLine();
        System.out.println("introduce una ubicacion:");
        String ubicacion = sc.nextLine();
        System.out.println("Ha sido creado Exitosamente");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Ubicacion: " + ubicacion);
    }

    @Override
    public void modificarInformacion() {
        Scanner sc = new Scanner(System.in);
        int i =0;
        while(i==0){
            System.out.println("Que deseas modificar de el usuario?");
            System.out.println("1. Cambiar nombre\n 2. Cambiar ID\n 3. Cambiar descripcion\n 4. Cambiar ubicacion\n Escoge uno de los numeros: \n");
            int opcion= sc.nextInt();
            if(opcion==1){
                System.out.println("Ingrese el nombre del usuario:");
                String nombre = sc.nextLine();
            }
            else if(opcion==2){
                System.out.println("Ingrese el ID del usuario:");
                String id = sc.nextLine();
            }
            else if(opcion==3){
                System.out.println("Ingrese el descripcion del usuario:");
                String descripcion = sc.nextLine();
            }
            else if(opcion==4){
                System.out.println("Ingrese el ubicacion del usuario:");
                String ubicacion = sc.nextLine();
            }
            else{
                System.out.println("No es correcto ese opcion");
            }
            System.out.println("Quieres seleccionar otra opcion:");
            int i = sc.nextInt();



        }

    }
}
