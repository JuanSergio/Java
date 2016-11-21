/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mati
 */

public class Asignaturas {
  
   private String nombre, curso;
   private int codigo;
   
    public Asignaturas(String nom, int cod, String cur){
        nombre = nom;
        codigo = cod;
        curso = cur;
        
    }
    public String getNombre(){
        return nombre;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public String getCurso(){
        return curso;
    }
    
   public void imprimeAsignatura() {
       System.out.println("***********************");
       System.out.println("Nombre: " + nombre);
       System.out.println("Curso " + curso);
       System.out.println("Codigo " + codigo);
       System.out.println("***********************/n");
       
  
            
         
        
    }
    }
       
   
    

