
package CuentaCorriente;


public class Main {
    public static void main(String[] args) {
        
        CuentaCorriente c = new CuentaCorriente("Juan", "29216328A");
        c.numRoj=-200;
        c.saldo=(1000);
        c.IngresarDinero(1000);
        c.SacarDinero(300);
        
        System.out.println(c);
        
    }
    
}
