
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
public class Ejercicio2 {

    /* Crea un fichero de texto con algún de editor de textos y después realiza un programa Java que visualice su contenido.
            Cambia el programa Java que el nombre del fichero se acepte al ejecutar desde la línea de comandos.*/
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nombreFichero;

        System.out.println("Introduce nombre del fichero");

        nombreFichero = teclado.nextLine();

        
        
        File f = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            f = new File(nombreFichero);//ojo solo busca en la raiz del directorio del proyecto
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {

                System.out.println(linea);
            }

        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }
}
