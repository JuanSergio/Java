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
public class Disco extends Multimedia{

    private String genero;

    public Disco(String titulo, String autor, Formato formato, String duracion, 
            String genero)  {
     
        super(titulo, autor, formato, duracion);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String toString() {
        return super.toString()+ "\nGénero: " + genero + "\n";
    }
}
