/*
Primero crear un lienzo donde colocar todo.
 */
package Juego;
import javax.swing.JFrame;

public class Game {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mini Tenis");
        frame.setVisible(true);//hace la ventana visible
        frame.setSize(300, 300);//ancho y alto por defecto
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Al cerrar la ventanan se cierra el programa
    }
    
}
