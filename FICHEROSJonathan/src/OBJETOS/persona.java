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
import java.util.*;
import java.io.*;
//Crea un programa o método que permita al usuario introducir datos 
//como objetos de la clase y se guarden en el fichero de datos agendaObject.dat 
public class persona {
    public static void main(String[] args) {
        try{
        ArrayList<String> array=new ArrayList<String>();
        Scanner tcl = new Scanner (System.in);
        FileOutputStream fos = new FileOutputStream("agendaObject.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        System.out.println("Digame su nombre");
        String nombre=tcl.nextLine();
        System.out.println("Digame su direccion");
        String dir=tcl.nextLine();
        System.out.println("Digame su numero de telefono");
        String telf=tcl.nextLine();
        array.add(telf);
        System.out.println("Digame su correo electronico");
        String correo=tcl.nextLine();

        miAgenda datos =new miAgenda(nombre,dir,correo, array);       
        oos.writeObject(datos);
        oos.close();
        }catch(IOException e){
            System.out.println("Error de lectura o escritura");
        }
    }
}
