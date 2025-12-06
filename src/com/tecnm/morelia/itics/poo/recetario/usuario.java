package com.tecnm.morelia.itics.poo.recetario;
import java.util.Scanner;

public class usuario implements Informacion{
    private String id;
    private String nombre;
    private String descripcion;
    private String ubicacion;
    public usuario(String nombre, String descripcion, String ubicacion, String id) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.id = id;


    }
    public boolean accederUsuario(String nombre, String id) {
        Scanner sc = new Scanner(System.in);
        while(true){
            if(nombre.equals(this.nombre)){
                if(id.equals(this.id)){
                    return true;
                }else{
                    System.out.println("NO ES VALIDO ESE ID");
                    break;
                }
            }else{
                System.out.println("NO ES VALIDO ESE NOMBRE");
                break;
            }
        }
        return false;
    }

    public void crearUsuario(String nombreNuevo, String idNuevo, String descripcionNueva, String ubicacionNueva) {
        this.nombre = nombreNuevo;
        this.id = idNuevo;
        this.descripcion = descripcionNueva;
        this.ubicacion = ubicacionNueva;
        System.out.println("Ha sido creado Exitosamente");
    }

    @Override
    public  void mostrarInformacion() {
        System.out.println("----------------------------------");
        System.out.println("-----USUARIO------");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Ubicacion: " + ubicacion);
        System.out.println("----------------------------------");
    }

    @Override
    public void modificarInformacion() {
        Scanner sc = new Scanner(System.in);
        int opcion =0;
        while(opcion==0){
            System.out.println("Que deseas modificar de el usuario?");
            System.out.println("1. Cambiar nombre\n 2. Cambiar ID\n 3. Cambiar descripcion\n 4. Cambiar ubicacion\n Escoge uno de los numeros: \n");
            int opcionNueva= sc.nextInt();
            sc.nextLine();
            opcion=opcionNueva;
            if(opcion==1){
                System.out.println("Ingrese el nombre del usuario:");
                String nombreNuevo = sc.nextLine();
                this.nombre = nombreNuevo;

            }
            else if(opcion==2){
                System.out.println("Ingrese el ID del usuario:");
                String idNuevo = sc.nextLine();
                this.id = idNuevo;
            }
            else if(opcion==3){
                System.out.println("Ingrese el descripcion del usuario:");
                String descripcionNueva = sc.nextLine();
                this.descripcion = descripcionNueva;
            }
            else if(opcion==4){;
                System.out.println("Ingrese el ubicacion del usuario:");
                String ubicacionNueva = sc.nextLine();
                this.ubicacion = ubicacionNueva;
            }
            else{
                System.out.println("No es correcto ese opcion");
            }



        }

    }
}
