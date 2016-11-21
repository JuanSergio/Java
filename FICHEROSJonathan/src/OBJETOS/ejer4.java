/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OBJETOS;

/**
 *
 * @author mati
 */
//Modifica el ejercicio Multimedia de la unidad 09 para guardar y leer la 
//lista Multimedia en un fichero

//para ello en la APPMultimedia creamos el archivo donde se va a escribir y 
//indicamos que va a escribir en ello.
//como la clase que predomina es Multimedia, en esa clase se Serializa
import java.io.*;
public class ejer4 implements Serializable {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("multimedia.dat");
        ObjectInputStream ois =new ObjectInputStream (fis);
        System.out.println(ois.readObject());
             
    }
}
