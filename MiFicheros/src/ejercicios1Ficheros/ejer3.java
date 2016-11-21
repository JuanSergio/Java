/*
 A partir de un fichero de texto se creará un fichero cuyo contenido se obtendrá
a partir del primero. El fichero creado contendrá solo las líneas del primer 
fichero que superen o igualen un determinado número de caracteres. Se solicitará
al usuario el nombre de los ficheros y el tamaño mínimo que debe tener la línea.
 */
package ejercicios1Ficheros;
import java.util.*;
import java.io.*;

public class ejer3 {
    public static void main(String[] args) throws IOException  {
        Scanner tlc = new Scanner (System.in);
        int caracteres = 0;
        String cadena1, cadena2;
        File f1 = new File ("archivo1.txt");
        File f2 = new File ("archivo2.txt");
        FileReader fr1;
        FileWriter fw1;
        BufferedReader br1 = null;
        BufferedWriter bw1 = null;
        
        System.out.println("Se van a copiar las lineas que se deseen ");
        System.out.println("¿Número de carácteres? ");
        try{
            caracteres = tlc.nextInt();
        }catch(Exception e){
            System.out.println("Longitud errónea ");
            
        }
        try{
            fr1 = new FileReader(f1);
            br1= new BufferedReader(fr1);
            fw1 = new FileWriter(f2);
            bw1 = new BufferedWriter(fw1);
            cadena1 = br1.readLine();
            while(cadena1 != null){
                if(cadena1.length() >= caracteres){
                    bw1.write(cadena1 + "\n");
                }
                cadena1 = br1.readLine();
            }
        }catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado");
            System.out.println(e.getMessage());
            
        }finally{
            try{
                if(br1 != null){
                    br1.close();
                }
                if(bw1 != null){
                    bw1.close();
                }
            }catch(Exception e){
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
            
    }
}

