/*
Escribe un programa que escriba en pantalla las notas de la asignatura de “Programación”.
En la primera línea se escribirá el nombre de la asignatura. En las siguientes líneas se
escribirán las notas de los dos parciales realizados poniendo la nota de cada uno en líneas
distintas. En la última línea escribirá la nota final de la asignatura. Escribe lo que sea texto
como un texto entre comillas dobles y lo que sea número como un número.
 */
package Ejercicios1Unidad02;

import java.util.*;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner tlc = new Scanner (System.in);
        String asignatura;
        double nota1;
        double nota2;
        double notaFinal;
  

        System.out.println("El nombre de la asignatura?");
        asignatura = tlc.next();
        System.out.println("Cuál fue la primera nota?");
        nota1 = tlc.nextDouble();
        System.out.println("Cuál fue la segunda nota?");
        nota2 = tlc.nextDouble();
        notaFinal = (nota1+nota2)/2;
        System.out.println("La nota final es: " + notaFinal);

    }
    
}
