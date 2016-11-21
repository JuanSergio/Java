/*
Dadas las siguientes expresiones aritméticas, calcula cuál es el resultado de evaluarlas.
Supón que las variables a y b que aparecen son del tipo int y a tiene el valor de 2 y b tiene el
valor de 4.
a) –a + 5 % b – a * a
b) 5 + 3 % 7 * b * a – b % a
c) (a+1) * (b + 1) – b / a
 */
package Ejercicios1Unidad02;


public class Ejercicio10 {
    public static void main(String[] args) {
        int a;
        int b;
        double resultadoA;
        double resultadoB;
        double resultadoC;
        
        a = 2;
        b = 4;
        resultadoA = -a + 5 % b - a * a;
        resultadoB = 5 + 3 % 7 * b * a - b % a;
        resultadoC = (a+1) * (b + 1) - b / a;
        
        System.out.println(resultadoA);
        System.out.println(resultadoB);
        System.out.println(resultadoC);
        
    }
}
