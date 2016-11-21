/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;


/**
 *
 * @author mati
 */
public class Alumno {
    private Asignatura a = new Asignatura();
    private Asignatura b = new Asignatura();
    private Asignatura c = new Asignatura();
    
	
    public Asignatura getAsignaturaA()
    {
        return a;
    }
    
    public Asignatura getAsignaturaB()
    {
        return b;
    }
    
    public Asignatura getAsignaturaC()
    {
        return c;
    }
    public Asignatura setAsignaturaA(Asignatura a)
    {
        this.a = a;
    }
    
    public Asignatura setAsignaturaB(Asignatura b)
	{
        this.b = b;
    }
    
    public Asignatura setAsignaturaC(Asignatura c)
	{
        this.c = c;
    }
}
