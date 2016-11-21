
package ClasesObj;

public class Main {
    public static void main(String[] args) {
        
        //instanciamos un objeto de la clase Personas
        
        Personas objeto1 = new Personas();
         System.out.println("El nombre que contiene objeto1 es: " + objeto1.nombre + " el color de ojos es: "+ objeto1.colorOjos + 
                 " numero de piernas: " + objeto1.numeroPiernas + " numero de brazos: " + objeto1.numeroBrazos);
        
         Personas objeto2 = new Personas("Paula",(byte)12,(byte)2,(byte)2,"azul");
         System.out.println("El nombre que contiene objeto2 es: " + objeto2.nombre + " el color de ojos es: "+ objeto2.colorOjos + 
                 " numero de piernas: " + objeto2.numeroPiernas + " numero de brazos: " + objeto2.numeroBrazos);
         
         System.out.println("El saludo del objeto1 es: " + objeto1.Saludar());
         System.out.println("El saludo del objeto2 es: " + objeto2.Saludar());
         objeto2.cambiarNombre("Manuela");
         System.out.println("El saludo del objeto2 al cambiar nombre es: " + objeto2.Saludar());
         System.out.println("La vida del objeto2 antes de enfermar es: "+objeto2.vida);
         objeto2.enfermar(20);
         System.out.println("La vida del objeto2 despues de enfermar con 20 puntos es: " +objeto2.vida);
         objeto2.comida(15);
         System.out.println("La vida del objeto2 despues de comer : " +objeto2.vida);
         
    }
    
    
}
