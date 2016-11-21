/*
Escribe un programa que calcule cuánto te dará tu banco después de realizar una
imposición a plazo fijo. Para ello el programa debe pedir la cantidad que desea invertir en el
banco, el tipo de interés anual que le paga el banco por el dinero y el plazo que se mantiene la
inversión. El programa debe calcular el dinero que se obtiene después de dicho plazo.
Recuerda que al pagarte los intereses el banco te retendrá el 18% para hacienda. Escribe los
mensajes apropiados para que el usuario pueda seguir el proceso de cálculo realizado.
 */
package Ejercicios1Unidad02;

import java.util.*;
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner tlc = new Scanner (System.in);
        double cantidad;
        float interés;
        int plazos;
        double interesesBanco;
        double interesPlazo;
        
        System.out.println("Introduce la cantidad a invertir: ");
        cantidad = tlc.nextDouble();
        System.out.println("Introduce el interés anual: ");
        interés = tlc.nextFloat();
        System.out.println("Introduce el número de plazos: ");
        plazos = tlc.nextInt();
        
        interesesBanco = ((cantidad * interés)/100);
        System.out.println("los intereses son: " + interesesBanco);
        interesPlazo = interesesBanco / plazos;
        System.out.println("Intereses a pagar en cada plazo: " + interesPlazo);
    }
    
}
