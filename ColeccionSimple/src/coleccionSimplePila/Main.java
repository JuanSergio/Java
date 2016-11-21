
package coleccionSimplePila;

public class Main {
    
    public static void rellenar(ColeccionSimple c){
        for(int i=1; i<=10; i++){
           c.añadir(i);
        }
    }
    public static void imprimirYVaciar(ColeccionSimple c){
        while(!c.estaVacia()){
            System.out.println(c.extraer());
        }
    }
    public static void main(String[] args) {
        Pila p = new Pila();
        rellenar(p);
        System.out.println("Datos de la pila: ");
        imprimirYVaciar(p);
        
        Cola c = new Cola();
        rellenar(c);
        System.out.println("Datos de cola: ");
        imprimirYVaciar(c);
        
        p.añadir("Primero");
        p.añadir(new Boolean(true));
        p.añadir(7.5);
        p.añadir(c);
        System.out.println("Datos de la pila con objetos de distinto tipo");
        imprimirYVaciar(p);
    }
}
