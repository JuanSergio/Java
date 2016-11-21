
package Main;
import Encap.Personaje;

public class main {
    public static void main(String[] args) {
    Personaje cualquiera = new Personaje();
    
    System.out.println("El nombre del objeto es: "
                    +cualquiera.nombre + " su vida es: "
                    +cualquiera.consultarVida);
}
}