/*
 Escribe un método que acepte tres argumentos: un carácter y dos enteros.
 El carácter se debe imprimir. El primer entero indica el número de veces
 que se imprimirá el carácter en la línea y el segundo entero indica el
 número de líneas que deben imprimir-se.
 */
package Ejercicios01Unidad04;

import java.util.*;

public class Ejercicio07 {

    static void lineas(char a, int num, int linea) {
    int contador = 0;
    while (linea > contador) {
    Ejercicio06.imprimir(a, num);
    System.out.println();
    contador++;
        }
}
    public static void main(String args[]) {
    String resp;
    int nveces, lineas;
    Scanner tcl = new Scanner(System.in);
    do {
        System.out.println("Caracter: ");
        resp = tcl.nextLine();
        char caracter = resp.charAt(0);
        System.out.println("Numero de columnas:");
        nveces = tcl.nextInt();
        tcl.nextLine();
        System.out.println("Numero de líneas:");
        lineas = tcl.nextInt();
        tcl.nextLine();
        lineas(caracter, nveces, lineas);
        System.out.print("Quieres dibujar mas líneas?");
        resp = tcl.nextLine();
        }while (resp.compareToIgnoreCase("si") == 0);
    }
    
}
