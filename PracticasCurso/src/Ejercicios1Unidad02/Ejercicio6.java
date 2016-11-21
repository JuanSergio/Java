/*
 Escribe un programa que visualice en pantalla cuánto le costará comprar unas deportivas
cuyo precio de catálogo es de 85,00 €, si sabe que puede conseguir una rebaja del 15%.
 */
package Ejercicios1Unidad02;
import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner tlc = new Scanner (System.in);
        double precioZapatillas;
        double precioRebaja;
        double precioFinal;
        
        precioZapatillas = 85.00;
        precioRebaja = (precioZapatillas*15)/100;
        precioFinal = precioZapatillas - precioRebaja;
        
        System.out.println("El precio con rebaja es: " + precioFinal + "€");
        
        
    }
    
}
