/*
 1. - Escribe un programa que acceda aleatoriamente a un fichero de
 texto.
 El programa debe preguntar al usuario posiciones del fichero y
 convertir a mayúsculas el carácter leído en esa posición.
 El programa acabará cuando la posición solicitada sea -1
 */
package AccesoAleatorio;

import java.io.*;
import java.util.*;

public class Ejercicio01 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner tlc = new Scanner(System.in);
        File archivo1 = new File("archivo1.txt");
        int pos;
        RandomAccessFile raf = new RandomAccessFile(archivo1, "rw");
        try {
            do {
                System.out.println("Dime la posicion que quieres en mayúsculas: ");
                pos = tlc.nextInt();

                //Se obtiene el tamaño del fichero
                long tamaño = raf.length();
                if (pos >= 0) {

                    //Colocar el puntero en la posicion correcta
                    raf.seek(pos);

           //Se comprueba que la posicion del puntero no es
                    //mayor que el tamaño del fichero
                    if (raf.getFilePointer() < tamaño) {
           //Leer un caracter y ir avanzando puntero al siguiente
                        //Caracter leido en formato int
                        int caracter = raf.read();
                        //Retroceder una posición para volver a la posición anterior
                        raf.seek(raf.getFilePointer() - 1);
                        //Transformar el caracter de inicio en mayusculas
                        raf.write(Character.toUpperCase(caracter));
                    }
                }
            } while (pos != -1);
        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e.getMessage());
        } finally {
            try {
                if (raf != null) {
                    raf.close();
                }
            } catch (Exception e) {
                System.out.println("Error");
                System.out.println(e.getMessage());
            }
        }
    }
}
