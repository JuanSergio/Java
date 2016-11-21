/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ALEATORIOS;
/**
 *
 * @author Jon
 */
import java.util.Scanner;
import java.io.*;
public class Miagenda {
    public static void main(String[] args){
        try{       
        Scanner tcl =new Scanner (System.in);
        FileOutputStream fos=new FileOutputStream("agenda.dat");
        ObjectOutputStream oos =new ObjectOutputStream (fos);
        
        System.out.println("Digame su nombre");
        String nombre=tcl.nextLine();
        System.out.println("Digame su direccion");
        String direccion=tcl.nextLine();
        System.out.println("Digame su telefono");
        long telf=tcl.nextLong();
        System.out.println("Digame su e-mail");
        String correo=tcl.nextLine();
        
        persona humano= new persona(nombre,direccion,correo,telf);
        oos.writeObject(humano);
        oos.flush();
        oos.close();
        }catch(IOException e){
            System.out.println("error de lectura o escritura");
        }
    }
}
