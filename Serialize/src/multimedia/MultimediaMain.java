/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multimedia;

import java.io.*;
import java.util.*;
/**
 *
 * @author Francisco
 */
public class MultimediaMain {

    public static void main(String[] args) throws ClassNotFoundException {
        //Objeto de lista multimedia, con valor 10
        ListaMultimedia ListaMultimedia = new ListaMultimedia(10);
        ObjectInputStream ist;
        try {
            ist = new ObjectInputStream(new BufferedInputStream(new FileInputStream("multi.dat")));
            ListaMultimedia = (ListaMultimedia) ist.readObject();
            ist.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        //Creo 3 peliculas. 
        try {
            Pelicula Spiderman = new Pelicula("1ra Parte. Spiderman", "Peter Parker",
                    Formato.mp3, "124", "Tobey Maguire", "Kirsten Dunst");
            Pelicula Superman = new Pelicula("2da Parte. Superman bitch", "Sam Raimi",
                    Formato.wav, "132", "Henry Cavill", "Amy Adams");
            Pelicula Spectre = new Pelicula("3ra Parte. James Bond", "Daniel Craig",
                    Formato.dvd, "96", "Daniel Craig", "Léa Seydoux");
  
            ListaMultimedia.add(Spiderman);
            ListaMultimedia.add(Superman);
            ListaMultimedia.add(Spectre);
        } catch (Exception x) {
            System.out.println("Datos incorrectos. ListaMultimedia no creada");
        }
        // Mostrar por pantalla
        System.out.println(ListaMultimedia);

        //Guardar los datos en el fichero multi
        ObjectOutputStream ost;
        try {
            ost = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("multi.dat")));
            ost.writeObject(ListaMultimedia);
            ost.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
