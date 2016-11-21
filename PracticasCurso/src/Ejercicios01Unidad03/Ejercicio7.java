/*
 Escribe un programa que calcule la cuota que se debe abonar en el club de golf. 
La cuota es de 500 €. Tendrán un 50% de descuento las personas mayores de 65 años y 
un 25% los menores de 18 años si los padres no son socios y 35% si los padres son socios.
 */
package Ejercicios01Unidad03;

import java.util.*;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner tlc = new Scanner (System.in);
        int cuota = 500,edad;
        boolean socios;
        
    System.out.print("Dime tu edad:");
    edad = tlc.nextInt();
    if (edad >=65)
    cuota = cuota - (cuota * 50/100);
    if (edad <18) {
        System.out.print("¿Tus padres son socios?: (true/false) :");
        socios = tlc.nextBoolean();
        if(socios == true)
        cuota=cuota - (cuota *35/100);
        else if(socios == false)
        cuota=cuota - (cuota *25/100);
    }
    System.out.println("Debes pagar: "+cuota);
    }
}
