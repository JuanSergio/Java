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
import java.io.*;
//Crea un programa o método que lea los registros contenidos en el  
//fichero agendaObjecto.dat y los muestre por pantalla
public class ejer3 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("agendaObject.dat");
        ObjectInputStream ois =new ObjectInputStream (fis);        
        System.out.println(ois.readObject());

    }
}
