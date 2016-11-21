/*
Escribe un programa que solicite un valor real que indica una cantidad de dinero en euros. 
El programa debe mostrar por pantalla la mínima cantidad 
de monedas de cada tipo en que se debe devolver la cantidad de dinero indicada.
 */
package Ejercicios01Unidad03;

import java.util.*;
public class Ejercicio6 {
    public static void main(String[] args) {
        double dinero;
        int cantidad1=0;
        int cantidad2=0;
        int cantidad3=0; 
        int cantidad4=0;
        int cantidad5=0;
        int cantidad6=0;
        int cantidad7=0;
        int cantidad8=0;
        Scanner tcl= new Scanner(System.in);
        dinero=tcl.nextDouble();
        System.out.println("Escribe la cantidad de dinero" +dinero);
        while(dinero>=2){
            dinero=dinero-2;
            cantidad1++;
        }
        while(dinero>=1){
            dinero=dinero-1;
            cantidad2++;
        }
        while(dinero>=0.5){
            dinero=dinero-0.5;
            cantidad3++;
        }
        while(dinero>=0.2){
            dinero=dinero-0.2;
            cantidad4++;
        }
         while(dinero>=0.1){
            dinero=dinero-0.1;
            cantidad5++;
        }
          while(dinero>=0.05){
            dinero=dinero-0.05;
            cantidad6++;
        }
           while(dinero>=0.02){
            dinero=dinero-0.02;
            cantidad7++;
        }
           while(dinero>=0.01){
            dinero=dinero-0.01;
            cantidad8++;
        }
        System.out.println(cantidad1+ "monedas de 2 euros "+cantidad2+ "monedas de 1 euro "+cantidad3+ "monedas de 50 centimos "+cantidad4+ "monedas de 20 centimos " +cantidad5+ "monedas de 10 centimos " +cantidad6+ "monedas de 5 centimos " +cantidad7+ "monedas de 2 centimos " +cantidad8+ "monedas de 1 centimo");
    }
}

