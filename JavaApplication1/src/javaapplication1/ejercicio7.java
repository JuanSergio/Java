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
public class ejercicio7 {
public static void main(String[] args) {
    int cuota1 = 500;
    int cuota2;
    int cuota3;       
    int cuota4;
    int edad;
            boolean ps;
    Scanner lector = new Scanner(System.in);
        System.out.println("Introduce la edad");
        edad = lector.nextInt();
        
        
if (edad>=65) {
    System.out.println("Descuento el 50% "+(int)(cuota1*50)/100);
}
    if (edad<18) {
        System.out.println("¿Tus padres son socios?");
        ps= lector.nextBoolean();
        if (ps==true){
            System.out.println("Descuento del 35%"+(int)(cuota1*25)/100);    
        }else {
            System.out.println("Descuento del 25%");
        }
    }
    
}
}
