/*
 * 2. -	A partir de dos ficheros de texto se creará un tercer fichero cuyo 
 * contenido se obtendrá uniendo la información de estos ficheros. 
 * Las líneas del fichero creado contendrán todas las combinaciones de líneas 
 * del primer fichero con las líneas del segundo. Se solicitará al usuario 
 * el nombre de los ficheros y la tira de separación entre ambas líneas.
 */
package Fichero1;
import java.util.*;
import java.io.*;

public class EjerciciosFicheros2 {
    public static void main(String[] args) throws IOException {
        
    //Se necesita leer los datos, es lo primero Scanner
    Scanner lector = new Scanner (System.in);
    String cadena1, cadena2, cadena3;
    String fichero1, fichero2, fichero3;
    //Se debe de leer el archivo y escribirlo
    FileReader fr1, fr2;
    FileWriter fw;
    //Se tiene que guardar la memoria del fichero en memoria propia, con 
    //valor null se reserva.
    BufferedWriter bw= null;
    BufferedReader br1= null, br2= null;
    
    //Se crean los objetos
    System.out.println("Se va a unir los datos fichero1 y fichero2 en fichero3");
        fichero1 = "lista1.txt";
        fichero2 = "lista2.txt";
        fichero3 = "lista3.txt";
        
        //try se usa para crear el posible error que puede generar el codigo
    try {
        fr1 = new FileReader(fichero1);
        br1 = new BufferedReader (fr1);
        
        fw = new FileWriter (fichero3);
        bw = new BufferedWriter (fw);
        cadena1 = br1.readLine();
        
        while (cadena1 != null) {
            fr2 = new FileReader (fichero2);
            br2 = new BufferedReader (fr2);
            cadena2 = br2.readLine();
            while (cadena2 != null){
                cadena3 = cadena1 + cadena2 +'\n';
                bw.write(cadena3);
                cadena2 = br2.readLine();
            }
            cadena1 = br1.readLine();
        }
        
    }
    catch (FileNotFoundException e){
        
    }
    
}
    
}   
