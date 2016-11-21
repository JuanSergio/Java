/*
 Escribe un programa que solicite tres valores enteros con el día, mes y 
 año de una fecha e indique si se trata de valores válidos para una fecha.
 */
package Ejercicios01Unidad03;

import java.util.*;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner tlc = new Scanner(System.in);
        int dia, mes, año, fecha=0;
        boolean bisiesto;

        System.out.println("Introduce el dia: ");
        dia = tlc.nextInt();
        tlc.nextLine();
        System.out.print("Introduce el mes: ");
        mes = tlc.nextInt();
        tlc.nextLine();
        System.out.println("Introduce el año: ");
        año = tlc.nextInt();
        tlc.nextLine();
        
        switch(mes){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                {
                 fecha =(dia > 0 && dia <=31) ? 1:0;
            break;
                }
                case 4: case 6: case 9: case 11:
                {
                fecha =(dia > 0 && dia <=30) ? 1:0;
            break;
                }
                case 2:
                {
                bisiesto = año%4==0 && ( año%100!= 0 || año%400==0 );
                if(bisiesto == true)
                {
                fecha =(dia > 0 && dia <=29) ? 1:0;
            break;
                }
                else
                {
                fecha =(dia > 0 && dia <=28) ? 1:0;
                break;
                }
              }
            }
            if(fecha==1)
            System.out.println("La fecha es correcta.");
            else
            System.out.println("La fecha no es correcta.");
        } 
}

