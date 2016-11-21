/*
 * Escribe un programa que permita introducir un vector de diez
elementos alfanuméricos y luego visualizar los que ocupen la posición
par.
Repetir para los de posición impar.
 */
package ejerciciovectores;
import java.util.*;

public class vectores2 {
    public static void main(String[] args) {
        int vector[]=new int[]{1,2,3,4,5,6,7,8,9,10};
        for(int i=0; i<vector.length; i++){
            if(i%2==0){
                System.out.println("Vector["+i+"]="+vector[i]);
              
            }
            else{
                
            }
        }
    }
}
