/*
 Escribe un programa que juegue con el usuario a adivinar un número. 
El ordenador debe generar un número entre 1 y 100 y el usuario tiene que intentar adivinarlo. 
Para ello, cada vez que el usuario introduce un valor, el ordenador debe decirle al usuario 
si el número que tiene que adivinar es mayor o menor que el que ha introducido. 
Cuando consiga adivinarlo debe indicárselo y visualizar el número de veces que 
el usuario ha intentado adivinar el número. 
Si el usuario introduce algo que no es un número debe indicarlo de esta forma en pantalla.
 */
package Ejercicios01Unidad03;

import java.util.*;
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner tlc = new Scanner (System.in);
        int numero, ocasiones=0;
        int numeroAdivinar = (int) (Math.random()*100+1);
        do{
            System.out.println("Introduce un número: ");
            numero = tlc.nextInt();
            if(numero >0 && numero <= 100){
               if(numeroAdivinar > numero){
                   System.out.println("El número a adivinar es mayor");
               }else{
                   System.out.println("El numero a adivinar es menor");
               }
            }else{
                System.out.println("El numero debe estar en 0 y 100 ");
            }
            ocasiones++;
        }while(numero!=numeroAdivinar);
        System.out.println("Correcto");
        System.out.println("El número de ocasiones es: " + ocasiones);
        
    }
}
