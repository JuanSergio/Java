/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.awt.Font;
import javax.swing.JOptionPane;

/**
 *
 * @author juansergio
 */
public class Encuesta extends javax.swing.JFrame {

    /**
     * Creates new form Encuesta
     */
    public Encuesta() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        radio1 = new javax.swing.JRadioButton();
        radio2 = new javax.swing.JRadioButton();
        radio3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        box1 = new javax.swing.JCheckBox();
        box2 = new javax.swing.JCheckBox();
        box3 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        boton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Elije un sistema operativo");

        radio1.setText("Windows");
        radio1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radio1ItemStateChanged(evt);
            }
        });

        radio2.setText("Linux");
        radio2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radio2ItemStateChanged(evt);
            }
        });

        radio3.setText("Mac");
        radio3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radio3ItemStateChanged(evt);
            }
        });
        radio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Elige tu especialidad");

        box1.setText("Programacion");

        box2.setText("Diseño grafico");
        box2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box2ActionPerformed(evt);
            }
        });

        box3.setText("Administracion");
        box3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Horas dedicadas al ordenador");

        jSlider1.setMaximum(10);

        boton.setText("Generar");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(box3)
                            .addComponent(box2)
                            .addComponent(box1)
                            .addComponent(jLabel2)
                            .addComponent(radio3)
                            .addComponent(radio2)
                            .addComponent(radio1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(boton)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(radio1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radio2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radio3)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(box1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(box2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(box3)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boton)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radio1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radio1ItemStateChanged
        
    }//GEN-LAST:event_radio1ItemStateChanged

    private void radio2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radio2ItemStateChanged
        
    }//GEN-LAST:event_radio2ItemStateChanged

    private void radio3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radio3ItemStateChanged
       
    }//GEN-LAST:event_radio3ItemStateChanged

    private void radio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio3ActionPerformed

    private void box2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box2ActionPerformed

    private void box3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box3ActionPerformed

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        JOptionPane.showMessageDialog(null,"Tu sistema operativo preferido es " + radio1 +" tus especialidades son " + 
                " y el numero de horas dedicadas al ordenador son " + "");
    }//GEN-LAST:event_botonActionPerformed

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
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Encuesta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton;
    private javax.swing.JCheckBox box1;
    private javax.swing.JCheckBox box2;
    private javax.swing.JCheckBox box3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JRadioButton radio3;
    // End of variables declaration//GEN-END:variables
}