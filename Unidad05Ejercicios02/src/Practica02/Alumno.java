/*
 2. Desarrollar una clase llamada Alumno que:
 Tenga tres atributos prívate de tipo Asignatura.
 Tenga un constructor con tres parámetros de tipo Asignatura que inicialice los tres atributos.
 Tenga un constructor con tres parámetros de tipo int que inicialice los tres atributos.
 Tenga un getvalor para cada uno de los atributos.
 */
package Practica02;

public class Alumno {
    private Asignatura asignatura1=null;
    private Asignatura asignatura2=null;
    private Asignatura asignatura3=null;
   
    public Alumno (Asignatura asignatura1, Asignatura asignatura2, Asignatura asignatura3){
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;
    }
    
    public Alumno (int asignatura1, int asignatura2, int asignatura3){
        this.asignatura1 = new Asignatura(asignatura1);
        this.asignatura2 = new Asignatura(asignatura2);
        this.asignatura3 = new Asignatura(asignatura3);
    }
    
    public Asignatura getAsignatura1(){
        return asignatura1;
    }     
    public Asignatura getAsignatura2(){
        return asignatura1;
    }    
    public Asignatura getAsignatura3(){
        return asignatura1;
    }    
    
}

