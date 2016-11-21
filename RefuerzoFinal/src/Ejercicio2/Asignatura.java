
package Ejercicio2;

public class Asignatura {
    private int identificador;
    private double calificacion;
    
    public Asignatura(int identificador, double calificacion){
        this.identificador = identificador;
        this.calificacion = calificacion;
        
    }
    
    public int getIdentificador(){
        return identificador;
    }
    
    public double getCalificacion(){
        return calificacion;
    }
    
    public void setCalificacion(double nota){
        calificacion = nota;
    }
}
