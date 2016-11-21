/*
 2. Desarrollar una clase llamada Circulo que:
 Tenga dos atributos prívate de tipo Punto y double.
 Tenga un constructor con dos parámetros de tipo Punto y double que inicialice los dos atributos.
 Tenga un constructor por defecto (sin parámetros) que inicialice los dos atributos al valor que se quiera.
 Tenga un constructor con tres parámetros de tipo double que inicialice los dos atributos.
 Tenga un getvalor para cada uno de los atributos.
 Tenga un método calcularDistanciaDesde que recibe un parámetro de tipo Punto y que devuelve un double.
 Tenga un método calcularArea que no recibe ningún parámetro y devuelve un double.
 Tenga un método calcularPeímetro que no recibe ningún parámetro y devuelve un double.
 */
package CIRCULO;

import PUNTO.Punto;

public class Circulo {
    private Punto punto;
    private double y;
    
    public Circulo(Punto punto, double y){
        this.punto = punto;
        this.y = y;
    }
    
    public Circulo(){
        punto= new Punto();
        y = 0;  
    }
    
    public Circulo(double a, double b, double radio){
        punto = new Punto(a, b);
        y = radio;
    }
    
    public Punto getPunto(){
        return punto;
    }
    
    public double getY(){
        return y;
    }
    
    public double calcularDistanciaDesde (Punto p){
        double distanciaPunto = punto.getX() - p.getX();
        double distanciaY = punto.getY() - p.getY();
        
        return Math.sqrt(Math.pow(distanciaPunto, 2) + Math.pow(distanciaY, 2));
    }
    
    public double calcularArea(){
        double area = Math.PI * Math.pow(y,2);
        return area;
    }
    public double calcularPerimetro(){
       double perimetro = 2 * Math.PI * y;
       return perimetro;
     }
     
     


}
