/*
 Escribe un programa que solicite al usuario un número entero positivo. 
El programa debe presentar en pantalla la descomposición en factores primos de dicho número.
Por ejemplo, si el número es 36 debe escribir 36=2 *2 * 3 * 3.
 */
package Ejercicios01Unidad03;

 import java.util.*;
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner tlc = new Scanner(System.in);
        int num,i=2,descom=0;
            
        System.out.print("Introduce un numero: ");
        num = tlc.nextInt();
        if(num>0){ 
        System.out.print(num + "= ");
        do{
        if(num%i==0){
        num=num/i;
        if(descom==0){
        System.out.print(i);
        descom=1;
        
        }else
        System.out.print("*" + i);
        }else
        i++;
        }
        while(num>1);
        System.out.println("");
        }else
        System.out.println("ERROR");
        }
}    

    