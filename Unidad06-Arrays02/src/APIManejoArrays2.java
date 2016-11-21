
import java.util.*;

import java.util.Arrays;

public class APIManejoArrays2 {

    public static void main(String[] args) {
        String temp;
        //Apartado a
        String[] arrStr = {"impresora", "peto", "mar", "orilla", "Orihuela"};
        System.out.println("a) " + Arrays.toString(arrStr));
        //Apartado b
        Arrays.sort(arrStr);
        System.out.println("b) " + Arrays.toString(arrStr));
        //Apartado c
        Arrays.sort(arrStr, String.CASE_INSENSITIVE_ORDER);
        System.out.println("c) " + Arrays.toString(arrStr));
    }
}
