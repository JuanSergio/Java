
package practicas;

public class Asignatura {
    private int identificador;
    private double calificacion;
    
    public Asignatura(int identificador){
        this.identificador = identificador;
    }
   
    public double getCalificacion (){
        return calificacion;
    }
    
    public int getIdentificador (){
        return identificador;
    }
    public void setCalificacion(double calificacion){
        this.calificacion = calificacion;
    }
}
