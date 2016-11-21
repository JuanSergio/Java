package BotonColor;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BotonesBackgroundColor {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel jpanel = new JPanel();
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jpanel.setBackground(Color.red);

        final JButton blueButton = new JButton("Blue");

        class Listener extends JPanel implements ActionListener {

            public void actionPerformed(ActionEvent event) {
                Color color = null;
                if (event.getSource() == blueButton) {
                    color = Color.BLUE;
                    blueButton.setBackground(color);
                    jpanel.setBackground(color);

                }
                setBackground(color);
                System.out.println(color);
                repaint();
            }

        }
        blueButton.addActionListener(new Listener());

        jpanel.add(blueButton);
        frame.add(jpanel);
        frame.setVisible(true);

    }

}
