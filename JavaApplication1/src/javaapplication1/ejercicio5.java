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
public class ejercicio5 {
    public static void main(String[] args) {
        int nota;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce tu calificación");
        nota= lector.nextInt();
            if (nota <=3){
                System.out.println("M.D");
            }else{
                if(nota <5){
                System.out.println("INS");
                }else{
                    if(nota <=6){
                        System.out.println("SUF");
                    }else{
                        if(nota <=7){
                            System.out.println("BIEN");
                        }else{
                            if(nota <=9){
                                System.out.println("NOT");
                            }else{
                                if(nota ==10){
                                    System.out.println("SOB");
                                }
                            }
                        }
                    }
                }
    }
    }
}
