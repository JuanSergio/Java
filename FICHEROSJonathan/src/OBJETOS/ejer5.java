/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OBJETOS;
/**
 *
 * @author Jon
 */
import java.io.*;
//Modifica el ejercicio archivador de pacientes de la unidad 08
//para guardar y leer la lista de pacientes en un fichero
public class ejer5 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
//para ello hemos modificado la clase archivador.java, para implementar el metodo getpaciente.
 //una vez hecho eso, en la clase gestionpacientes, creamos los metodos de escribir.
        
        
        FileInputStream fis= new FileInputStream("pacientes.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        System.out.println(ois.readObject());
        
        
        
        
    }
}
