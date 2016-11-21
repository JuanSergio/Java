/*
 Escribe un programa que defina dos variables enteras para describir las longitudes de los
 lados de un rectángulo. El programa debe calcular y escribir en la pantalla las longitudes de
 los lados, el perímetro y el área del rectángulo. (Supón que el rectángulo mide 15 cm de alto y
 25 cm de ancho.)
 */
package Ejercicios1Unidad02;


public class Ejercicio11 {
    public static void main(String[] args) {
        int alto;
        int ancho;
        int area;
        int perimetro;
        
        alto = 15;
        ancho = 25;
        perimetro = alto+ancho+alto+ancho;
        area = alto*ancho;
        
        System.out.println("El alto del rectángulo es de: " + alto + " cm");
        System.out.println("El ancho del rectángulo es de: " + ancho + " cm");
        System.out.println("El perímetro del rectángulo es: " + perimetro + " cm");
        System.out.println("El área del rectángulo es: " + area + " cm");
        
    }
}
