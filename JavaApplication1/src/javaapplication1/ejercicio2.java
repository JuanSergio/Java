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
public class ejercicio2 {
  
    public static void main(String[] args) {

    
    int Edad;
    Scanner lector = new Scanner(System.in);
    System.out.println("¿Que edad tienes?");
    Edad= lector.nextInt();
        if (Edad < 25){
            System.out.println("Eres menor de 25");
        }else {
            System.out.println("Eres menor de 25");
        }
    }
    
}