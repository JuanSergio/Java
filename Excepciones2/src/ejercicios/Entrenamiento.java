/*
8. Escribe una clase, de nombre Entrenamiento, en cuyo método main() se creará 
un objeto Corredor con una energía de 50 unidades. Se hará que el corredor corra
hasta que se agote 3 veces. La primera vez que se agote, su energía se recargará
con 30 unidades. La segunda vez que se agote su energía se recargará con 10 
unidades. Cuando el corredor se agote por tercera vez se dará el entrenamiento 
por concluido
 */
package ejercicios;


public class Entrenamiento {
    public static void main(String[] args) {
        Corredor corredor1 = new Corredor(50);
        corredor1.correr();
        corredor1.correr();
        corredor1.correr();
        corredor1.correr();
        corredor1.correr();
        corredor1.correr();//esta cansado
        corredor1.recargarEnergia(30);
        corredor1.correr();
        corredor1.correr();
        corredor1.correr();
        corredor1.correr();//esta cansado
        corredor1.recargarEnergia(10);
        corredor1.correr();
        corredor1.correr();//esta cansado
    }
}
