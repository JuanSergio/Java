
import java.util.*;

public class PruebaMetodos1 {
    //Ejercicio1
    public static void mostrarArrayPantalla2(int[] m) {
       String mostrar = "";
       for (int i = 0; i < m.length; i++) {
           if (i != (m.length) - 1) {
               mostrar = mostrar + m[i] + " , ";
           } else {
                mostrar = mostrar + m[i];
           }
       }
       System.out.println(mostrar);
        System.out.println(Arrays.toString(m));
    }

    //Ejercicio2
    public static String obtenerArrayComoString(int[] m) {
        String mostrar = "";
        for (int i = 0; i < m.length; i++) {
            if (i != (m.length) - 1) {
                mostrar = mostrar + m[i] + " , ";
            } else {
                mostrar = mostrar + m[i];
            }
        }
        return mostrar;
    }

    //Ejercicio3
    public static int[] completarArray3(int[] m) {
        int n = 0;
        for (int i = 0; i < m.length; i++) {
            m[i] = n;
            n = n + 2;
        }
        return m;
    }

    //Ejercicio4
    public static int obtenerSumaArray(int[] m) {
        int suma = 0;
        for (int i = 0; i < m.length; i++) {
            suma = suma + m[i];
        }
        return suma;
    }

    //Ejercicio5
    public static int[] arrayPotencias2(int n) {
        int j = 0;
        int[] m = new int[n];
        for (int i = 0; i < m.length; i++) {
            m[i] = (int) Math.pow(2, j);
            j++;
        }
        return m;
    }

    //Ejercicio6
    public static String obtenerConcatArray(String[] m) {
        String concat = "";
        for (int i = 0; i < m.length; i++) {
            concat = concat + " " + m[i];
        }
        return concat;
    }

    //Ejercicio7
    public static int obtenerSumaLongCadArray(String[] m) {
        int log = 0;
        for (int i = 0; i < m.length; i++) {
            log = log + m[i].length();
        }
        return log;
    }

    //Ejercicio8
    public static int[] obtenerLongCadenas(String[] m) {
        int[] cadenas = new int[m.length];
        for (int i = 0; i < m.length; i++) {
            cadenas[i] = m[i].length();
        }
        return cadenas;
    }

    //Ejercicio9
    public static String[] obtenerArrCad5Vocales(String[] m) {
        int contador = 0, j = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i].contains("a") && m[i].contains("e") && m[i].contains("i") && m[i].contains("o") && m[i].contains("u")) {
                contador++;
            }
        }
        String[] cadenas = new String[contador];
        for (int i = 0; i < m.length; i++) {
            if (m[i].contains("a") && m[i].contains("e") && m[i].contains("i") && m[i].contains("o") && m[i].contains("u")) {
                cadenas[j] = m[i];
                j++;
            }
        }
        return cadenas;
    }

    //Ejercicio10
    public static void obtenerArrayOrdAlfab(String[] cad) {
        //Metodo 1
        String aux;
        for (int j = 0; j < cad.length; j++) {
            for (int k = j + 1; k < cad.length; k++) {
                if (cad[k].compareToIgnoreCase(cad[j]) < 0) {
                    aux = cad[j];
                    cad[j] = cad[k];
                    cad[k] = aux;
                }
            }
        }

        //Metodo 2

        Arrays.sort(cad, String.CASE_INSENSITIVE_ORDER); 
    }
    public static void main(String[] args) {

        int x = 5, y = 7;
        int[] m = new int[x];
        String[] n = new String[4];
        n[0] = "marcos";
        n[1] = "clara";
        n[2] = "pola";
        n[3] = "nic";
        String[] l = {"aeiou", "buho", "murcielago", "cartulina"};
        String[] s = {"valencia", "IRLANDA", "segorbe", "MADRID", "barcelona", "salamanca"};

        //Ejercicio11
        System.out.print("Ejercicio11\t");
        mostrarArrayPantalla2(m);
        //Ejercicio12
        System.out.print("\nEjercicio12\t");
        System.out.println(obtenerArrayComoString(m));
        //Ejercicio13
        System.out.print("\nEjercicio13\t");
        completarArray3(m);
        System.out.println(obtenerArrayComoString(m));
        //Ejercicio14
        System.out.print("\nEjercicio14\t");
        obtenerSumaArray(m);
        System.out.println(obtenerSumaArray(m));
        //Ejercicio15
        System.out.print("\nEjercicio15\t");
        System.out.println(obtenerArrayComoString(arrayPotencias2(y)));
        //Ejercicio16
        System.out.print("\nEjercicio16\t");
        System.out.println(obtenerConcatArray(n));
        //Ejercicio17
        System.out.print("\nEjercicio17\t");
        System.out.println(obtenerSumaLongCadArray(n));
        //Ejercicio18
        System.out.print("\nEjercicio18\t");
        obtenerLongCadenas(n);
        for (int i = 0; i < n.length; i++) {
            System.out.print(obtenerLongCadenas(n)[i] + "\n\t");
        }
        //Ejercicio19
        System.out.print("\nEjercicio19\t");
        obtenerArrCad5Vocales(l);
        for (int i = 0; i < obtenerArrCad5Vocales(l).length; i++) {
            System.out.print(obtenerArrCad5Vocales(l)[i] + "\n\t");
        }
        //Ejercicio20
        System.out.print("\nEjercicio20\t");
        obtenerArrayOrdAlfab(s);
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + "\n\t");
        }
        System.out.println();
    }
}
