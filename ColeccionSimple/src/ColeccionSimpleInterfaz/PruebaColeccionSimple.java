
package ColeccionSimpleInterfaz;


public class PruebaColeccionSimple {
    public static void rellenar(ColeccionSimple c){
        for(int i=1; i<=10;i++){
            c.añadir(i);
        }
    }
    
    public static void imprimiYVaciar(ColeccionSimple coleccion){
        while(!coleccion.estaVacia()){
            System.out.println(coleccion.extraer());
        }
    }
    public static void main(String[] args) {
        PilaArray p = new PilaArray(20);
        rellenar(p);
        System.out.println("La pila: "+p);
        imprimiYVaciar(p);
        System.out.println("La pila: "+p);
    }
}

