/*Tenga dos atributos prívate de tipo double.
Tenga un constructor con dos parámetros de tipo double que inicialice
los dos atributos.
Tenga un constructor por defecto (sin parámetros) que inicialice los dos
atributos al valor que se quiera.
Tenga un getvalor para cada uno de los atributos.
Tenga un método calcularDistanciaDesde que recibe un parámetro de
tipo Punto y que devuelve un double.
 */
package entrega;

/**
 *
 * @author mati
 */
public class Punto {
    
    //atributos
    private double x,y;
    
    //constructor
    public Punto (double x, double y){
        this.x=x;
        this.y=y;
    }
    
    public Punto () {
        this.x=20;
        this.y=5;
    }
    
    //geter
    
    public double getX (){
        return x;
    }
    
    public double getY () {
        return y;
    }
    //método
    
    public double calcularDistanciaDesde (Punto parametro){
        double distanciaX=this.x-parametro.x;
        double distanciaY=this.y-parametro.y;
        double distanciaTotal=Math.sqrt(distanciaX * distanciaX+distanciaY*distanciaY);
        return distanciaTotal;
    }
    
    
}
