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
import java.util.Arrays;
import java.util.LinkedList;

public class pila {

    LinkedList<String> objetoLista = new LinkedList(Arrays.asList("susi", "Wanal", "jony", "andrea", "Wanal"));

    public pila() {
    }

    public void mostrar(int posicion) {

        System.out.println(objetoLista.get(posicion) + " la posicion del nombre es " + posicion);
    }

    public int fifo(String nombre) {

        return objetoLista.indexOf(nombre);

    }

    public int lifo(String nombre) {

        return objetoLista.lastIndexOf(nombre);
    }
}
