/*
 Escribe un programa para calcular la edad de una persona solicitando la fecha 
 actual y la fecha de su nacimiento.
 */
package Ejercicios01Unidad03;

import java.util.*;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner tlc = new Scanner(System.in);
            int edad;
            int diaAct, diaNaci;
            int mesAct, mesNaci;
            int añoAct, añoNaci;
            GregorianCalendar fecha = new GregorianCalendar();
            
            System.out.println("Introduce tu fecha de tu nacimiento: ");
            diaNaci = tlc.nextInt();
            tlc.nextLine();
            mesNaci = tlc.nextInt();
            tlc.nextLine();
            añoNaci = tlc.nextInt();
            tlc.nextLine();
            diaAct = fecha.get(GregorianCalendar.DAY_OF_MONTH);
            mesAct = fecha.get(GregorianCalendar.MONTH)+1;
            añoAct = fecha.get(GregorianCalendar.YEAR);
            edad = añoAct - añoNaci;
            
            if(mesAct < mesNaci){
            edad--;
            }else if(mesAct==mesNaci && diaAct<diaNaci)
            edad--;
            System.out.println("Tienes " + edad + " años");
    }
    
}
