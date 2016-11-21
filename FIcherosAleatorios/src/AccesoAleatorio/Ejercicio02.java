/*
2. - A partir de dos ficheros de texto se creará un tercer fichero cuyo 
contenido se obtendrá uniendo la información de estos ficheros. Las líneas del 
fichero creado contendrán todas las combinaciones de líneas del primer fichero 
con las líneas del segundo. Se solicitará al usuario el nombre de los ficheros 
y la tira de separación entre ambas líneas.
 */
package AccesoAleatorio;
import java.io.*;
import java.util.*;

public class Ejercicio02 {
    public static void main(String[] args) throws IOException {
        Scanner tlc = new Scanner (System.in);
        FileWriter fw1 = new FileWriter ("numeros.txt");
        FileWriter fw2 = new FileWriter ("mitad.txt");
        BufferedWriter bw1 = new BufferedWriter (fw1);
        BufferedWriter bw2 = new BufferedWriter (fw2);
        try{
            for(int i = 0; i < 100; i++){
                
                
            }
        }catch(Exception e){
            System.out.println("Error");
        }
        
    }
    
}
