/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios1;
/**
 *
 * @author mati
 */
import java.io.*;
import java.util.Scanner;
public class ejer4 {
    public static void main(String[] args) throws IOException {
        
        int [] dni=new int [8];
        String letras =new String ("TRWAGMYFPDXBNJZSQVHLCKE");
        
        
        Scanner tcl =new Scanner (System.in);
        FileWriter fw1 = new FileWriter ("dni.txt");
        FileWriter fw2 =new FileWriter ("nif.txt");
        BufferedWriter bw1 = new BufferedWriter (fw1);
        BufferedWriter bw2 = new BufferedWriter (fw2);
        
        System.out.println("Introduce nº entero inicial");
        int numeroinicial=tcl.nextInt();               
        System.out.println("Introduce nº entero final");
        int numerofinal=tcl.nextInt();       
        String contador;
        int cero=numerofinal-numeroinicial;
        for (int i=0; i<cero-1;i++){
            dni[i]=0;
            contador=Integer.toString(dni[i]);
            bw1.write(contador);
        }

        
        for (int i=numeroinicial; i<=numerofinal;i++){
            contador=Integer.toString(i);
            bw1.write(contador);           
            
        }  
        if (bw1!=null){
            bw1.close();
        }

        char letra_nif = letras.charAt(cero%23);
        bw2.write(letra_nif);
        bw2.close();      
    }
}
