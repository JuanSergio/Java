/*Tenga dos atributos prívate de tipo Punto y double.
Tenga un constructor con dos parámetros de tipo Punto y double que
inicialice los dos atributos.
Tenga un constructor por defecto (sin parámetros) que inicialice los dos
atributos al valor que se quiera.
Tenga un constructor con tres parámetros de tipo double que inicialice
los dos atributos.
Tenga un getvalor para cada uno de los atributos.
Tenga un método calcularDistanciaDesde que recibe un parámetro de
tipo Punto y que devuelve un double.
Tenga un método calcularArea que no recibe ningún parámetro y
devuelve un double.
Tenga un método calcularPeímetro que no recibe ningún parámetro y
devuelve un double.
 */
package entrega;

/**
 *
 * @author mati
 */
//atributo
public class Circulo {
    private double radio;
    private Punto punto;   

//constructor
public Circulo (double radio, Punto punto){
this.radio=radio;
this.punto=punto;


}
public Circulo (Punto param1, double param2) {
  punto = param1;
  radio = param2;
}
public Circulo(double param1, double param2, double param3){
    punto=new Punto(param1, param2);
    radio= param3;
    
    }
  
  public Punto getPunto(){
      return punto;        
}
  public double getRadio(){
      return radio;
  }
}