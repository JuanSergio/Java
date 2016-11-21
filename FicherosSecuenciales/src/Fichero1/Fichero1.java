//A partir de dos ficheros de texto se creará un tercer fichero cuyo contenido
//se obtendrá uniendo la información de estos ficheros. Cada línea del
//fichero creado estará formado por la unión de la misma línea de los dos
//ficheros leídos. Se solicitará al usuario el nombre de los ficheros y la tira
//de separación entre ambas líneas.
package Fichero1;
import java.io.*;
import java.util.*;

public class Fichero1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String fichero1, fichero2, fichero3, separador;
        String cadena1, cadena2, cadena3;
        FileReader fr1, fr2;
        FileWriter fw;
        BufferedWriter bw = null;
        BufferedReader br1 = null, br2 = null;
        
        System.out.println("Se va a unir los datos fichero1 y fivhero2 en fichero3");
        fichero1 = "lista1.txt";
        fichero2 = "lista2.txt";
        fichero3 = "lista3.txt";
        separador = " * ";
        
        
        try{
            fr1 = new FileReader (fichero1);
            br1 = new BufferedReader (fr1);
            fr2 = new FileReader (fichero2);
            br2 = new BufferedReader (fr2);
            fw = new FileWriter (fichero3);
            bw = new BufferedWriter (fw);
            cadena1 = br1.readLine();
            cadena2 = br2.readLine();
            while (cadena1 != null || cadena2 != null ){
            
                if (cadena1 == null) {
                    cadena1= "";
                }
               if (cadena2 == null) {
                    cadena2 = "";
                }
                cadena3 = cadena1 + separador + cadena2 + "\n";
                bw.write(cadena3);

                cadena1 = br1.readLine();
                cadena2 = br2.readLine();
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
                if (br2 != null) {
                    br2.close();
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