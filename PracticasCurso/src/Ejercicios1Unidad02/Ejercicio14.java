/*
 Dadas las siguientes expresiones aritmético-lógicas calcula cuál es el resultado de
 evaluarlas.
 a) 25>20 && 13>5
 b) 10 + 4 < 15 -3 || 2 * 5 + 1 > 14 – 2 * 2
 c) 4 * 2 <= 8 || 2 * 2 < 5 && 4 > 3 + 1
 d) 10 <= 2 * 5 && 3<4 || ! (8>7) && 3*2 <= 4*2-1
 */
package Ejercicios1Unidad02;

public class Ejercicio14 {
    public static void main(String[] args) {
        
        boolean resultadoA;
        boolean resultadoB;
        boolean resultadoC;
        boolean resultadoD;
        
        resultadoA = 25>20 && 13>5;
        resultadoB = 10 + 4 < 15 -3 || 2 * 5 + 1 > 14 - 2 * 2;
        resultadoC = 4 * 2 <= 8 || 2 * 2 < 5 && 4 > 3 + 1;
        resultadoD = 10 <= 2 * 5 && 3<4 || ! (8>7) && 3*2 <= 4*2-1;
        
        System.out.println(resultadoA);
        System.out.println(resultadoB);
        System.out.println(resultadoC);
        System.out.println(resultadoD);
    }
}
