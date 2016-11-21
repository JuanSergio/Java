/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OBJETOS;

import java.util.Objects;
import java.io.*;

/**
 *
 * @author mati
 */
public class Multimedia implements Serializable {
//Esta clase contiene título, autor, formato y duración como atributos
    public String titulo, formato, autor;
    public Double duracion;
//El valor de todos los atributos se pasa por parámetro en el momento de crear el objeto
    public Multimedia(String titulo, String autor, String formato, Double duracion) {
        this.titulo = titulo;
        this.formato = formato;
        this.autor = autor;
        this.duracion = duracion;
    }
//un método para devolver cada uno de los atributos
    public String getTitulo() {
        return titulo;
    }

    public String getFormato() {
        return formato;
    }

    public String getAutor() {
        return autor;
    }

    public Double getDuracion() {
        return duracion;
    }
//método toString() que devuelve la información del objeto
    public String toString() {
        return "Multimedia{" + "titulo=" + titulo + ",autor=" + autor + ", "
                + "formato=" + formato +",  duracion=" + duracion + '}';
    }
//método equals() que recibe un objeto de tipo Multimedia y devuelve true en 
//caso de que el título y el autor sean iguales a los del objeto que llama al método y false en caso contrario.
    public boolean equals(Multimedia mult) {

        if (mult.getAutor().equals(this.autor) && mult.getTitulo().equals(this.titulo)) {
            return true;
        }

        return false;

    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

}
