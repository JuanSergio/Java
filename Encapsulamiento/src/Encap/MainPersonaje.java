
package Encap;

public class MainPersonaje {
    public static void main(String[] args) {
        Personaje cualquiera = new Personaje();
        System.out.println("Por defecto tenemos un personaje "+ "con un nombre "
                            + cualquiera.consultarNombre());
        cualquiera.cambiarNombre("Juan");
        System.out.println("El nuevo nombre será: "+cualquiera.consultarNombre());
        
        System.out.println("la vida de: "+cualquiera.consultarNombre()+" es " 
                            + cualquiera.consultarVida());
    }
}
