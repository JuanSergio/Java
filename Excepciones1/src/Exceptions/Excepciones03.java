
package Exceptions;

import java.util.Scanner;

public class Excepciones03 {
    public static void main(String[] args) {
        Scanner tlc = new Scanner (System.in);
        int numero1, numero2;
    
        System.out.println("Introduce el primer número: ");
        try{
        numero1 = tlc.nextInt();
        System.out.println("Introduce el segundo número: ");
        numero2 = tlc.nextInt();
    
        if(numero1>numero2){
            System.out.println(numero2 + " , " + numero1);
        }else{
            System.out.println(numero1 + " , " + numero2);
        }
    }catch(Exception excep1){
            System.out.println("NO has introducido un valor numérico");
    }
}
}
