/*
 * Decir si dos numeros son iguales o no.
 */
package unidad2;
import java.util.*;
public class numerosIguales {
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        int num1, num2;
        System.out.println("Introduce el primer numero: ");
        num1 = entrada.nextInt();
        System.out.println("Introduce el segundo numero: ");
        num2 = entrada.nextInt();
        
        if (num1 == num2){
            System.out.println("Los numeros son iguales");
           
        }else {
            System.out.println("Los numeros son diferentes");
        }
    }
}
