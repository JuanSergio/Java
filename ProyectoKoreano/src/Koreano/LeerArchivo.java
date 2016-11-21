package Koreano;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {

/*
    public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while ((cadena = b.readLine()) != null) {
            System.out.println(cadena);
        }
        b.close();
    }
*/

    public static void main(String[] args) throws IOException {
        String char1 = "\uC138\uACC4\uB97C \uD5A5\uD55C \uB300\uD654";
        System.out.println(char1);
    }

}
