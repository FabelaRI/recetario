package com.tecnm.morelia.itics.poo.recetario;
import java.io.*;
import java.util.Scanner;

public class presentacion implements  Serializable {
    private static final long serialVersionUID = 1L;
    public int numeroCategoria;
    public String nombre;
    private int porcion;
    private String preparacion;

    public presentacion(int numeroCategoria, String nombre, int porcion, String preparacion) {
        this.numeroCategoria = numeroCategoria;
        this.nombre = nombre;
        this.porcion = porcion;
        this.preparacion = preparacion;
    }
    public String darNombre() {
        return nombre;
    }
    public void agregarReceta() {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        System.out.println("DAME EL NOMBRE DE TU RECETA:");
        this.nombre = sc.nextLine();
        System.out.println("DAME LA CANTIDAD DE PORCIONES DE TU RECETA:");
        this.porcion = sc.nextInt();
        sc.nextLine();
        System.out.println("ESCRIBE EL METODO DE PREPARACION:");
        this.preparacion = sc.nextLine();
        System.out.println("Agregando receta...");
    }
    public void mostrarReceta() {
        System.out.println("----------------------------------");
        System.out.println("NOMBRE: " + this.nombre);
        System.out.println("NUMERO PORCIONES: " + this.porcion);
        System.out.println("PREPARACION: " + this.preparacion);
        System.out.println("----------------------------------");
    }

    public void escribirArchivo() {
        String nombreArchivo = nombre + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            writer.write(nombre);
            writer.write(this.preparacion);
            writer.write(this.porcion);
            System.out.println("archivo escrito exitosamente");
        }
        catch (IOException e) {
            System.err.println("a ocuurido un error " + e.getMessage());
        }
    }
    public void escribirArchivoBinario() {
        String nombreArchivo = nombre + ".bin";
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(nombreArchivo))) {
                oos.writeObject(this);
            System.out.println("archivo escrito exitosamente");
                 }
        catch (IOException e) {
            System.err.println("a ocuurido un error " + e.getMessage());
        }
    }



}
