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
public class Multimedia implements Serializable{
    private String titulo, autor, duracion;
    private Formato formato;

    public Multimedia(String titulo, String autor, Formato formato, String duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    public String toString() {
        return "Titulo: " + titulo + "\nAutor: " + autor + "\nFormato: " + 
                formato + "\nDuración: " + duracion + "\n";
    }

    public boolean equals(Multimedia m) {
        boolean igual = false;

        if (m.getTitulo().equalsIgnoreCase(this.getTitulo()) && 
                m.getAutor().equalsIgnoreCase(this.getAutor())) {
            igual = true;
        } else {
            igual = false;
        }
        return igual;
    }
}
