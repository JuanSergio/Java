
package agenda;
import java.io.*;
import java.util.*;

public class agendaLee {
    public static void main(String args[]) {
        boolean salida = false;
        String cadena = "agendaObject.dat";

        Scanner flujoEntrada = new Scanner(System.in);
        //Objetos para lecturas
        FileInputStream ficha = null;
        BufferedInputStream b = null;
        ObjectInputStream d = null;
        boolean fin = false;
        try {
            //Objeto File
            File f = new File(cadena);
            if (!f.exists()) {
                System.out.println("El fichero no existe en la ruta especificada");
            } else
            {
                try {
                    //flujo de entrada
                    ficha = new FileInputStream(f);
                    b = new BufferedInputStream(ficha);
                    d = new ObjectInputStream(b);
                } catch (FileNotFoundException e) {
                    System.out.println(e.getMessage());
                    fin = true;
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                    fin = true;
                }

                miAgenda agenda = new miAgenda();
                do {
                    try {
                        agenda= (miAgenda) d.readObject();
                    } catch (ClassNotFoundException e) {
                        System.out.println("Clase no encontrada");
                        fin = true;
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                        fin = true;
                    }

                    System.out.println("\n\nRegistro");
                    System.out.print("\nNombre : " + agenda.getNombre());
                    System.out.print("\nDirección : " + agenda.getDireccion());

                    //for de telefonos
                    for (int i = 0; i < agenda.getFono().size(); i++) {
                        System.out.print("\nTeléfono : " + agenda.getFono().get(i));
                    }

                    System.out.print("\nEmail : " + agenda.getEmail());

                    System.out.print("\n\nSiguiente [enter] : ");
                    cadena = flujoEntrada.nextLine();

                } while (!fin); 
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            d.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}


