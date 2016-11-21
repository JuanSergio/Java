
package PanelDeConductor;

import PiezasInternas.Motor;

public class Arranque {
    public static void main(String[] args) {
        Motor miMotor = new Motor(10);
        int velocidadDelCoche = miMotor.get_velocidadDeRotacionDeMotor();
        
        System.out.println("La velocidad del coche será: " + velocidadDelCoche + " km/h");
        
    }
}
