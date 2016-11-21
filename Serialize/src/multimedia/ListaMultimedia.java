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
public class ListaMultimedia implements Serializable{

    private Multimedia[] lista;
    private int total = 0;

    //Recibe por parámetro un entero, y le indica cuantos se pueden almacenar como máximo. 
    public ListaMultimedia(int x) {
        lista = new Multimedia[x];
        total=0;
    }

    //Devuelve el número de objetos que hay en una lista
    public int size() {
        return total;
    }

    //Añade un objeto al final de la lista (true), si esta llena devuelve false.
    public boolean add(Multimedia x) {
        if (total < lista.length) {
            lista[total] = x;
            total++;
            return true;
        } else {
            return false;
        }
    }

    //Devuelve un objeto especifico
    public Multimedia get(int posicion) {
        return lista[posicion];
    }

    //Devuelve la posición específica, sino dará -1
    public int indexOf(Multimedia m) {
        for (int i = 0; i < total; i++) {
            if (lista[i].equals(m)) {
                return i;
            }
        }
        return -1;
    }

    //Devuelve la info de los objetos de la lista
    public String toString() {
        String resultado = "";

        for (int i = 0; i < this.size(); i++) {
            resultado = resultado + "\nMultimedia [" + i + "]: \n" + 
                    this.get(i)+ "\n";
        }
        return resultado;
    }
}
