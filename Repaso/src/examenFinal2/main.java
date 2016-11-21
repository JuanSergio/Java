
package examenFinal2;

public class main {
    public static void main(String[] args) {
        item uno = new item ("item1");
        item dos = new item ("item2");
        item tres = new item ("item3");
        
        System.out.println("El valor de la id de " + uno.nombre + " " + uno.id);
        System.out.println("El valor de la id de " + dos.nombre + " " + dos.id);
        System.out.println("El valor de la id de " + tres.nombre + " " + tres.id);
    }
}
