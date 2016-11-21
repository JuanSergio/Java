
package clases;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Socios extends javax.swing.JInternalFrame {
    DefaultTableModel model;

    public Socios() {
        initComponents();
        limpiar();
//        bloquear();
        mostrardatos("");
    }

    //Limpiar datos de los formularios
    void limpiar(){
        jTextFieldCodigo.setText("");
        jTextFieldNombre.setText("");
        jTextFieldApellido.setText("");
        jTextFieldDNI.setText("");
        jTextFieldTelefono.setText("");
        jTextFieldEmail.setText("");
    }
    
    void limpiarBuscarSocio(){
        buscarSocio.setText("");
    }
    
    void mostrardatos(String valor){
        DefaultTableModel modelo = new DefaultTableModel();
        
        Conectar cc = new Conectar();
        Connection cn = cc.conexion();
        
        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("DNI");
        modelo.addColumn("Teléfono");
        modelo.addColumn("E-mail");
        tabla.setModel(modelo);
        
        
        String sql="";
        if(valor.equals("")){
            sql = "SELECT * FROM Socio";
        }
        else{
            sql = "SELECT * FROM Socio WHERE Apellido like '%"+valor+ "%'";
        }
        
        String []datos = new String [6];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                modelo.addRow(datos);
            }
            tabla.setModel(modelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR ===>>>\n" +ex.getMessage());
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDNI = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        botonInsertar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonModificar1 = new javax.swing.JButton();
        botonModificar2 = new javax.swing.JButton();
        botonModificar3 = new javax.swing.JButton();
        buscarSocio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        jTextFieldEmail = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Películas");
        setMaximumSize(new java.awt.Dimension(1000, 550));
        setMinimumSize(new java.awt.Dimension(1000, 550));
        setNormalBounds(new java.awt.Rectangle(0, 0, 1000, 550));
        setSize(new java.awt.Dimension(1000, 550));

        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Código");

        tabla.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tabla.setForeground(new java.awt.Color(0, 102, 153));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla.setBounds(new java.awt.Rectangle(0, 0, 475, 378));
        tabla.setMaximumSize(new java.awt.Dimension(475, 378));
        tabla.setMinimumSize(new java.awt.Dimension(475, 378));
        tabla.setPreferredSize(new java.awt.Dimension(475, 378));
        jScrollPane1.setViewportView(tabla);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("Nombre");

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("Apellido");

        jTextFieldApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellidoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("DNI");

        jTextFieldDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDNIActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("Buscar Socio por apellido");

        jTextFieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefonoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setText("E-mail");

        botonInsertar.setText("Insertar");
        botonInsertar.setPreferredSize(new java.awt.Dimension(90, 30));
        botonInsertar.setSize(new java.awt.Dimension(90, 30));
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        botonModificar.setText("Modificar");
        botonModificar.setPreferredSize(new java.awt.Dimension(90, 30));
        botonModificar.setSize(new java.awt.Dimension(90, 30));
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
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

        buscarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarSocioActionPerformed(evt);
            }
        });
        buscarSocio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarSocioKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 153));
        jLabel8.setText("Teléfono");

        botonBuscar.setText("Buscar");
        botonBuscar.setPreferredSize(new java.awt.Dimension(90, 30));
        botonBuscar.setSize(new java.awt.Dimension(90, 30));
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
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

        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
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
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(botonModificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(botonModificar2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonModificar3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buscarSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonModificar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(botonModificar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(botonModificar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoActionPerformed
        jTextFieldApellido.transferFocus();
    }//GEN-LAST:event_jTextFieldTelefonoActionPerformed

    private void jTextFieldDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDNIActionPerformed
        jTextFieldApellido.transferFocus();
    }//GEN-LAST:event_jTextFieldDNIActionPerformed

    private void jTextFieldApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellidoActionPerformed
        jTextFieldApellido.transferFocus();
    }//GEN-LAST:event_jTextFieldApellidoActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        jTextFieldApellido.requestFocus(true);
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        
            Conectar cc = new Conectar();
            Connection cn = cc.conexion();
            
            String nombre, apellido, dni, telefono, email;
            String sql="";
            nombre = jTextFieldNombre.getText();
            apellido = jTextFieldApellido.getText();
            dni = jTextFieldDNI.getText();
            telefono = jTextFieldTelefono.getText();
            email = jTextFieldEmail.getText();
            
            sql = "INSERT INTO Socio (Nombre, Apellido, DNI, Telefono, E_mail) VALUES (?, ?, ?, ?, ?)";
            
            try {
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, nombre);
                pst.setString(2, apellido);
                pst.setString(3, dni);
                pst.setString(4, telefono);
                pst.setString(5, email);
                
                int n = pst.executeUpdate();
                mostrardatos("");
                
                if(n > 0){
                    JOptionPane.showMessageDialog(null, "Registro guardado correctamente.");
                }else{
                    JOptionPane.showMessageDialog(null, "ERROR ===>>>\nEl registro no se ha guardado.");
                }
                
            }catch (SQLException ex) {
                Logger.getLogger(Peliculas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void botonModificar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificar2ActionPerformed
        int fila = tabla.getSelectedRow();
        if(fila >= 0){
            
            jTextFieldCodigo.setText(tabla.getValueAt(fila, 0).toString());
            jTextFieldNombre.setText(tabla.getValueAt(fila, 1).toString());
            jTextFieldApellido.setText(tabla.getValueAt(fila, 2).toString());
            jTextFieldDNI.setText(tabla.getValueAt(fila, 3).toString());
            jTextFieldTelefono.setText(tabla.getValueAt(fila, 4).toString());
            jTextFieldEmail.setText(tabla.getValueAt(fila, 5).toString());
            
        }else{
            JOptionPane.showMessageDialog(null,"No ha seleccionando fila");
        }
    }//GEN-LAST:event_botonModificar2ActionPerformed

    private void botonModificar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificar3ActionPerformed
        
        //Borrar fila
        Conectar cc = new Conectar();
        Connection cn = cc.conexion();
        
        int fila = tabla.getSelectedRow();
        String valor = tabla.getValueAt(fila, 0).toString();
        
        if(fila >= 0){
            try {
                PreparedStatement pps = cn.prepareStatement("DELETE FROM Socio WHERE IDSocio='"+valor+"'");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Socio eliminada Correctamente");
                mostrardatos("");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No ha seleccionando Socio para borrar.");
            }
        }
        
    }//GEN-LAST:event_botonModificar3ActionPerformed

    private void botonModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificar1ActionPerformed
        mostrardatos("");
        limpiarBuscarSocio();
    }//GEN-LAST:event_botonModificar1ActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        mostrardatos(buscarSocio.getText());
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void buscarSocioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarSocioKeyReleased

    }//GEN-LAST:event_buscarSocioKeyReleased

    private void buscarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarSocioActionPerformed
       

    }//GEN-LAST:event_buscarSocioActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        Conectar cc = new Conectar();
        Connection cn = cc.conexion();
        
        try {
            PreparedStatement pst = cn.prepareStatement("UPDATE Socio SET Nombre='"+jTextFieldNombre.getText()+"',Apellido='"+jTextFieldApellido.getText()+"'"
                    + ",DNI='"+jTextFieldDNI.getText()+"',Telefono='"+jTextFieldTelefono.getText()+"',E_mail='"+jTextFieldEmail.getText()+"'"
                    + "WHERE IDSocio='"+jTextFieldCodigo.getText()+"'");
            pst.executeUpdate();
            mostrardatos("");
            limpiar();
            limpiarBuscarSocio();
            JOptionPane.showMessageDialog(null, "Socio modificada correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR ===>>>\nNo se ha modificado el Socio.");
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonModificar1;
    private javax.swing.JButton botonModificar2;
    private javax.swing.JButton botonModificar3;
    private javax.swing.JTextField buscarSocio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
