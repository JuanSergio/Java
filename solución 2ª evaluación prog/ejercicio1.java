/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;
import java.util.*;

public class ejercicio1
 {
    private static ArrayList <Integer> lista1 = new ArrayList();
    private static ArrayList <Integer> lista2 = new ArrayList();
    private static ArrayList <Integer> lista3 = new ArrayList();
    private static ArrayList <Integer> lista4 = new ArrayList();
    
    private static int aleatorio=0;
    
    public static void rellenarListas()
    {
        for (int i=0; i<15;i++)
	{
            aleatorio=1+(int)(Math.random()*9);
            lista1.add(aleatorio);
        }
        for (int i=0; i<20;i++)
	{
            aleatorio=1+(int)(Math.random()*9);
            lista2.add(aleatorio);
        }
    }
    
    public static void imprimirListas(ArrayList l)
    {
        for (int i=0;i<l.size();i++)
            System.out.print(l.get(i)+" ");

        System.out.println();
    }
    
    public static void Lista3()
    {
  
        boolean repe = false;
       
        for(int i=0; i<lista1.size();i++)
	{
            for(int j=0;(j<lista2.size()) && (!repe);j++)   	
                if(lista1.get(i)==lista2.get(j))
		{		
                    repe=true;
		    //break;
		}
                
            if(!repe)
			
                lista3.add(lista1.get(i));
              
            repe = false;
        }
    }
    
    public static void Lista4()
    {
        for(int i=0; i<lista1.size();i++)
		
            if (lista1.get(i)%2==0)
			
                lista4.add(lista1.get(i));
            
        
        for(int i=0; i<lista2.size();i++)
		
            if (lista2.get(i)%2!=0)
			
                lista4.add(lista2.get(i));
            
        
    }
    
    public static void main (String [] args)
	{
        rellenarListas();
		
        System.out.print("Lista 1: ");       
        imprimirListas(lista1);
		
        System.out.print("Lista 2: ");   
        imprimirListas(lista2);
		
        Lista3();
		
        System.out.print("Lista 3: ");
        imprimirListas(lista3);
		
        Lista4();
		
        System.out.print("Lista 4: ");
        imprimirListas(lista4);
        
    }
}





       
     
    
     
    
     
 
