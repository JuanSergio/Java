/*
 1. Desarrollar una clase llamada Punto que:
 Tenga dos atributos prívate de tipo double.
 Tenga un constructor con dos parámetros de tipo double que inicialice
los dos atributos.
 Tenga un constructor por defecto (sin parámetros) que inicialice los dos
atributos al valor que se quiera.
 Tenga un getvalor para cada uno de los atributos.
 Tenga un método calcularDistanciaDesde que recibe un parámetro de
tipo Punto y que devuelve un double
 */
package PUNTO;

import java.util.*;
public class Punto {
    private double x, y;
    
    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Punto(){
        this(0,0);
    }
   
    public double getX(){
        return x; 
    }
    
    public double getY(){
        return y;
    }
    
    public double calcularDistanciaDesde(Punto p){
        double distanciaX = x - p.x;
        double distanciaY = y - p.y;
        
        return Math.sqrt(distanciaX * distanciaY * distanciaX * distanciaY);
    }
}
