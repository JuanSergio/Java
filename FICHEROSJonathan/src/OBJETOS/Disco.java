/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OBJETOS;

/**
 *
 * @author Jon
 */
//Escribe una clase Disco que herede de la clase Multimedia ya realizada
public class Disco extends Multimedia {

//un atributo para almacenar el género al que pertenece
    private String genero;
    
    public Disco (String titulo, String autor, String formato, Double duracion, String genero){
        super (titulo,autor,formato,duracion);
        this.genero=genero;
    }
//un método para obtener el nuevo atributo    
    public String datosnuevos (String genero){
        return this.genero=genero;
    }
    public String toStringnuevo() {
        return "Disco{" + "genero=" + genero + '}';
    }
//método toString() para que devuelva, además de la información heredada, 
//la nueva información.    
    public String toStringcompleto() {
        return "Disco{" + "genero=" + genero + "titulo="+titulo+ "autor="+autor+ "formato="+formato+ "duracion="+duracion+ '}';
    }
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}