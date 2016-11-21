package ejercicio04;

import java.util.Scanner;

public class  Figura {

   protected Scanner tlc;
    protected int ancho;
    protected int alto;
    protected int area;
    protected int resultado;

    public Figura() {
        tlc = new Scanner(System.in);
    }

    public void cargar1() {
        System.out.print("Ingrese un valor de ancho: ");
        ancho = tlc.nextInt();
    }

    public void cargar2() {
        System.out.print("Ingrese un segundo valor de alto: ");
        alto = tlc.nextInt();
    }


    public void ImprimirDatos() {
        System.out.println(resultado);
    }

}
