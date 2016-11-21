/*
 Escribe un programa que solicite al usuario el tamaño del lado de un triángulo equilátero y
calcule su perímetro y su área.
 */
package Ejercicios1Unidad02;

import java.util.*;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner tlc = new Scanner (System.in);
        
        double perímetro;
        double área;
        double lado;
        double altura;
        
        System.out.println("Dime el tamaño del lado del triángulo: ");
        lado = tlc.nextDouble();
        perímetro = 3 * lado;
        System.out.println("El perímetro del triángulo es: " + perímetro + " cm");
        altura = Math.sqrt(perímetro)/2;
        área= (Math.sqrt(3)/4)*altura;
        System.out.println("El área del triángulo es: " + área + " cm");
 
    }
}
