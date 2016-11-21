/*
 Escribe una método que acepte dos argumentos: el carácter que se desea
imprimir y el número de líneas que se imprimen en forma triangular
 */
package Ejercicios01Unidad04;

import java.util.*;
public class Ejercicio08 {
    public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
        char espacio=' ', letra='a';
        int x=0;
        System.out.println("Ingrese el numero de filas que tendra"
                + " el triangulo");
        x=obj.nextInt();
        for(int i=1; i<=x; i++){
            for(int espacios=x-i; espacios>0; espacios--)
                System.out.print(espacio);
            for(int lineas=1; lineas<2*i; lineas++)
                System.out.print(letra);
            System.out.println("");
        }
    }
}