/*
 * The MIT License
 *
 * Copyright 2020 Monica Ranchos y Luis Pérez.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.mycompany.farmacia.simple.vistas;

import com.mycompany.farmacia.simple.controladores.Operaciones;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.Icon;
import javax.swing.table.DefaultTableModel;
import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;

/**
 *
 * @author Monica Ranchos y Luis Pérez
 */
public class FrmProveedores extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    private Connection conn;
    Operaciones ops;
    String dbColumnas = "pk_proveedores,nombre,direccion,telefono";
            
    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public void setColumns() {
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
    }

    /**
     * Creates new form FrmProveedores
     *
     * @param cn
     */
    public FrmProveedores(Connection cn) {
        this.conn = cn;
        this.ops = new Operaciones(conn);
        IconFontSwing.register(FontAwesome.getIconFont());
        Icon iconNew = IconFontSwing.buildIcon(FontAwesome.USER_PLUS, 15);
        Icon iconSave = IconFontSwing.buildIcon(FontAwesome.FLOPPY_O, 15);
        Icon iconSearch = IconFontSwing.buildIcon(FontAwesome.SEARCH, 15);
        Icon iconDelete = IconFontSwing.buildIcon(FontAwesome.USER_TIMES, 15);
        initComponents();
        btnNuevo.setIcon(iconNew);
        btnGuardar.setIcon(iconSave);
        btnBuscar.setIcon(iconSearch);
        btnEliminar.setIcon(iconDelete);
        tblProveedor.setModel(modelo);
        setColumns();
        ops.ConsultarTabla(modelo, "proveedores",dbColumnas);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProveedor = new javax.swing.JTable();
        lblBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Proveedores");
        setResizable(false);

        lblNombre.setText("Nombre");

        lblDireccion.setText("Direccion");

        lblTelefono.setText("Telefono");

        txtNombre.setEnabled(false);

        txtDireccion.setEnabled(false);
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        txtTelefono.setEnabled(false);
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tblProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProveedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProveedor);

        lblBuscar.setText("Buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo)
                    .addComponent(lblNombre)
                    .addComponent(lblDireccion)
                    .addComponent(lblTelefono)
                    .addComponent(lblBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar))
                    .addComponent(txtNombre)
                    .addComponent(txtDireccion)
                    .addComponent(txtTelefono)
                    .addComponent(txtBuscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDireccion))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnBuscar)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        habilitarTextos();
        if (btnGuardar.getText().equals("Editar")) {
            btnGuardar.setText("Guardar");
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void habilitarTextos() {
        txtNombre.setEnabled(true);
        txtNombre.grabFocus();
        txtDireccion.setEnabled(true);
        txtTelefono.setEnabled(true);
    }

    private void limpiarTextos() {
        txtNombre.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtBuscar.setText("");
    }
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling
        String query, nombre, direccion, telefono;
        nombre = txtNombre.getText();
        direccion = txtDireccion.getText();
        telefono = txtTelefono.getText();
        if (btnGuardar.getText().equals("Guardar")) {
            query = "INSERT INTO proveedores (nombre,direccion,telefono) values ('"
                    + nombre + "','" + direccion + "','" + telefono + "');";
            ops.Insertar(query, "Proveedor Agregado");
            limpiarTextos();
            modelo.setNumRows(0);
            ops.ConsultarTabla(modelo, "proveedores",dbColumnas);
            txtNombre.setEnabled(false);
            txtDireccion.setEnabled(false);
            txtTelefono.setEnabled(false);
            txtBuscar.setEnabled(true);
        }
        if (btnGuardar.getText().equals("Editar")) {
            Integer pk = Integer.parseInt(tblProveedor.getValueAt(tblProveedor.getSelectedRow(), 0).toString());
            query = "UPDATE proveedores set nombre='" + nombre + "',direccion='" + direccion + "',telefono='" + telefono + "' where pk_proveedores=" + pk + ";";
            System.out.println(query);
            ops.actualizarRegistro(query, "Proveedor Editado");
            limpiarTextos();
            modelo.setNumRows(0);
            ops.ConsultarTabla(modelo, "proveedores",dbColumnas);
            txtNombre.setEnabled(false);
            txtDireccion.setEnabled(false);
            txtTelefono.setEnabled(false);
            txtBuscar.setEnabled(true);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        String query = "delete from proveedores where nombre='" + txtNombre.getText() + "';";
        ops.actualizarRegistro(query, "Proveedor Eliminado");
        limpiarTextos();
        modelo.setNumRows(0);
        ops.ConsultarTabla(modelo, "proveedores",dbColumnas);
        txtNombre.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtBuscar.setEnabled(true);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String word = txtBuscar.getText();
        setColumns();
        ArrayList<String> columnas = new ArrayList<String>(Arrays.asList("ID","Nombre","Direccion","Telefono"));
        modelo = ops.Buscar(columnas, "proveedores", "nombre", word);
        tblProveedor.setModel(modelo);
        limpiarTextos();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tblProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProveedorMouseClicked
        // TODO add your handling code here:
        Integer fila_seleccionada = tblProveedor.getSelectedRow();
        txtNombre.setText(tblProveedor.getValueAt(fila_seleccionada, 1).toString());
        txtDireccion.setText(tblProveedor.getValueAt(fila_seleccionada, 2).toString());
        txtTelefono.setText(tblProveedor.getValueAt(fila_seleccionada, 3).toString());
        habilitarTextos();
        btnGuardar.setText("Editar");
    }//GEN-LAST:event_tblProveedorMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTable tblProveedor;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
