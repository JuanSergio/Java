/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francisco
 */
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int inicial = 0, tope = 0;
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letraNif;
        String cadenaDni, cadenaNif;
        BufferedWriter dni = null, nif = null;

        System.out.println("Número inicial? ");
        do {
            try {
                inicial = lector.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Número erróneo. Empezamos por el 100");
                lector.nextLine();
                inicial = 100;
            }
        } while (inicial < 0 || inicial > 99999999);

        do {
            System.out.println("Número final? ");
            try {
                tope = lector.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Número erróneo. Acabamos en el 200");
                lector.nextLine();
                tope = 200;
            }
        } while (inicial > tope || tope > 99999999);
        System.out.println("****Creamos desde  " + inicial + " hasta " + tope);
        try {

            dni = new BufferedWriter(new FileWriter("dni.txt"));
            nif = new BufferedWriter(new FileWriter("nif.txt"));

            for (int i = inicial; i <= tope; i++) {
                cadenaDni = String.valueOf(i);
                while (cadenaDni.length() < 8) {
                    cadenaDni = "0" + cadenaDni;
                }
                letraNif = letras.charAt(i % 23);
                cadenaNif = cadenaDni + letraNif;
                dni.write(cadenaDni);
                dni.newLine();
                nif.write(cadenaNif);
                nif.newLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de lectura de fichero");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error general de fichero");
            System.out.println(e.getMessage());
        } finally {
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
