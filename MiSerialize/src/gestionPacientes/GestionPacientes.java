
package gestionPacientes;

import java.io.*;
import java.util.*;

public class GestionPacientes {

    public static void main(String[] args) {
        gestionpacientes.Archivador a = new gestionpacientes.Archivador();
        ObjectInputStream ist;
        try {

            ist = new ObjectInputStream(new BufferedInputStream(new FileInputStream("pacientes.dat")));
            a = (gestionpacientes.Archivador) ist.readObject();
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

