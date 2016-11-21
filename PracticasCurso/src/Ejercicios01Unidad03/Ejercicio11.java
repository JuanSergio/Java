/*
 Calcular la suma de los números comprendidos entre uno y mil.
 */
package Ejercicios01Unidad03;


public class Ejercicio11 {
    public static void main(String[] args) {
       int suma=0;
    for (int i = 1; i <= 1000; i++){
    suma=suma+i;
    }
    
    System.out.println("La suma de los 1000 primeros numeros es: "+suma);
    }  
}
