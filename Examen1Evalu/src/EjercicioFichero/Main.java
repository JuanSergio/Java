
package EjercicioFichero;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        OperacionesBasicasFicheros operacionesFichero;
        operacionesFichero = new OperacionesBasicasFicheros ("C:/PruebaJava.txt");
        System.out.println(operacionesFichero.CuentaLineas());
        System.out.println(operacionesFichero.CuentaPalabras("maldonado"));
        System.out.println(operacionesFichero.CuentaCaracteres('a'));
        System.out.println(operacionesFichero.CuentaCaracteres('b'));
        System.out.println(operacionesFichero.DiferenciaPalabras('a', 'b'));
    }
 }
    
    
    
