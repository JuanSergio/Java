/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author juansergio
 */
public class JPanel1 extends JPanel {
    public final static int CIRCULO = 1, CUADRADO = 2;
private int figura;
// usar figura para dibujar un óvalo o rectángulo
public void paintComponent( Graphics g ){
super.paintComponent( g );
if ( figura == CIRCULO )
g.fillOval( 50, 10, 60, 60 );
else if ( figura == CUADRADO )
g.fillRect( 50, 10, 60, 60 );
}
// establecer valor de figura y repintar PanelPersonalizado
public void dibujar( int figuraADibujar )
{
figura = figuraADibujar;
repaint();//llama a paintComponent
}
}///:~

