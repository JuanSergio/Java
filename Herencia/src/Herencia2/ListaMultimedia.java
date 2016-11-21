/*
Escribe una clase ListaMultimedia para almacenar objetos de tipo
multimedia. La clase debe tener un atributo que sea un array de objetos
Multimedia y un entero para contar cuántos objetos hay almacenados. Además,
tiene un constructor y los siguientes métodos:
 */
package Herencia2;

public class ListaMultimedia{
    //con [] se crea una clase array
    private Multimedia[] lista;
    private int contador;
public ListaMultimedia(int tamañoMaximo){
    lista = new Multimedia[tamañoMaximo];
    contador = 0;
}    
    
}
