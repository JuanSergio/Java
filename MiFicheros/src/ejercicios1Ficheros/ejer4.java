
package ejercicios1Ficheros;
import java.io.*;
import java.util.*;

public class ejer4 {
    public static void main(String[] args) throws IOException {
        Scanner tlc = new Scanner (System.in);
        int inicial = 0, fin = 0;
        String letra= "TRWAGMYFPDXBNJZSQVHLCKE";
        char letraNif;
        String cadenaDni, cadenaNif;
        BufferedWriter dni = null, nif = null;
        
        System.out.println("Numero inicial? ");
        do{
            try{
                inicial = tlc.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Numero incorrecto");
                System.out.println(e.getMessage());
            }
        }while(inicial < 0 || inicial > 99999);
        
        do{
            System.out.println("EL numero final? ");
            try {
                fin = tlc.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Numero incorrecto");
                System.out.println(e.getMessage());
            }
        }while(fin < 0 || fin > 99999);
        System.out.println("Se crea desde: " + inicial + " hasta " + fin);
        try{
            dni = new BufferedWriter (new FileWriter ("dni.txt"));
            nif = new BufferedWriter (new FileWriter ("nif.txt"));
            
            for (int i = inicial; i <= fin; i++) {
                cadenaDni = String.valueOf(i);
                while (cadenaDni.length() < 8) {
                    cadenaDni = "0" + cadenaDni;
                }
                letraNif = letra.charAt(i % 23);
                cadenaNif = cadenaDni + letraNif;
                dni.write(cadenaDni);
                dni.newLine();
                nif.write(cadenaNif);
                nif.newLine();
            }
        }catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());

    }finally {
            try {
                if (nif != null) {
                    nif.close();
                }
                if (dni != null) {
                    dni.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
    }
}
