
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
public class Ejercicio1 {

    /*.      Realiza un programa en java que muestre los ficheros de un directorio.
    El nombre del directorio se pasará al programa desde la línea de comandos.*/
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String directorio;

        System.out.println("Introduce nombre del directorio");

        directorio = teclado.nextLine();

        try {
            
            DirectoryStream<Path> ds = Files.newDirectoryStream(Paths.get(directorio));

            for (Path ruta : ds) {
                System.out.println(ruta.getFileName());

            }

        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }

    }
}
