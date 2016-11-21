
package clases;

import java.awt.Color;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class Main extends javax.swing.JFrame {

    /** Creates new form frmprobar */
    public Main() {
        initComponents();        
        PanelEscritorio.setBorder(new ImagenFondo());
        PanelEscritorio.setBackground(Color.red);
        this.setExtendedState(Main.MAXIMIZED_HORIZ);
        this.setExtendedState(Main.MAXIMIZED_VERT);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jButton1 = new javax.swing.JButton();
        PanelEscritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuPeliculas = new javax.swing.JMenuItem();
        menuSocios = new javax.swing.JMenuItem();
        menuPrestamos = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana Principal");
        setBounds(new java.awt.Rectangle(0, 25, 1100, 700));
        setMinimumSize(new java.awt.Dimension(1100, 700));

        jButton1.setBackground(new java.awt.Color(40, 40, 40));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Conexión con base de datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        PanelEscritorio.setBackground(new java.awt.Color(41, 40, 30));
        PanelEscritorio.setMaximumSize(new java.awt.Dimension(1200, 600));
        PanelEscritorio.setMinimumSize(new java.awt.Dimension(856, 600));
        PanelEscritorio.setPreferredSize(new java.awt.Dimension(856, 600));
        PanelEscritorio.setSize(new java.awt.Dimension(856, 600));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(40, 40, 40));
        jLabel1.setText("Videoclub - Metrópolis -");

        jMenu1.setForeground(new java.awt.Color(40, 40, 40));
        jMenu1.setText("Menú Principal");
        jMenu1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N

        MenuPeliculas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MenuPeliculas.setText("Películas");
        MenuPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPeliculasActionPerformed(evt);
            }
        });
        jMenu1.add(MenuPeliculas);

        menuSocios.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        menuSocios.setText("Socios");
        menuSocios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSociosActionPerformed(evt);
            }
        });
        jMenu1.add(menuSocios);

        menuPrestamos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        menuPrestamos.setText("Prestamos");
        menuPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPrestamosActionPerformed(evt);
            }
        });
        jMenu1.add(menuPrestamos);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
    Conectar cc= new Conectar();
    Connection cn = cc.conexion();
    if(cn == null){   
        JOptionPane.showMessageDialog(null, "No conectado");
    }
    else{
        JOptionPane.showMessageDialog(null, "Conectado correctamente");
    }
}//GEN-LAST:event_jButton1ActionPerformed

    private void menuPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPrestamosActionPerformed
        Prestamos goPrestamos = new Prestamos();
        PanelEscritorio.add(goPrestamos);
        goPrestamos.show();
    }//GEN-LAST:event_menuPrestamosActionPerformed

    private void MenuPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPeliculasActionPerformed
        Peliculas goPeliculas = new Peliculas();
        PanelEscritorio.add(goPeliculas);
        goPeliculas.show();
    }//GEN-LAST:event_MenuPeliculasActionPerformed

    private void menuSociosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSociosActionPerformed
        Socios goSocios = new Socios();
        PanelEscritorio.add(goSocios);
        goSocios.show();
    }//GEN-LAST:event_menuSociosActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuPeliculas;
    public transient javax.swing.JDesktopPane PanelEscritorio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem menuPrestamos;
    private javax.swing.JMenuItem menuSocios;
    // End of variables declaration//GEN-END:variables
}
