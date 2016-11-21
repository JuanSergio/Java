
package ejercicio04;


public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        triangulo.cargar1();
        triangulo.cargar2();
        triangulo.getArea();
        triangulo.ImprimirDatos();
        System.out.println("El resultado del area es: ");
        triangulo.ImprimirDatos();
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.cargar1();
        rectangulo.cargar2();
        rectangulo.getArea();
        rectangulo.ImprimirDatos();
        System.out.println("El resultado del area es: ");
        rectangulo.ImprimirDatos();
    }
    
}
