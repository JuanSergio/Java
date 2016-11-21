/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

/**
 *
 * @author juansergio
 */
public class JMenuBarTest2 extends javax.swing.JFrame {

    /**
     * Creates new form JMenuBarTest2
     */
    public JMenuBarTest2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupColores = new javax.swing.ButtonGroup();
        buttonGroupLetras = new javax.swing.ButtonGroup();
        buttonGroupFuente = new javax.swing.ButtonGroup();
        pantallaEtiqueta = new javax.swing.JLabel();
        barra = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        elementoAcercaDe = new javax.swing.JMenuItem();
        elementoSalir = new javax.swing.JMenuItem();
        menuFormato = new javax.swing.JMenu();
        menuColor = new javax.swing.JMenu();
        botonNegro = new javax.swing.JRadioButtonMenuItem();
        botonAzul = new javax.swing.JRadioButtonMenuItem();
        botonRojo = new javax.swing.JRadioButtonMenuItem();
        botonVerde = new javax.swing.JRadioButtonMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuLetras = new javax.swing.JMenu();
        botonSerif = new javax.swing.JRadioButtonMenuItem();
        botonMonospaced = new javax.swing.JRadioButtonMenuItem();
        botonSansSerif = new javax.swing.JRadioButtonMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        botonNegrita = new javax.swing.JCheckBoxMenuItem();
        botonCursiva = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JMenuBarTest2");

        pantallaEtiqueta.setFont(new java.awt.Font("Serif", 0, 72)); // NOI18N
        pantallaEtiqueta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pantallaEtiqueta.setText("Texto de ejemplo");
        getContentPane().add(pantallaEtiqueta, java.awt.BorderLayout.CENTER);

        menuArchivo.setMnemonic('A');
        menuArchivo.setText("Archivo");

        elementoAcercaDe.setMnemonic('C');
        elementoAcercaDe.setText("Acerca de");
        elementoAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elementoAcercaDeActionPerformed(evt);
            }
        });
        menuArchivo.add(elementoAcercaDe);

        elementoSalir.setMnemonic('S');
        elementoSalir.setText("Salir");
        elementoSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elementoSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(elementoSalir);

        barra.add(menuArchivo);

        menuFormato.setMnemonic('F');
        menuFormato.setText("Formato");

        menuColor.setText("Color");

        buttonGroupColores.add(botonNegro);
        botonNegro.setText("Negro");
        botonNegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNegroActionPerformed(evt);
            }
        });
        menuColor.add(botonNegro);

        buttonGroupColores.add(botonAzul);
        botonAzul.setText("Azul");
        botonAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAzulActionPerformed(evt);
            }
        });
        menuColor.add(botonAzul);

        buttonGroupColores.add(botonRojo);
        botonRojo.setText("Rojo");
        botonRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRojoActionPerformed(evt);
            }
        });
        menuColor.add(botonRojo);

        buttonGroupColores.add(botonVerde);
        botonVerde.setText("Verde");
        botonVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerdeActionPerformed(evt);
            }
        });
        menuColor.add(botonVerde);

        menuFormato.add(menuColor);
        menuFormato.add(jSeparator1);

        menuLetras.setText("Tipo de letra");

        buttonGroupLetras.add(botonSerif);
        botonSerif.setSelected(true);
        botonSerif.setText("Serif");
        botonSerif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSerifMouseClicked(evt);
            }
        });
        botonSerif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSerifActionPerformed(evt);
            }
        });
        menuLetras.add(botonSerif);

        buttonGroupLetras.add(botonMonospaced);
        botonMonospaced.setText("Monospaced");
        botonMonospaced.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMonospacedActionPerformed(evt);
            }
        });
        menuLetras.add(botonMonospaced);

        buttonGroupLetras.add(botonSansSerif);
        botonSansSerif.setText("SansSerif");
        botonSansSerif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSansSerifActionPerformed(evt);
            }
        });
        menuLetras.add(botonSansSerif);
        menuLetras.add(jSeparator2);

        buttonGroupFuente.add(botonNegrita);
        botonNegrita.setSelected(true);
        botonNegrita.setText("Negrita");
        botonNegrita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonNegritaMouseClicked(evt);
            }
        });
        botonNegrita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNegritaActionPerformed(evt);
            }
        });
        menuLetras.add(botonNegrita);

        buttonGroupFuente.add(botonCursiva);
        botonCursiva.setText("Cursiva");
        botonCursiva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCursivaMouseClicked(evt);
            }
        });
        botonCursiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCursivaActionPerformed(evt);
            }
        });
        menuLetras.add(botonCursiva);

        menuFormato.add(menuLetras);

        barra.add(menuFormato);

        setJMenuBar(barra);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void elementoAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elementoAcercaDeActionPerformed
       JOptionPane.showMessageDialog(this, "Éste es un ejemplo\ndel uso de menús","Acerca de..." , JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_elementoAcercaDeActionPerformed

    private void elementoSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elementoSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_elementoSalirActionPerformed

    private void botonNegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNegroActionPerformed
       pantallaEtiqueta.setForeground(Color.BLACK);
    }//GEN-LAST:event_botonNegroActionPerformed

    private void botonAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAzulActionPerformed
        pantallaEtiqueta.setForeground(Color.BLUE);
    }//GEN-LAST:event_botonAzulActionPerformed

    private void botonRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRojoActionPerformed
        pantallaEtiqueta.setForeground(Color.RED);
    }//GEN-LAST:event_botonRojoActionPerformed

    private void botonVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerdeActionPerformed
        pantallaEtiqueta.setForeground(Color.GREEN);
    }//GEN-LAST:event_botonVerdeActionPerformed

    private void botonSerifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSerifActionPerformed
        pantallaEtiqueta.setFont(new Font("Serif",Font.PLAIN,72));
    }//GEN-LAST:event_botonSerifActionPerformed

    private void botonMonospacedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMonospacedActionPerformed
        pantallaEtiqueta.setFont(new Font("Monospaced",Font.PLAIN,72));
    }//GEN-LAST:event_botonMonospacedActionPerformed

    private void botonSansSerifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSansSerifActionPerformed
        pantallaEtiqueta.setFont(new Font("SansSerif",Font.PLAIN,72));
    }//GEN-LAST:event_botonSansSerifActionPerformed

    private void botonCursivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCursivaActionPerformed
         if (botonSansSerif.isSelected()) 
        {
            pantallaEtiqueta.setFont(new Font("SansSerif", Font.ITALIC, 72));            
        } 
        else if(botonMonospaced.isSelected())
        {
            pantallaEtiqueta.setFont(new Font("Monospaced", Font.ITALIC, 72));
        }
        else
        {
            pantallaEtiqueta.setFont(new Font("Serif", Font.ITALIC, 72));  
        }
    }//GEN-LAST:event_botonCursivaActionPerformed

    private void botonNegritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNegritaActionPerformed
        if (botonSansSerif.isSelected()) 
        {
            pantallaEtiqueta.setFont(new Font("SansSerif", Font.BOLD, 72));            
        } 
        else if(botonMonospaced.isSelected())
        {
            pantallaEtiqueta.setFont(new Font("Monospaced", Font.BOLD, 72));
        }
        else
        {
            pantallaEtiqueta.setFont(new Font("Serif", Font.BOLD, 72));  
        }
    }//GEN-LAST:event_botonNegritaActionPerformed

    private void botonNegritaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonNegritaMouseClicked
        botonNegrita.setSelected(false);
    }//GEN-LAST:event_botonNegritaMouseClicked

    private void botonCursivaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCursivaMouseClicked
        botonCursiva.setSelected(false);
    }//GEN-LAST:event_botonCursivaMouseClicked

    private void botonSerifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSerifMouseClicked

    }//GEN-LAST:event_botonSerifMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JMenuBarTest2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JMenuBarTest2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JMenuBarTest2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JMenuBarTest2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JMenuBarTest2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barra;
    private javax.swing.JRadioButtonMenuItem botonAzul;
    private javax.swing.JCheckBoxMenuItem botonCursiva;
    private javax.swing.JRadioButtonMenuItem botonMonospaced;
    private javax.swing.JCheckBoxMenuItem botonNegrita;
    private javax.swing.JRadioButtonMenuItem botonNegro;
    private javax.swing.JRadioButtonMenuItem botonRojo;
    private javax.swing.JRadioButtonMenuItem botonSansSerif;
    private javax.swing.JRadioButtonMenuItem botonSerif;
    private javax.swing.JRadioButtonMenuItem botonVerde;
    private javax.swing.ButtonGroup buttonGroupColores;
    private javax.swing.ButtonGroup buttonGroupFuente;
    private javax.swing.ButtonGroup buttonGroupLetras;
    private javax.swing.JMenuItem elementoAcercaDe;
    private javax.swing.JMenuItem elementoSalir;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuColor;
    private javax.swing.JMenu menuFormato;
    private javax.swing.JMenu menuLetras;
    private javax.swing.JLabel pantallaEtiqueta;
    // End of variables declaration//GEN-END:variables
}