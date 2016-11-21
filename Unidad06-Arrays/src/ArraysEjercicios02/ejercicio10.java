/*
 10. Escribe un programa que permita introducir un vector de veinte elementos, 
visualizar e indicar luego si hay o no algún elemento repetido. En ese caso 
indicar cuáles son y la posición que ocupan.
 */
package ArraysEjercicios02;

public class ejercicio10 {
  public static void main(String[] args) {

        int[] vector = new int[20];
        int[] posicion = new int[20];
        for (int i = 0; i < vector.length; i++) { 
            vector[i] = (int) (Math.random() * 25 + 0);
        }

        for (int i = 0; i < vector.length; i++) { 
            System.out.println("Número[" + i + "]: " + vector[i]);
        }

        int contador = 0, pos = 0;
        boolean noEstaRepetido = false;
        for (int i = 0; i < vector.length; i++) { 
            contador = 0;
            pos = 0;
            noEstaRepetido = false;
            for (int j = 0; j < vector.length; j++) { 
                if (vector[i] == vector[j]) { 
                    contador++;
                    posicion[pos] = j;
                    pos++;
                }
            }
            if (contador > 1) {
                for (int h = 0; h < i; h++) { 
                    if (vector[i] == vector[h]) {
                        noEstaRepetido = true;
                    }
                }

                if (noEstaRepetido == false) { 
                    System.out.println("El número: " + vector[i] + " está repetido: " + contador + " veces.");
                    System.out.print("Posición: ");
                    for (int k = 0; k < contador; k++) {
                        System.out.print("[" + posicion[k] + "]");
                    }
                }
            }

        }
    }
}

