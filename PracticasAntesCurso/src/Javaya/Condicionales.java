/*
Realizar un programa que lea por teclado dos números, si el primero es mayor 
al segundo informar su suma y 
diferencia, en caso contrario informar el producto y 
la división del primero respecto al segundo.
*/
package Javaya;
import java.util.*;

public class Condicionales {
    public static void main(String[] args) {
        Scanner tlc = new Scanner(System.in);
        double numero1;
        double numero2;
        
        System.out.println("Introduce el numero1: ");
        numero1 = tlc.nextDouble();
        System.out.println("Introduce el numero2: ");
        numero2 = tlc.nextDouble();
        
        if(numero1 > numero2){
            System.out.println(numero1 + numero2);
            System.out.println("La diferencia es de: " + (numero1 - numero2));
        }else{
            int producto;
            float division;
            producto = (int) (numero1 * numero2);
            division = (float) (numero1 / numero2);
            System.out.println("La multiplicacion es: " + (producto));
            System.out.println("La división es: " + (division));
        }
    }
}
