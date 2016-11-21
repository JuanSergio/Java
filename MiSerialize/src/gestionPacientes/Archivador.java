package gestionpacientes;

import java.io.*;
import java.util.*;

public class Archivador implements Serializable {

    private ArrayList<Ficha> pacientes = new ArrayList();

    public void guardar(Ficha param) {
        pacientes.add(param);
    }

    public void eliminar(Ficha param) {
        pacientes.remove(param);
    }

    public void listar() {
        System.out.println("Número de fichas: " + pacientes.size());

        for (int i = 0; i < pacientes.size(); i++) {
            System.out.println(pacientes.getClass(i));
        }
    }

}
