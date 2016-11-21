
package Swing;
import javax.swing.*;
import java.awt.*;

public class Swing1 {
    public static void main(String[] args) {
        JFrame f= new JFrame();
        f.setTitle("SwingButton");
        f.setSize(300,150);//Medidas alto x ancho
        //Poner los compoenentes en orden consecutivo
        f.getContentPane().setLayout(new FlowLayout());
    }
 
}
