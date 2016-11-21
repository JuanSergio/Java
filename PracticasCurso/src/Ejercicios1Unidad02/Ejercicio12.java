/*
 Escribe un programa para calcular el área y el volumen de un cilindro. Para ello declara
 una constante que guarda el valor de PI. Declara, también, variables para el diámetro y la
 altura del cilindro. Supón para el ejemplo que el cilindro tiene un diámetro de 15,5cm y una
 altura de 42,4cm.
 */
package Ejercicios1Unidad02;


public class Ejercicio12 {
    public static void main(String[] args) {
        
        double diámetro;
        double altura;
        double área;
        double volumen;
        double radio;
        
        diámetro = 15.5;
        altura = 42.4;
        radio = diámetro/2;
        área = (2 * Math.PI * radio * altura) + (2 * Math.PI * (radio * radio));
        volumen = Math.PI * (radio * radio) * altura;
        
        System.out.println("El radio del cilindro es: " + radio + " cm");
        System.out.println("El área del cilindro es: " + área + " cm");
        System.out.println(" El volumen del cilindro es: " + volumen + " cm");
    }
}
