/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ALEATORIOS;

/**
 *
 * @author mati
 */
//Escribe un programa que acceda aleatoriamente a un fichero de 
//texto.El  programa  debe  preguntar  al  usuario  posiciones  del  fichero  y 
//convertir a mayúsculas el carácter leído en esa posición.
//El programa acabará cuando la posición solicitada sea -1
import java.io.*;
import java.util.Scanner;

public class ejer1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner tcl = new Scanner(System.in);
        int posicion;
        String nombrefichero = "texto.txt";
        RandomAccessFile raf = new RandomAccessFile(nombrefichero, "rw");

        try {
            do{
                System.out.println("Dime la posicion del caracter");
                posicion = tcl.nextInt();
                long longitud = raf.length();           
                if(posicion>=0){
                    raf.seek(posicion);
                
                if (raf.getFilePointer() < longitud) {
                    int caracter = raf.read();
                    raf.seek(raf.getFilePointer() -1);
                    raf.write(Character.toUpperCase(caracter));
                }
                }
            
             }while(posicion!=-1);

        }catch (IOException e) {
            System.out.println("Error problemas");
        } finally {

        try {
           
            if (raf != null) {
                raf.close();
            }
        
        } catch (IOException e) {
            System.out.println("Error al cerrar el fichero");
        }
    }
}
}
