
package Ejercicio1;
import java.util.*;

public class matriz {
    //atributos
    private static Random rdn = new Random();
    private int [][] mat = new int [5][5];
    
    public matriz (){
        llenarNumeros();

    }
    //funciones
    public void llenarNumeros(){
    for(int i=0; i<mat.length; i++){
        //FILAS
        for(int j=0; j<mat[i].length; j++){
            //COLUMNAS
            mat [i][j]=
                    rdn.nextInt(5)+1;
            //System.out.println("["+i+"]["+j+"]="+
             //       mat[i][j]);
            
            }
        }
    }
}
    

