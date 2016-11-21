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

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int longitud;
        String cadena1, cadena3;
        String fichero1, fichero3, separador;
        FileReader fr1;
        FileWriter fw;
        BufferedWriter bw = null;
        BufferedReader br1 = null;

        System.out.println("Vamos a copiar las lineas más largas que un número de caracteres dado");
        fichero1 = "lista1.txt";
        fichero3 = "lista3.txt";
        System.out.println("Número de caracteres? ");
        try {
            longitud = lector.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Longitud errónea. tomamos el valor de longitud=8");
            longitud = 8;
        }
        try {
            fr1 = new FileReader(fichero1);
            br1 = new BufferedReader(fr1);
            fw = new FileWriter(fichero3);
            bw = new BufferedWriter(fw);
            cadena1 = br1.readLine();
            while (cadena1 != null) {
                if (cadena1.length() >= longitud) {
                    bw.write(cadena1 + "\n");
                }
                cadena1 = br1.readLine();
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
                if (br1 != null) {
                    br1.close();
                }
                if (bw != null) {
                    bw.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
    }
}
