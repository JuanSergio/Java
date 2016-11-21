/*
 * 2. -	A partir de dos ficheros de texto se creará un tercer fichero cuyo 
 * contenido se obtendrá uniendo la información de estos ficheros. 
 * Las líneas del fichero creado contendrán todas las combinaciones de líneas 
 * del primer fichero con las líneas del segundo. Se solicitará al usuario 
 * el nombre de los ficheros y la tira de separación entre ambas líneas.
 */
package ejercicios1Ficheros;
import java.util.*;
import java.io.*;

public class ejer2 {
    public static void main(String[] args)throws IOException {
       
        String cadena1, cadena2, cadena3;
        String fichero1, fichero2, fichero3, separador;
        FileReader fr1, fr2;
        FileWriter fw;
        BufferedWriter bw = null;
        BufferedReader br1 = null, br2 = null;
        
        boolean error = false;
        System.out.println("Se van a unir el fichero1 y el fichero2 en el fichero3");
        fichero1 ="archivo1.txt";
        fichero2 ="archivo2.txt";
        fichero3 = "archivo3.txt";
        separador= " * ";
    //Se crean los elementos a leer y escribir para almacenar en fichero3
    try{
        fr1= new FileReader (fichero1);
        br1= new BufferedReader (fr1);
        
        fw= new FileWriter(fichero3);
        bw= new BufferedWriter(fw);
        cadena1 = br1.readLine();
        
        while(cadena1 != null){
            fr2= new FileReader (fichero2);
            br2= new BufferedReader (fr2);
            cadena2 = br2.readLine();
            
        while(cadena2 != null){
            cadena3 = cadena1 + separador + cadena2 + "\n";
            bw.write(cadena3);
            cadena2 = br2.readLine();
        }
        cadena1 = br1.readLine();
        }
        }catch (FileNotFoundException e){
            System.out.println("Error fichero no encontrado");
            System.out.println(e.getMessage());
        }finally{
        try{
            if(br1 != null){
                br1.close();
            }
            if(br2 != null){
                br2.close();
            }
            if(bw != null){
                bw.close();
            }
        }catch(Exception e){
            System.out.println("Error al cerrar el fichero");
            System.out.println(e.getMessage());
        }
    }
  }
}
        
 

