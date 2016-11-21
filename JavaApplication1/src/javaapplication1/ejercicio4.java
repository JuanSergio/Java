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
public class ejercicio4 {
    public static void main(String[] args) {
        
        int num1, num2;
        Scanner lector = new Scanner(System.in);
        System.out.println("Elige dos números");
        num1= lector.nextInt();
        num2= lector.nextInt();
        if (num1 > num2){
          System.out.println("El primer número es mayor");
    }else {
            System.out.println("El segundo número es mayor");
   }
    }
}
