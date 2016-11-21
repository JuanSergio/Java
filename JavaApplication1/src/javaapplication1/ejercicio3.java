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
public class ejercicio3 {
    public static void main(String[] args) {
        
        int num;
    Scanner lector = new Scanner(System.in);
    System.out.println("Elige un número");
    num= lector.nextInt();
        if (num % 2 == 0){
            System.out.println("Es par");
        }else {
            System.out.println("Es impar");

        }
    }
}




