/*
 Desarrollar una clase llamada Practica3 que en su método main:
 Cree un garaje.
 Cree 2 coches.
 El garaje irá cogiendo los coches y devolviéndolos, 
acumulando un importe aleatorio (Math.random()) de la avería tratada.
 Si la avería del coche es “aceite” incrementar en 10 los litro de aceite.
 Los coches entrarán al menos 2 veces en el garaje.
 Mostrar la información de los coches al final de main.
 */
package Practica03;


public class Practica3 {
    public static void main(String[] args) {
        Garaje garaje = new Garaje();
        Coche coche1 = new Coche("Honda", "Civic");
        Coche coche2 = new Coche("Ferrari", "Cp2");
        garaje.aceptarCoche(coche1, "aceite");
        garaje.aceptarCoche(coche2, "aceite");
        garaje.devolverCoche();
        
        coche1.getPrecioAverias();
        System.out.println("El coche: " + coche1.getMarca() + " " +coche1.getModelo()+ " se ha gastado: " +coche1.getPrecioAverias());
        System.out.println("El coche: " + coche2.getMarca() + " " +coche2.getModelo()+ " se ha gastado: " +coche2.getPrecioAverias());
    }
    
}
