/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpacientes;

import java.io.*;
import java.util.*;
/**
 *
 * @author Francisco
 */
public class GestionPacientes {

    public static void main(String[] args) {
        Archivador a = new Archivador();
        ObjectInputStream ist;
        try {

            ist = new ObjectInputStream(new BufferedInputStream(new FileInputStream("pacientes.dat")));
            a = (Archivador) ist.readObject();
            ist.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        Ficha f = new Ficha("Wanaldino", "Antimonio", 22);
        a.guardar(f);
        a.guardar(new Ficha("Jorge", "Coello", 18));
        a.guardar(new Ficha("Fernando", "Pérez", 21));
        a.listar();
        a.eliminar(f);

        ObjectOutputStream ost;
        try {
            ost = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("pacientes.dat")));
            ost.writeObject(a);
            ost.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
