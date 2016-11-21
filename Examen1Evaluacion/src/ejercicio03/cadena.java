
package ejercicio03;

import java.util.*;
public class cadena {
    public static void main(String[] args) {
        Scanner tlc = new Scanner(System.in);
        String cadena;
       
        System.out.println("Introduce una palabra con c: ");
        cadena = tlc.nextLine();
        String sustituto = cadena.replace ('c','*');
        if (cadena.contains("c")){
        System.out.println(sustituto);
        }else{
            System.out.println("No contiene c");
        }
    }
}