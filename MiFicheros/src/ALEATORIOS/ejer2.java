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
//Crea una clase que escriba una secuencia de números primos en un fichero y crea 
//otra clase que lea la mitad superior de los números escritos
import java.util.Scanner;
import java.io.*;
public class ejer2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf1 = null;
        RandomAccessFile raf2 = null;
        try{       
            raf1 = new RandomAccessFile("numerosPrimos.txt","rw");
            raf2= new RandomAccessFile("mitadNumeros.txt","rw");
            int num;
            //es el tamaño de larchivo, no el rango del contenido
            long longitud = raf1.length();

            //Compruebaque el numero es impar, y si lo es lo escribe en el fichero
            for(int i=0; i<=100; i++){
                if(i%2 != 0){                          
                    raf1.writeInt(i);
                 }
            }
            raf1.seek(0);
            long pos=0;
            System.out.println(longitud);
            //Le decimos que coja los primeros 50 numeros y los escriba en otro fichero. 
            if(longitud >= 0){
               while (pos < longitud/2){
                    //raf2.seek(raf2.getFilePointer());
                    num= raf1.readInt();
                  
                    //Lo imprimimos por pantalla.
                    System.out.println(num);
                   
                    pos = raf1.getFilePointer();
                }  
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontado");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error de lectura del fichero");
            System.out.println(e.getMessage());
        } finally {
            try {
                if (raf1 != null && raf2 != null) {
                    raf1.close();
                    raf2.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
    }
}
