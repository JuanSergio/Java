/*
 Leer un numero e indicar si es positivo o negativo. El proceso se repetirá hasta
 que se introduzca un 0.
 */
package Bucles;

import java.util.*;

public class Bucle2 {

    public static void main(String[] args) {
        Scanner tlc = new Scanner(System.in);
        int num;
        System.out.println("Introduce un numero: ");
        num = tlc.nextInt();
        
        while(num !=0){
            if(num >= 0){
                System.out.println("El numero es positivo");
            }
            else{
                System.out.println("El numero es negativo");
            }
            System.out.println("Introduce un numero: ");
            num = tlc.nextInt();
        }
    }

}
