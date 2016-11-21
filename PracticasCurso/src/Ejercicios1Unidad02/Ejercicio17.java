/*
 Escribe un programa que solicite al usuario una cantidad en segundos y la convierta a
 días, horas, minutos y segundos.
 */
package Ejercicios1Unidad02;

import java.util.*;
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner tlc = new Scanner (System.in);
        int segundos;
        int minutos;
        int horas;
        int dias;
        
        
        System.out.println("Introduce el número de segundos: ");
        segundos = tlc.nextInt();
        minutos = segundos / 60;
        System.out.println("Los minutos son: " + minutos);
        horas = minutos / 60;
        System.out.println("Las horas son: " + horas);
        dias = horas / 24;
        System.out.println("Los dias son: " + dias);
    }
    
}
