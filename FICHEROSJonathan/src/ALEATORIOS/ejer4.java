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
import java.io.*;
public class ejer4 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream f = new FileInputStream("agenda.dat");
        ObjectInputStream ost = new ObjectInputStream(f);
        Miagenda agenda =new Miagenda();
        System.out.println(ost.readObject());
    }
}
