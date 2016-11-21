/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SWING;
/**
 *
 * @author mati
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class JFRAME  extends JPanel implements ActionListener{
    public static void main(String[] args){
        
        //creamos la ventana
        JFrame ventana =new JFrame("ventana");        
        ventana.setVisible(true);
        ventana.setSize(400, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //cambiamos el color de fondo del panel
        ventana.getContentPane().setBackground(Color.blue);
        
        //creamos el del panel layout
        ventana.setLayout(null);
               
        //creamos el boton en el panel
        JButton boton=new JButton();
        boton.setBounds(300, 300, 50, 50);
        ventana.add(boton);       
        
        //creamos el flowLayout en el panel
        FlowLayout fl=new FlowLayout(FlowLayout.LEFT,5,10);
        ventana.getContentPane().setLayout(fl);
        for (int i=0; i<4; i++){
            JButton boton2= new JButton("Boton"+(i+1));
            boton2.setPreferredSize(new Dimension(100,25));
            ventana.add(boton2);
            
            
        }      
    }     
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
            
       }
}


