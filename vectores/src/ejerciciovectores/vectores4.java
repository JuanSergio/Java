/*
Escribe un programa que permita introducir vector numérico de diez
elementos, visualizarlo y luego visualizar los elementos cuyo contenido
sea par, indicando su posición.
Repetir para impar.
 */
package ejerciciovectores;
import java.util.*;

public class vectores4 {
    public static void main(String[] args) {
        int[] numero = new int[10];//declarar número
        for (int i = 0; i < numero.length; i++) { //Bucle pedir números
            numero[i] = (int) (Math.random() * 1500 + 0);
        }
         System.out.println("**************************");
         for (int i = 0; i < numero.length; i++) { // Bucle para mostrar por pantalla
             System.out.println("Número[" + i + "]: " + numero[i]);
         }
         System.out.println("*************NÚMERO PAR************");
         for (int i = 0; i < numero.length; i++){ //Bucle para mostrar por pantalla
         }
         
    }
    
        
        
        }
    
    
    

