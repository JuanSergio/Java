/*
 9. Escribe un programa que permita introducir un vector de veinte elementos y 
visualizar el vector completo indicando posición y contenido del elemento mayor.
En caso de repetición prevalece el primero.
 */
package ArraysEjercicios02;


public class ejercicio09 {
    public static void main(String[] args) {
        int[] numero = new int[20];
        for (int i = 0; i < numero.length; i++) { 
            numero[i] = (int) (Math.random() * 25 + 0);
        }
        int maximo = Integer.MIN_VALUE, posicion = 0;
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Número[" + i + "]: " + numero[i]);
            if (numero[i] > maximo) {
                maximo = numero[i];
                posicion = i;
            }
        }

        System.out.println("MÁXIMO: Número[" + posicion + "]: " + maximo);
    }
}
