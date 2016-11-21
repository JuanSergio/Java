
package Herencia;

public class Main {
    public static void main(String[] args) {
        Persona anonimo = new Persona(23, 1.89f, false, false);
        System.out.println(anonimo.toString());
        PersonaConocida pepito = new PersonaConocida(12, 1.60f, "pepito");
        System.out.println(pepito.toString());
        PersonaConocidaConHermanos carlos = new PersonaConocidaConHermanos( 1.60f, 12, "carlos");
        System.out.println(carlos.toString());

    }
    
}
