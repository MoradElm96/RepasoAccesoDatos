
import java.io.File;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Morad
 */
public class Ejercicio3 {

    /*Escribir un programa en Java que para cualquier ruta indicada por el usuario, muestre:
    Si el fichero existe o no
    Si se trata de un directorio o de un fichero
    En caso de ser un fichero, debe mostrar los siguientes datos:
    Nombre
    Tamaño
    Permisos de lectura y escritura    */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nombre;

        System.out.println("Introduce nombre del directorio o fichero");

        nombre = teclado.nextLine();

        File file = new File(nombre);

        if (file.exists()) {
            System.out.println("el archivo existe");

            if (file.isDirectory()) {
                System.out.println("es un directorio");

            } else {
                System.out.println("no es un directorio");

                file.getName();
                System.out.println("Nombre: " + file.getName());
                file.length();
                System.out.println("Tamaño : " + file.length() + " bytes");
                file.canRead();

                System.out.println("Permisos del archivo:");
                System.out.println("Lectura: " + file.canRead());
                System.out.println("Escritura: " + file.canWrite());
            }

        } else {
            System.out.println("el fichero no existe");
        }

    }

}

