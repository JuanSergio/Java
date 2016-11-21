/*
 Escribe un método que devuelva la suma de dos enteros 
 */
package Ejercicios01Unidad04;

import java.util.*;
public class Ejercicio01 {
    public static void main(String[] args) {
     Random r = new Random();
     int num1 = r.nextInt()+1;
     int num2 = r.nextInt()+1;
     int resultado;
     resultado = num1 + num2;
     
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + resultado);
    }
}
