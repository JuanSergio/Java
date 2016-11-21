
 
package Examen;

import java.util.*;
public class Principal {
    
    public static void main(String args[]){
         ArrayList <Asignatura> asignatura= new ArrayList();
         ArrayList <Alumno> alumnos=new ArrayList();
         
         
        //vamos añadiendo al arraylist las asignaturas del centro 
         
        asignatura.add(new Asignatura());
        asignatura.add(new Asignatura());
        asignatura.add(new Asignatura());
        
        //añadimos en el otro arraylist a todos los alumnos del centro(5)
        alumnos.add(new Alumno());
        alumnos.add(new Alumno());
        alumnos.add(new Alumno());
        alumnos.add(new Alumno());
        alumnos.add(new Alumno());
        
        //ponemos dos calificaciones a dos alumnos
       Profesor profesor=new Profesor();
       profesor.ponerNotas(alumnos.get(0));
       profesor.ponerNotas(alumnos.get(1));
        
        
        System.out.println("Carmen Solano");
        System.out.println("Asignatura 1: "+alumnos.get(0).getAsignaturaA().getNota());
        System.out.println("Asignatura 2: "+alumnos.get(0).getAsignaturaB().getNota());
        System.out.println("Asignatura 3: "+alumnos.get(0).getAsignaturaC().getNota());
       
        
        
        System.out.println("Federico Jimenez");
        System.out.println("Asignatura 1: "+alumnos.get(1).getAsignaturaA().getNota());
        System.out.println("Asignatura 2: "+alumnos.get(1).getAsignaturaB().getNota());
        System.out.println("Asignatura 3: "+alumnos.get(1).getAsignaturaC().getNota());
       
          
        
     
       
       System.out.println("La media de Carmen Solano es: "+profesor.CalcularMedia(alumnos.get(0)));
       System.out.println("La media de Federico Jimenez es: "+profesor.CalcularMedia(alumnos.get(1)));
    }
    
}
