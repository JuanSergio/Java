
import java.util.*;

public class PruebaMetodos2 {

    //Ejercicio11
    public static int[][] rellenarMatrizSecuencia2D(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = i + j * m.length;
            }
        }
        return m;
    }

    //Ejercicio12
    public static void mostrarMatrizID(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //Ejercicio13
    public static String matrizIntComoString(int[][] m) {
        String matriz = "";
        for (int i = 0; i < m.length; i++) {
            matriz = matriz + Arrays.toString(m[i]) + "\n";
        }
        return matriz;
    }

    //Ejercicio14
    public static int obtenerSumaElementosMatriz(int[][] m) {
        int suma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                suma = m[i][j] + suma;
            }
        }
        return suma;
    }


    //Ejercicio15
    public static void rellenarMatrizAsteriscos(int n) {
        char[][] piram = new char[n][(n * 2) - 1];
        for (int i = 0; i < piram.length; i++) {
            for (int j = 0; j < ((i * 2) + 1); j++) {
                piram[i][((piram[i].length / 2) - i) + j] = '*';
            }
        }

        for (int i = 0; i < piram.length; i++) {
            for (int j = 0; j < piram[i].length; j++) {
                System.out.print(piram[i][j]);
            }
            System.out.println();
        }
    }
    

    //Ejercicio16
    public static int[][] obtenerLaterales(int[][] m) {
        int[][] n = new int[4][];
        n[0] = new int[m[0].length];
        n[1] = new int[m.length];
        n[2] = new int[m.length];
        n[3] = new int[m[m.length - 1].length];
       //alternativa
       System.arraycopy(m[0], 0, n[0], 0, m[0].length);

        for (int i = 0; i < m[0].length; i++) {
            n[0][i] = m[0][i];
        }
        for (int i = 0; i < m.length; i++) {
            n[1][i] = m[i][0];
            n[2][i] = m[i][m[0].length - 1];
        }
        //alternativa2
        System.arraycopy(m[m.length - 1], 0, n[3], 0, m[m.length - 1].length);
        for (int i = 0; i < m[m.length - 1].length; i++) {
            n[3][i] = m[m.length - 1][i];
        }

        return n;
       
    }
    public static void main(String[] args) {

        int[][] m = new int[5][5];


        //Ejercicio11
        System.out.println("Ejercicio10\tEfectuado");
        rellenarMatrizSecuencia2D(m);
        //Ejercicio12
        System.out.println("\nEjercicio11\n");
        mostrarMatrizID(m);
        //Ejercicio13
        System.out.println("\nEjercicio12\n");
        System.out.println(matrizIntComoString(m));
         //Ejercicio14
        System.out.println("\nEjercicio13\n");
        System.out.println("la suma es: " + obtenerSumaElementosMatriz(m));
        //Ejercicio15
        System.out.println("Ejercicio14\n");
        rellenarMatrizAsteriscos(7);
        //Ejercicio16
        System.out.println("\nEjercicio15\n");
        obtenerLaterales(m);
        for (int i = 0; i < obtenerLaterales(m).length; i++) {
            for (int j = 0; j < obtenerLaterales(m)[i].length; j++) {
                System.out.print(obtenerLaterales(m)[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
