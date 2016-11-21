/*
Escribe un programa que calcule el área y la longitud de una
circunferencia en función del radio (leído desde teclado). Se ha de escribir
un método para calcular el área y otro para la longitud. Las fórmulas del
área y la longitud de una circunferencia: A=π * r2
 y L=2*π * r 
 */
package Ejercicios01Unidad04;

import java.util.*;
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner tlc = new Scanner (System.in);
        double radio, area, longitud;
        
        System.out.println("Introduce el radio de la circunferencia: ");
        radio = tlc.nextDouble();
        area= Math.PI * (radio*radio);
        longitud= 2*Math.PI *radio;
        System.out.println("El área será: " + area + " cm" + " y la longitud: " + longitud +" cm");
    }
}
