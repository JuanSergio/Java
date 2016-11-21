
import java.util.*;

public class APIManejoArrays1 {

    public static void main(String[] args) {
        //Apartado a
        int[] arrInt1 = new int[30];
        Arrays.fill(arrInt1, 0, 10, 0);
        Arrays.fill(arrInt1, 10, 20, 1);
        Arrays.fill(arrInt1, 20, 30, 0);
        System.out.println("a) " + Arrays.toString(arrInt1));
        //Apartado b
        char[] arrChar = new char[6];
        Arrays.fill(arrChar, 0, arrChar.length / 2, 'a');
        Arrays.fill(arrChar, arrChar.length / 2, arrChar.length, 'b');
        System.out.println("b) " + Arrays.toString(arrChar));
        //Apartado c
        int[] arrInt2 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println("c.1) " + Arrays.toString(arrInt2));
        Arrays.sort(arrInt2);
        System.out.println("c.2) " + Arrays.toString(arrInt2));
    }
}
