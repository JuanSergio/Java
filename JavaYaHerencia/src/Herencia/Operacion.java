/*
 Ahora plantearemos el primer problema utilizando herencia. Supongamos que 
 necesitamos implementar dos clases que llamaremos Suma y Resta. Cada clase tiene
 como atributo valor1, valor2 y resultado. Los métodos a definir son cargar1 
 (que inicializa el atributo valor1), carga2 (que inicializa el atributo valor2),
 operar (que en el caso de la clase "Suma" suma los dos atributos y en el caso de
 la clase "Resta" hace la diferencia entre valor1 y valor2, y otro método 
 mostrarResultado.
 Si analizamos ambas clases encontramos que muchos atributos y métodos son idénticos.
 En estos casos es bueno definir una clase padre que agrupe dichos atributos 
 y responsabilidades comunes.
 */
package Herencia;

import java.util.*;

public class Operacion {

    protected Scanner tlc;
    protected int valor1;
    protected int valor2;
    protected int resultado;

    public Operacion() {
        tlc = new Scanner(System.in);
    }

    public void cargar1() {
        System.out.print("Ingrese un valor: ");
        valor1 = tlc.nextInt();
    }

    public void cargar2() {
        System.out.print("Ingrese un segundo valor: ");
        valor2 = tlc.nextInt();
    }

    public void mostrarResultado() {
        System.out.println(resultado);
    }

}
