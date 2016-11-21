/*
 Escribe un programa que permita determinar si utilizar los números aleatorios de la 
clase Math son apropiados. Para ello el programa debe simular que se lanza una moneda un número 
elevado de veces, por ejemplo, 1.000.000. A continuación debe imprimir por pantalla 
el porcentaje de caras y el porcentaje de cruces que han salido.
 */
package Ejercicios01Unidad03;

import java.util.*;
public class Ejercicio19 {
 public static void main(String[] args){
    int cara=0, cruz=0,mon;
    final int tope=1000000;
    Random aleatorio = new Random();
    for(int i=0;i<tope;i++){
    mon = aleatorio.nextInt(2);
    if(mon==0)
    cara++;
    else
    cruz++;
    }
    System.out.println("Probabilidad de cara = " + ((cara*100)/tope));
    System.out.println("Probabilidad de cruz = " + ((cruz*100)/tope));
    }
}