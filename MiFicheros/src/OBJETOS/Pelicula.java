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
//La clase Película tiene, además de los atributos heredados, un actor principal
//y una actriz principal
public class Pelicula extends Multimedia{
    private String actorprincipal,actrizprincipal;
//que herede de la clase Multimedia anterior
    public Pelicula(String titulo, String autor, String formato, Double duracion,String actorprincipal,String actrizprincipal) {
        super(titulo, formato, autor, duracion);
        this.actrizprincipal=actrizprincipal;
        this.actorprincipal=actorprincipal;
    }
    ////dos métodos para obtener los dos nuevos atributos  
    public String datosnuevos(){
        return this.actorprincipal+this.actrizprincipal;
    }
    
  
    public String toStringnuevo() {
        return "Pelicula{" + "actorprincipal=" + actorprincipal + 
                ", actrizprincipal=" + actrizprincipal + '}';
    }
//debe sobrescribir el método toString() para que devuelva, además de la 
//información heredada, la nueva información.    
    public String toStringcompleto(){
        return "Multimedia{" + "titulo=" + titulo + ", formato=" + formato +
                ", autor=" + autor + ", "+ "duracion=" + duracion +
                ",actorprincipal=" +actorprincipal+ ",actrizprincipal=" 
                +actrizprincipal+'}';
    }
       
}
