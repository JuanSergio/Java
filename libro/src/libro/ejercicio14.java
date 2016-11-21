/*
 * Pedir dos numeroa y decir si son iguales o no
 */
package libro;
import java.util.*;
public class ejercicio14 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        int num1, num2;
        System.out.println("introduce el primer numero: ");
        num1 = entrada.nextInt();
        System.out.println("introduce el segundo numero: ");
        num2 = entrada.nextInt();
        
        if (num1==num2){
        System.out.println("Los numeros son inguales");
    }
        else {
        System.out.println("Los numeros son diferentes");
        
    }
    }
    
}
