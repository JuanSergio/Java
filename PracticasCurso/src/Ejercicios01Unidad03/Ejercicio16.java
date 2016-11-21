/*
 Escribe un programa que calcule la potencia de un número real (a) elevado a un número entero (b). 
Tenga en cuenta que tanto a como b pueden valer 0 o pueden ser números negativos.
 */
package Ejercicios01Unidad03;

import java.util.*;
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner tlc = new Scanner (System.in);
        double a, resul=1;
        int b;
        System.out.println("Introduce la base: ");
        a = tlc.nextDouble();
        tlc.nextLine();
        System.out.println("Introduce el exponente: ");
        b = tlc.nextInt();
        tlc.nextLine();
        
        if(b==0)
        resul = 1;
        if(b>0){
        
        for(int i=1;i<=b;i++){
        resul = resul * a;
           }
        }
        if(b<0){
        for(int i=-1;i>=b;i--){
        resul = resul / a;
            }
        }
        System.out.println(a + "^" + b + " = " + resul);
    }
}


    

    
  
