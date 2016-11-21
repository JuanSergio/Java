/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios1;
/**
 *
 * @author Jon
 */
import java.util.Scanner;
import java.io.*;
//A partir de un fichero de texto se creará un fichero cuyo contenido se obtendrá 
//a partir del primero. El fichero creado contendrá solo las líneas del primer 
//fichero que superen o igualen un determinado número de caracteres. Se solicitará 
//al usuario el nombre de los ficheros y el tamaño mínimo que debe tener la línea.
public class ejer3 {
    public static void main(String[] args) throws IOException {
        Scanner tcl = new Scanner (System.in);
        System.out.println("Dime el nombre del 1ºfichero a crear");
        String fichero1 =tcl.nextLine();
        FileWriter fw1 = new FileWriter (fichero1);
        System.out.println("Dime el nombre del 2º fichero");
        String fichero2 = tcl.nextLine();
        FileWriter fw2 = new FileWriter (fichero2);       
        System.out.print("Escribe algunas lineas para el 1ºfichero");        
        String dato1=tcl.nextLine(); 
        dato1=dato1.replaceAll(" ", "\n");
        fw1.write(dato1+"\n");
        fw1.close();
        System.out.println("Dime longitud de caracteres");
        int longitud =tcl.nextInt();
        
    
    try{
        BufferedWriter bw=new BufferedWriter(fw2);
        FileReader fr = new FileReader (fichero1);
        
        BufferedReader br = new BufferedReader (fr);
        
        dato1=br.readLine();
        
        while(dato1!=null){
            if (dato1.length()>=longitud){
                bw.write(dato1+"\n");
                
            }
            dato1=br.readLine();
        }
        bw.close();
        br.close();
        fr.close();       
        
    }catch (IOException x){
        System.out.println("Error problemas");
    }       
  }
}
