/*
 * Escribe un programa que permita introducir un
vector de 20 elementos numéricos y visualizarlos de cuatro en cuatro
 */
package ejerciciovectores;
import java.util.*;
public class vectores3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int vector[]=new int[20];
        System.out.println("Introduzca 20 valores: ");
        for(int i=0; i<vector.length; i++){
            System.out.println("v["+(i)+"]=");
        vector[i]=reader.nextInt();
    }
        System.out.println("********Mostrar en grupos de cuatro*******");
        
        for(int i=0; i<vector.length; i++){
            System.out.printf(" %4d " , vector[i]);
            if ((i+1)%5==0)//
                System.out.println();
        } 
              
                      
}
}