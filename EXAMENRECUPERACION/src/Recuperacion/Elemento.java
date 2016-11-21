/*
 * Escribe una clase llamada elemento que disponga de un atributo con su nombre.
 * debe contener un metodo llamado numeroDeElementos que devuelve el numero total de elementos que se 
 * han instanciado.
 */
package Recuperacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author juansergio
 */
public class Elemento {

    
    int elementos[];
    String nombre = "";

    public static String[] numeroDeElementos(String[] elementos) {
        String nombre = "";
        int contador = 0, j = 0;
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i].contains(nombre)) {
                contador++;
            }
        }
        String[] cadenas = new String[contador];
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i].contains(nombre)) {
                cadenas[j] = elementos[i];
                j++;
            }
        }
        return cadenas;
    }

    public static void main(String[] args) {
        Scanner tlc = new Scanner(System.in);
        System.out.println("Introduce un nombre: ");
        String nombre = tlc.nextLine();
        
        numeroDeElementos num = new numeroDeElementos();
    }
}
