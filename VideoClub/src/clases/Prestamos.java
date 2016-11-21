
package clases;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Prestamos extends javax.swing.JInternalFrame {
    DefaultTableModel model;

    public Prestamos() {
        initComponents();
        limpiar();
        mostrardatos("");
    }

    //Limpiar datos de los formularios
    void limpiar(){
        jTextFieldCodigoPelicula.setText("");
        jTextFieldCodigoSocio.setText("");
        jTextFieldPrecio.setText("");
        jTextFieldFechaPrestamo.setText("");
    }
    
    
    //MOSTRAR DATOS
    //Tabla de Préstamos
    void mostrardatos(String valor){
        DefaultTableModel modelo = new DefaultTableModel();
        
        Conectar cc = new Conectar();
        Connection cn = cc.conexion();
        
        modelo.addColumn("Sócio");
        modelo.addColumn("Película");
        modelo.addColumn("Fecha de Prestamo");
        modelo.addColumn("Precio");
        tablaPrestamos.setModel(modelo);
        
        String sql="";
        if(valor.equals("")){
            sql = "SELECT * FROM Prestamo";
        }
        else{
            sql = "SELECT * FROM Prestamo WHERE Socio = '"+valor+"'";
        }
        
        String []datos = new String [4];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                modelo.addRow(datos);
            }
            
            tablaPrestamos.setModel(modelo);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR ===>>>\n" +ex.getMessage());
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jTextFieldCodigoPelicula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPrestamos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCodigoSocio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldFechaPrestamo = new javax.swing.JTextField();
        botonInsertar = new javax.swing.JButton();
        botonModificar1 = new javax.swing.JButton();
        botonModificar2 = new javax.swing.JButton();
        botonModificar3 = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Películas");
        setMaximumSize(new java.awt.Dimension(1000, 550));
        setMinimumSize(new java.awt.Dimension(1000, 550));
        setNormalBounds(new java.awt.Rectangle(0, 0, 1000, 550));
        setSize(new java.awt.Dimension(1000, 550));

        jTextFieldCodigoPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoPeliculaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Código Sócio");

        tablaPrestamos.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tablaPrestamos.setForeground(new java.awt.Color(0, 102, 153));
        tablaPrestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaPrestamos.setBounds(new java.awt.Rectangle(0, 0, 475, 378));
        tablaPrestamos.setMaximumSize(new java.awt.Dimension(475, 378));
        tablaPrestamos.setMinimumSize(new java.awt.Dimension(475, 378));
        tablaPrestamos.setPreferredSize(new java.awt.Dimension(475, 378));
        jScrollPane1.setViewportView(tablaPrestamos);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("Código Película");

        jTextFieldCodigoSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoSocioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("Precio");

        jTextFieldPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecioActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("Fecha Prestamo");

        jTextFieldFechaPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFechaPrestamoActionPerformed(evt);
            }
        });

        botonInsertar.setText("Insertar");
        botonInsertar.setPreferredSize(new java.awt.Dimension(90, 30));
        botonInsertar.setSize(new java.awt.Dimension(90, 30));
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        botonModificar1.setText("Mostrar Todos");
        botonModificar1.setPreferredSize(new java.awt.Dimension(90, 30));
        botonModificar1.setSize(new java.awt.Dimension(90, 30));
        botonModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificar1ActionPerformed(evt);
            }
        });

        botonModificar2.setText("Seleccionar");
        botonModificar2.setPreferredSize(new java.awt.Dimension(90, 30));
        botonModificar2.setSize(new java.awt.Dimension(90, 30));
        botonModificar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificar2ActionPerformed(evt);
            }
        });

        botonModificar3.setText("Borrar");
        botonModificar3.setPreferredSize(new java.awt.Dimension(90, 30));
        botonModificar3.setSize(new java.awt.Dimension(90, 30));
        botonModificar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificar3ActionPerformed(evt);
            }
        });

        botonLimpiar.setText("Limpiar");
        botonLimpiar.setPreferredSize(new java.awt.Dimension(90, 30));
        botonLimpiar.setSize(new java.awt.Dimension(90, 30));
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldCodigoPelicula, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldCodigoSocio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldFechaPrestamo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonModificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonModificar2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonModificar3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCodigoPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCodigoSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldFechaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonModificar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonModificar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonModificar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldFechaPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFechaPrestamoActionPerformed
        jTextFieldPrecio.transferFocus();
    }//GEN-LAST:event_jTextFieldFechaPrestamoActionPerformed

    private void jTextFieldPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecioActionPerformed
        jTextFieldPrecio.transferFocus();
    }//GEN-LAST:event_jTextFieldPrecioActionPerformed

    private void jTextFieldCodigoSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoSocioActionPerformed
        jTextFieldPrecio.requestFocus(true);
    }//GEN-LAST:event_jTextFieldCodigoSocioActionPerformed

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        
            Conectar cc = new Conectar();
            Connection cn = cc.conexion();
            
            String socio, pelicula, fecha, precio;
            String sql="";
            socio = jTextFieldCodigoSocio.getText();
            pelicula = jTextFieldCodigoSocio.getText();
            fecha = jTextFieldFechaPrestamo.getText();
            precio = jTextFieldPrecio.getText();
            
            sql = "INSERT INTO Prestamo (Socio, Pelicula, Fecha, Precio) VALUES (?, ?, ?, ?)";
            
            try {
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, socio);
                pst.setString(2, pelicula);
                pst.setString(3, fecha);
                pst.setString(4, precio);
                
                int n = pst.executeUpdate();
                mostrardatos("");
                
                if(n > 0){
                    JOptionPane.showMessageDialog(null, "Registro guardado correctamente.");
                }else{
                    JOptionPane.showMessageDialog(null, "ERROR ===>>>\nEl registro no se ha guardado.");
                }
                
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR ===>>>\nEl registro no se ha guardado.");
        }
        
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void botonModificar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificar2ActionPerformed
        int fila = tablaPrestamos.getSelectedRow();
        
        if(fila >= 0){
            jTextFieldCodigoPelicula.setText(tablaPrestamos.getValueAt(fila, 0).toString());
            jTextFieldCodigoSocio.setText(tablaPrestamos.getValueAt(fila, 1).toString());
            jTextFieldFechaPrestamo.setText(tablaPrestamos.getValueAt(fila, 2).toString());
            jTextFieldPrecio.setText(tablaPrestamos.getValueAt(fila, 3).toString()+ " €");
        }else{
            JOptionPane.showMessageDialog(null, "No ha seleccionando fila");
        }
        
    }//GEN-LAST:event_botonModificar2ActionPerformed

    private void botonModificar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificar3ActionPerformed
        
        //Borrar fila
        Conectar cc = new Conectar();
        Connection cn = cc.conexion();
        
        int fila = tablaPrestamos.getSelectedRow();
        String valor = tablaPrestamos.getValueAt(fila, 0).toString();
        
        if(fila >= 0){
            try {
                PreparedStatement pps = cn.prepareStatement("DELETE FROM Prestamo WHERE Fecha='"+valor+"'");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Película eliminada Correctamente");
                mostrardatos("");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No ha seleccionando Película para borrar.");
            }
        }
        
    }//GEN-LAST:event_botonModificar3ActionPerformed

    private void botonModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificar1ActionPerformed
        mostrardatos("");
    }//GEN-LAST:event_botonModificar1ActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void jTextFieldCodigoPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoPeliculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoPeliculaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonInsertar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonModificar1;
    private javax.swing.JButton botonModificar2;
    private javax.swing.JButton botonModificar3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldCodigoPelicula;
    private javax.swing.JTextField jTextFieldCodigoSocio;
    private javax.swing.JTextField jTextFieldFechaPrestamo;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTable tablaPrestamos;
    // End of variables declaration//GEN-END:variables
}
