
package examenjerci1;

import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {

     int valor1 = 1;
     int valor2 = 0;
     int n = 0;
     do{
         int resultado = valor1 + valor2;
         valor2 = valor1;
         valor1 = resultado;
         System.out.print(resultado+" ");
         n++;
     }while(n<5);
    }
}
