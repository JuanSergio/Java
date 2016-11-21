/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author mati
 */
public class ejercicio6 {
    public static void main(String[] args) {
        double dinero;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un dinero");
        dinero = lector.nextDouble();
        
        if (dinero>=2) {
            System.out.println("Cantidad de monedas de 2: "+(int)(dinero/2));
            dinero=dinero%2;
        }
             if (dinero>=1) {
            System.out.println("Cantidad de monedas de 1: "+(int)(dinero/1));
            dinero=dinero%1;
             }
                 if (dinero>=0.5) {
                System.out.println("Cantidad de monedas de 0.5: "+(int)(dinero/0.50));
                dinero=dinero%0.5;
                 }
                     if (dinero>=0.2) {
                    System.out.println("Cantidad de monedas de 0.2: "+(int)(dinero/0.20));
                    dinero=dinero%0.2;
                     }  
                         if (dinero>=0.10) {
                         System.out.println("Cantidad de monedas de 0.10: "+(int)(dinero/0.10));
                         dinero=dinero%0.10;
                         }  
                             if (dinero>=0.05) {
                             System.out.println("Cantidad de monedas de 0.05: "+(int)(dinero/0.05));
                             dinero=dinero%0.05;
                             }
                             
                              if (dinero>=0.02) {
                                System.out.println("Cantidad de monedas de 0.02: "+(int)(dinero/0.02));
                                    dinero=dinero%0.02;
                                    }
    
                               if (dinero>=0.01) {
                                System.out.println("Cantidad de monedas de 0.01: "+(int)(dinero/0.01));
                                    dinero=dinero%0.01;
                               }
    }
}
    
