/*
 Introducir A y B que sea mayor que A. 
Visualizar los números de A hasta B e indicar cuantos hay que sean pares.
 */
package Ejercicios01Unidad03;

import java.util.*;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner tlc = new Scanner (System.in);
        int a, b;
        int contador = 0;
        
        System.out.println("Introduce A: ");
        a = tlc.nextInt();
        System.out.println("Introduce B: ");
        b = tlc.nextInt();
        
        if (a>b){
        while (b>=a){
        System.out.println(a);
        if(a%2==0)
        contador++;
        a++;
        }
        System.out.println("Numeros pares: "+contador);
        }
        else {
        System.out.println("B tiene que ser mayor que A");
        }
    }
}
