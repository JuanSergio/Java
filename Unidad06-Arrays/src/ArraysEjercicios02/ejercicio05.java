/*
 5. Escribe un programa que permita leer una secuencia de 50 números, guardarlos
en un vector. Calcular e imprimir la suma de aquellos cuyo contenido sea par.
 */
package ArraysEjercicios02;


public class ejercicio05 {
    public static void main(String[] args) {
        int[] numeros = new int [50];
        
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = (int) (Math.random() * 10000 + 0);
        }
        int suma = 0;
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Numero[" + i + "] " + numeros[i]);
            if(numeros[i] %2 ==0){
                suma = suma + numeros[i];
            }
        }
        System.out.println("EL resusltado de los numeros pares es : " + suma);
    }
}
