/*
 Escribe un método que acepte dos argumentos: el carácter que se desea
imprimir y el número de veces que se imprime
 */
package Ejercicios01Unidad04;

import java.util.*;
public class Ejercicio06 {
    static void imprimir(char a, int b) {
    int contador = 0;
    while (b > contador) {
    System.out.println(a);
    contador++;
        }
}
    public static void main(String args[]) {
    int veces;
    char car;
    for (car = 'a'; car <= 'z'; car++) {
    Random num = new Random();
    veces = num.nextInt(30);
    System.out.println(car + "\t" + veces + " veces:\t");
    imprimir(car, veces);
        }
    }    
}