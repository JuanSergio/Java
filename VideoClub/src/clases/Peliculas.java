
package clases;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Peliculas extends javax.swing.JInternalFrame {
    DefaultTableModel model;

    public Peliculas() {
        initComponents();
        limpiar();
//        bloquear();
        mostrardatos("");
    }

    //Limpiar datos de los formularios
    void limpiar(){
        jTextFieldCodigo.setText("");
        jTextFieldTitulo.setText("");
        jTextFieldDirector.setText("");
        jTextFieldGenero.setText("");
        jTextFieldFecha.setText("");
        jTextAreaArgumento.setText("");
    }
    
    void limpiarBuscarPelicula(){
        buscarPelicula.setText("");
    }
    
    void mostrardatos(String valor){
        DefaultTableModel modelo = new DefaultTableModel();
        
        Conectar cc = new Conectar();
        Connection cn = cc.conexion();
        
        modelo.addColumn("Código");
        modelo.addColumn("Titulo");
        modelo.addColumn("Director");
        modelo.addColumn("Género");
        modelo.addColumn("Fecha");
        modelo.addColumn("Argumento");
        tabla.setModel(modelo);
        
        
        String sql="";
        if(valor.equals("")){
            sql = "SELECT * FROM Pelicula";
        }
        else{
//            sql = "SELECT * FROM Pelicula WHERE Titulo='"+valor+"'";
            sql = "SELECT * FROM Pelicula WHERE Titulo like '%"+valor+ "%'";
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
        jTextFieldTitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldDirector = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldGenero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldFecha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        botonInsertar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaArgumento = new javax.swing.JTextArea();
        botonModificar1 = new javax.swing.JButton();
        botonModificar2 = new javax.swing.JButton();
        botonModificar3 = new javax.swing.JButton();
        buscarPelicula = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JButton();
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
        jLabel2.setText("Título");

        jTextFieldTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTituloActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("Director");

        jTextFieldDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDirectorActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("Género");

        jTextFieldGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGeneroActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("Buscar Película por título");

        jTextFieldFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFechaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setText("Argumento");

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

        jTextAreaArgumento.setColumns(20);
        jTextAreaArgumento.setRows(5);
        jTextAreaArgumento.setBounds(new java.awt.Rectangle(0, 0, 240, 140));
        jTextAreaArgumento.setMaximumSize(new java.awt.Dimension(240, 140));
        jTextAreaArgumento.setMinimumSize(new java.awt.Dimension(240, 140));
        jTextAreaArgumento.setPreferredSize(new java.awt.Dimension(240, 140));
        jScrollPane2.setViewportView(jTextAreaArgumento);

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

        buscarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPeliculaActionPerformed(evt);
            }
        });
        buscarPelicula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarPeliculaKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 153));
        jLabel8.setText("Fecha");

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
                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldDirector, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldGenero, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldFecha, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
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
                        .addComponent(buscarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                            .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane2))))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buscarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFechaActionPerformed
        jTextFieldDirector.transferFocus();
    }//GEN-LAST:event_jTextFieldFechaActionPerformed

    private void jTextFieldGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGeneroActionPerformed
        jTextFieldDirector.transferFocus();
    }//GEN-LAST:event_jTextFieldGeneroActionPerformed

    private void jTextFieldDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDirectorActionPerformed
        jTextFieldDirector.transferFocus();
    }//GEN-LAST:event_jTextFieldDirectorActionPerformed

    private void jTextFieldTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTituloActionPerformed
        jTextFieldDirector.requestFocus(true);
    }//GEN-LAST:event_jTextFieldTituloActionPerformed

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        
            Conectar cc = new Conectar();
            Connection cn = cc.conexion();
            
            String titulo, director, genero, fecha, argumento;
            String sql="";
            titulo = jTextFieldTitulo.getText();
            director = jTextFieldDirector.getText();
            genero = jTextFieldGenero.getText();
            fecha = jTextFieldFecha.getText();
            argumento = jTextAreaArgumento.getText();
            
            sql = "INSERT INTO Pelicula (Titulo, Director, Genero, Fecha_Alta, Argumento) VALUES (?, ?, ?, ?, ?)";
            
            try {
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, titulo);
                pst.setString(2, director);
                pst.setString(3, genero);
                pst.setString(4, fecha);
                pst.setString(5, argumento);
                
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
            jTextFieldTitulo.setText(tabla.getValueAt(fila, 1).toString());
            jTextFieldDirector.setText(tabla.getValueAt(fila, 2).toString());
            jTextFieldGenero.setText(tabla.getValueAt(fila, 3).toString());
            jTextFieldFecha.setText(tabla.getValueAt(fila, 4).toString());
            jTextAreaArgumento.setText(tabla.getValueAt(fila, 5).toString());
            
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
                PreparedStatement pps = cn.prepareStatement("DELETE FROM Pelicula WHERE IDPelicula='"+valor+"'");
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
        limpiarBuscarPelicula();
    }//GEN-LAST:event_botonModificar1ActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        mostrardatos(buscarPelicula.getText());
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void buscarPeliculaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarPeliculaKeyReleased

    }//GEN-LAST:event_buscarPeliculaKeyReleased

    private void buscarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPeliculaActionPerformed
       

    }//GEN-LAST:event_buscarPeliculaActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        Conectar cc = new Conectar();
        Connection cn = cc.conexion();
        
        try {
            PreparedStatement pst = cn.prepareStatement("UPDATE Pelicula SET Titulo='"+jTextFieldTitulo.getText()+"',Director='"+jTextFieldDirector.getText()+"'"
                    + ",Genero='"+jTextFieldGenero.getText()+"',Fecha_Alta='"+jTextFieldFecha.getText()+"',Argumento='"+jTextAreaArgumento.getText()+"'"
                    + "WHERE IDPelicula='"+jTextFieldCodigo.getText()+"'");
            pst.executeUpdate();
            mostrardatos("");
            limpiar();
            JOptionPane.showMessageDialog(null, "Película modificada correctamente");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR ===>>>\nNo se ha modificado la Película.");
        }

    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonModificar1;
    private javax.swing.JButton botonModificar2;
    private javax.swing.JButton botonModificar3;
    private javax.swing.JTextField buscarPelicula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaArgumento;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldDirector;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldGenero;
    private javax.swing.JTextField jTextFieldTitulo;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
