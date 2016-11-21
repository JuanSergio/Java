/*
 2.a.- Escribe una clase Punto () que contenga los siguientes métodos:
a) los constructores y los métodos getX(), getY(), setX(), setY() y distancia()
b) Un método toString() que devuelva la información del Punto de la siguiente manera (x,y).
 */
package MiPunto;

public class Punto {
    private double x, y;
    
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }  
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    //Calcular la distancia entre "x" y "y"
    
    public double distancia(Punto a){
        double distancia = Math.sqrt(Math.pow(this.getX() - a.getY(), 2) + 
                Math.pow(this.getY() - a.getY(), 2));
        return distancia;
    }
    //Calcular distancia entre un punto y el origen
    public double distancia(){
        double distancia = Math.sqrt(Math.pow(this.getX() - 0, 2) + Math.pow(this.getY() - 0, 2));
        return distancia;
    }
    public String toString(){
        return "( " + x + ", " + y + ")";
    }
}
