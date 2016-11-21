/*
 Escribe un programa para calcular el consumo medio de un automóvil. Para ello el
 programa debe solicitar información sobre las tres últimas veces que se repostó combustible.
 De la primera solicitará el precio del litro del combustible, el total pagado en llenar el depósito y
 el número de kilómetros que marcaba el cuentakilómetros. De la segunda vez sólo solicitará el
 precio del litro de combustible y el total pagado en llenar el depósito, y de la tercera vez,
 solicitará el valor que indicaba el cuentakilómetros. Con estos datos debe calcular el consumo
 por cada 100 km y el coste por kilómetro.
 */
package Ejercicios1Unidad02;

import java.util.*;
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner tlc = new Scanner (System.in);
        
        double precioLitro1;
        double totalPagado1;
        double númeroKilómetros1;
        double precioLitro2;
        double totalPagado2;
        double númeroKilómetros3;
        double capacidad;
        double consumo1;
        double consumoFinal;
        double precioFinal;
        
        
        System.out.println("A cuánto esta el litro la primera vez: ");
        precioLitro1 = tlc.nextDouble();
        System.out.println("Cuánto se ha pagado la primera vez: ");
        totalPagado1 = tlc.nextDouble();
        System.out.println("Cuántos kilómetros se realizaron la primera vez: ");
        númeroKilómetros1 = tlc.nextDouble();
        /*System.out.println("A cuánto esta el litro la segunda vez: ");
        precioLitro2 = tlc.nextDouble();
        System.out.println("Cuánto se ha pagado la segunda vez: ");
        totalPagado2 = tlc.nextDouble();
        System.out.println("Cuántos kilómetros se realizaron la tercera vez: ");
        númeroKilómetros3 = tlc.nextDouble();
        */
        capacidad = totalPagado1/precioLitro1;
        consumo1 = númeroKilómetros1/capacidad;
        consumoFinal = 100 * consumo1 / númeroKilómetros1;
        precioFinal = 100 * precioLitro1 / númeroKilómetros1;
        
        
        System.out.println("El consumo por 100 km será: " + consumoFinal);
        System.out.println("El precio por litro será: " + precioFinal + " €");
        
    }
}
