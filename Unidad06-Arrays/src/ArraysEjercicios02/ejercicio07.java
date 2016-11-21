/*
7. Escribe un programa que permita introducir un vector de 50 elementos 
numéricos e indique luego cual es el primer elemento cuyo contenido sea cero. 
Si no lo hubiera, debe indicarlo.
 */
package ArraysEjercicios02;


public class ejercicio07 {
    public static void main(String[] args) {
        int[] numeros = new int [50];
        
        for (int i = 0; i< numeros.length; i++){
            numeros[i] = (int) (Math.random() * 1000 + 0);
        }
        for (int i = 0; i < numeros.length; i++) { 
                System.out.println("Posición[" + i + "]: " + numeros[i]);
        }

        boolean cero = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 0 && cero == false) {
                System.out.println("Posicion[" + i + "]: " + numeros[i]);
                cero = true;
            }
        }
        if (cero == false) {
            System.out.println("No hay ningún cero");
        }
    }
    
}

