/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;


public class Profesor {
    
    public void ponerNotas(Alumno a)
    {
       a.getAsignatura1().setNota(Math.random()*10);
       a.getAsignatura2().setNota(Math.random()*10);
       a.getAsignatura3().setNota(Math.random()*10); 
        
    }
    
    
    
    public double CalcularMedia(Alumno a)
	{
        double media=a.getAsignaturaA().getNota()+a.getAsignaturaB().getNota()+a.getAsignaturaC().getNota();
        media=(media)/3;
        
        return media;
    }
    
    
}
