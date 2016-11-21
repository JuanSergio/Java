/*/1. Desarrollar una clase llamada Asignatura que:
 Tenga dos atributos prívate de tipo int (el identificador) y de tipo double (la calificación).
 Tenga un constructor con un parámetro de tipo int.
 Tenga un getvalor para cada uno de los atributos.
 Tenga un setvalor para la calificación.
 */
package Practica02;

public class Asignatura {
    private int id;
    private double calificacion;
    
    public Asignatura(int id){
        this.id = id;
    }

   
    public double getCalificacion (){
        return calificacion;
    }
    
    public int getIdentificador (){
        return id;
    }
    public void setCalificacion(double calificacion){
        this.calificacion = calificacion;
    }
}

