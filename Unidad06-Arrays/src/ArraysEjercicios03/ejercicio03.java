/*
 3. Crea un vector V numérico de 50 elementos y otro P de 20 elementos. Genera 
luego M(50,20) de tal forma que M(I,J) es igual a V(I) * P(J)
 */
package ArraysEjercicios03;

import java.util.*;
public class ejercicio03 {
    public static void main(String[] args) {
        int fila;
        int columna;
        int [] v = new int [50];
        int [] p = new int [20];
        int [][] m = new int [50][20];
        Random x = new Random ();
        System.out.println("El vector v de 50 elemntos: ");
        for(fila = 0; fila < v.length; fila++){
            v[fila] = x.nextInt(9);
            System.out.println(v[fila] +" ");
                
            }
        System.out.println();
        System.out.println("El vector v de 20 elemntos: ");
        for(fila = 0; fila < v.length; fila++){
            v[fila] = x.nextInt(9);
            System.out.println(v[fila] +" ");
                
            }
        System.out.println();
        System.out.println("La matriz m de 50x20: ");
        for(fila=0; fila < m.length; fila++){
            for(columna = 0; columna < m.length; columna++){
                m[fila][columna] = v[fila]*p[columna];
                System.out.println(m[fila][columna] + "\t");
            }
            System.out.println();
        }
        }
    }
 

