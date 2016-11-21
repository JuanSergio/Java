
package AccesoAleatorio;

import java.io.*;
import java.util.*;
import java.util.logging.Logger;

public class miAgenda implements Serializable {
    
    private ArrayList<Persona> agenda;
    private int cont =0;

    public miAgenda(Persona persona) {
        agenda = new ArrayList<Persona>();
        agenda.add(cont, persona);
        cont++;
    }   
}
