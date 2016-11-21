/*
 3. Desarrollar una clase llamada Triangulo que:
 Tenga tres atributos prívate de tipo Punto.
 Tenga un constructor con tres parámetros de tipo 
Punto que inicialice los dos atributos.
 Tenga un constructos por defecto (sin parámetros) que inicialice los tres atributos al valor que se quiera.
 Tenga un constructor con seis parámetros de tipo double que inicialice los tres atributos.
 Tenga un getvalor para cada uno de los atributos.
 Tenga un método calcularDistanciaDesde que recibe un parámetro de tipo Punto y que devuelve un doublé.
  Tenga un método calcularArea que no recibe ningún parámetro y devuelve un double.
 Tenga un método calcularPerimetro que no recibe ningún parámetro y devuelve un double.
 */
package Triangulo;

import PUNTO.Punto;


public class triangulo {
    private Punto lado1, lado2, lado3;
    
    //Constructor
    public triangulo (Punto lado1, Punto lado2, Punto lado3){
    this.lado1 = lado1;
    this.lado2 = lado2;
    this.lado3 = lado3;
    }    
    
    public triangulo(){
        lado1 = null;
        lado2 = null;
        lado3 = null;
    }
    
    public triangulo(double a, double b, double c, double d, double e, double f){
        lado1 = new Punto(0,0);
        lado2 = new Punto(0,0);
        lado3 = new Punto(0,0);
    }
    
    public Punto getLado1(){
        return lado1;
    }
    
    public Punto getLado2(){
        return lado2;
    }
    
    public Punto getLado3(){
        return lado3;
    }
    
    public double perimetro(){
        double ab = lado1.calcularDistanciaDesde(lado1);
        double cd = lado1.calcularDistanciaDesde(lado2);
        double ef = lado1.calcularDistanciaDesde(lado3);
    return (ab + cd+ ef);
    }
}
