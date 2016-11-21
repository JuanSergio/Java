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
import java.io.*;

public class APPMultimedia {
    public static void main(String[] args) throws ClassNotFoundException {
        try{
            
        FileOutputStream fos =new FileOutputStream("multimedia.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
//a) Se crea un objeto de tipo ListaMultimedia de tamaño máximo 10.       
        ListaMultimedia objetolista = new ListaMultimedia (10);
        
//d) Se cree un objeto de tipo Película introduciendo el título y el autor 
//de una de las películas de la lista. Para el resto de los argumentos 
//se utilizan valores no significativos.        
        Pelicula pelicula =new Pelicula("cars","pixar","DVDRIP", 86.00,"coche rojo", "coche azul");

//i)d) Se cree un objeto de tipo Disco introduciendo el título y el autor de uno
//de los discos de la lista, para el resto de los argumentos se utilizan valores no significativos.        
        Disco disco =new Disco ("Disco 2","nombre1","mp3",60.00,"pop");
        
//b) Se pidan tres películas y se añadan a la lista.       
       objetolista.añadirobjeto(new Multimedia("star wars","Lucas","HDRIP",120.00));
       objetolista.añadirobjeto(new Multimedia("los vengadores", "marvel","avi", 130.00));
       objetolista.añadirobjeto(new Multimedia("cars","pixar","DVDRIP", 86.00));
       objetolista.añadirobjeto(pelicula);
       
//c) Se muestre la lista por pantalla.       
       System.out.println(objetolista.getLista());
       
//e) Busca la posición de este objeto en la lista.       
       System.out.println(objetolista.posicionobjeto(pelicula));
       
//f) Obtenga el objeto que está en esa posición y lo muestre por pantalla junto con la posición en la que se encuentra.       
      objetolista.objetoposicion(3);
       
//g) Se creen tres discos y se añadan a la lista.       
       objetolista.añadirobjeto(new Multimedia("Disco 1","nombre1","mp3",50.00));
       objetolista.añadirobjeto(new Multimedia("disco 2","nombre2","mp3",60.00));
       objetolista.añadirobjeto(new Multimedia("Disco 3","nombre3","mp3",55.00));
       objetolista.añadirobjeto(disco);
       
//h) Se muestre la lista por pantalla.             
       System.out.println(objetolista.getLista());
       
//j) Busca la posición de este objeto en la lista.       
       System.out.println(objetolista.posicionobjeto(disco));
       
//k) Obtenga el objeto que está en esa posición y lo muestre por pantalla junto con la posición en la que se encuentra.     
       System.out.println("posicion: "+objetolista.objetoposicion(4)+ "objeto: "+objetolista.posicionobjeto(disco));
    
        System.out.println(objetolista.nºobjetos());
                    
        oos.writeObject(objetolista.getLista());
        oos.close();
        

        }catch(IOException e){
            System.out.println("error de escritura o lectura");
        }
    }
}
