/*
 Realizar un juego que adivine numero. Pedir numero y luego pedir numeros indicando
mayor o menor. El juego finaliza cuando aciertas. Implementar una version donde
numero es una version aleatoria creada por el programa.
 */
package Bucles;

import java.util.*;
public class Bucle5 {
    public static void main(String[] args) {
        Scanner tlc = new Scanner (System.in);
        int n, num;
        n = (int)(Math.random()*10) +1;//Numero a acertar
        
        
        System.out.println("Introduce un numero: ");
        num = tlc.nextInt();
        
        while(num != n){
            if(num > n){
                System.out.println("Introduce un numero menor");
                
            }else{
                System.out.println("Introduce un numero mayor");
            }
            System.out.println("Introduce un numero: ");
            num = tlc.nextInt();
        }
        System.out.println("El numero es correcto!");
    }
    
}
