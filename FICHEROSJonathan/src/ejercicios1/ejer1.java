/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios1;
/**
 *
 * @author mati
 */
import java.util.Scanner;
import java.io.*;
public class ejer1 {
//A partir de dos ficheros de texto se creará un tercer fichero cuyo contenido se 
//obtendrá uniendo la información de estos ficheros. Cada línea del fichero creado
//estará formado por la unión de la misma línea de los dos ficheros leídos. 
//Se solicitará al usuario el nombre de los ficheros y la tira de separación entre
//ambas líneas.   
    public static void main(String[] args) throws IOException {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Dime el nombre del 1º fichero");
        String primerfichero=tcl.nextLine();
        FileWriter fw1 = new FileWriter (primerfichero);
        System.out.println("Dime el nombre del 2º fichero");
        String segundofichero=tcl.nextLine();
        FileWriter fw2 = new FileWriter (segundofichero);
        System.out.println("Escribe algo en el primer fichero");
        String dato1=tcl.nextLine();
        fw1.write(dato1);
        fw1.close();
        System.out.println("Escribe algo en el segundo fichero");
        String dato2=tcl.nextLine();
        fw2.write(dato2);
        fw2.close();
        System.out.println("Dime con que separo las lineas");
        String separacion=tcl.nextLine();
        try{
                   
        FileWriter fw3 = new FileWriter ("tercerfichero.txt");
        BufferedWriter bw = new BufferedWriter (fw3);
        bw.write(dato1, 0, dato1.length());
        bw.write(separacion);
        bw.write(dato2, 0, dato2.length());
        bw.close();

    }catch (IOException e){
            System.out.println("error problemas");
    }
  
    }
   
}

