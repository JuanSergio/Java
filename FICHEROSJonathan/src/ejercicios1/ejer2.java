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
public class ejer2 {
    public static void main(String[] args) throws IOException {
        Scanner tcl =new Scanner (System.in);
    //creamos los ficheros    
      FileWriter fw3 = new FileWriter ("3ºfichero.txt");
        String dato1,dato2,dato3;       

        try{ 
    //creamos los lectores de escritura y lectura        
        FileReader fr1 = new FileReader ("1ºfichero.txt");
        FileReader fr2 = new FileReader ("2ºfichero.txt");
        BufferedReader br1 =new BufferedReader(fr1);
        BufferedReader br2 = new BufferedReader (fr2);
        BufferedWriter bw =new BufferedWriter (fw3);
       
        dato1=br1.readLine();
        while(dato1!=null){
//            fr2.read();
//            br2.read();
            
            dato2=br2.readLine();  
            
        while(dato2!=null){
           
            dato3=dato1+dato2;
            bw.write(dato3);
            bw.newLine();
            dato2=br2.readLine();                                      
        }
         dato1=br1.readLine();
         br2.close();
         fr2.close();
         fr2=new FileReader ("2ºfichero.txt");
         br2=new BufferedReader (fr2);
         
         
                 
        }
        fr1.close();
        fr2.close();
        br1.close();
        br2.close();
        bw.close();
        
    }catch (IOException e){
            System.out.println("Error problemas");
    }
        }
}


