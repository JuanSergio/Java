/*
 * Programa que lea por teclado 10 números enteros 
 * y los guarde en un array.
 * A continuación calcula y muestra la media de los
 * valores positivos y la  de los valores negativos.
 */
package vectores;
import java.util.*;

public class numerosEnteros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int i;
        double media = 0.0;
        int numeros [] = new int [10];
        
        //Llenar array
        
        System.out.println("Lectura de numeros");
        for(i = 0; i < numeros.length; i++){
            System.out.println("numeros["+ i +"]= ");
            numeros[i] =(int)Math.random()*10;
        }
        media = media + numeros[i];
        media = numeros.length;
        
        System.out.println("La media es: "+ media);
    }
        
     
  }
    

