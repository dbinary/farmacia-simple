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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Monica Ranchos y Luis Pérez
 */
public class Facturas extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    private Connection conn;
    Operaciones ops;
    String cliente;
    public DefaultTableModel modeloFactura = new DefaultTableModel();
    //String producto;

    /**
     * Creates new form Facturas
     */
    public Facturas(Connection cn, String empleado) {
        initComponents();
        this.conn = cn;
        this.ops = new Operaciones(conn);
        agregarColumnas();
        lblEmpleado.setText(ops.getUsuario(empleado));
    }

    public Facturas() {
        //agregarColumnas();
    }

    private void agregarColumnas() {
        ArrayList<String> columnas = new ArrayList<>(Arrays.asList("Cantidad", "Producto", "Descripcion", "Precio"));
        for (Object columna : columnas) {
            modeloFactura.addColumn(columna);
        }
        jTable1.setModel(modeloFactura);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAtendio = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnClientes = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtCliente = new javax.swing.JTextField();
        lblEmpleado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNIT = new javax.swing.JTextField();
        btnFacturas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Facturacion");
        setResizable(false);

        lblAtendio.setText("Atendió:");

        jLabel3.setText("Cliente");

        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnClientes.setText("Agregar Cliente");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnProductos.setText("Agregar Producto");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtCliente.setEnabled(false);

        lblEmpleado.setText("Usuario");

        jLabel1.setText("NIT");

        txtNIT.setEnabled(false);

        btnFacturas.setText("Ver Facturas");
        btnFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNIT, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAtendio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblEmpleado))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnClientes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3))
                            .addComponent(btnFacturas))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAtendio)
                    .addComponent(lblEmpleado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtNIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClientes)
                    .addComponent(btnProductos)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFacturas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
        ArrayList<String> columnas = new ArrayList<>(Arrays.asList("ID", "Nombres", "NIT", "Telefono"));

        String query = "SELECT * FROM clientes;";
        modelo = ops.buscarGenerico(columnas, query);
        Generic frmClientes = new Generic(modelo, this, true, ops);
        frmClientes.setTitle("Clientes");
        frmClientes.setVisible(true);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        // TODO add your handling code here:
        ArrayList<String> columnas = new ArrayList<>(Arrays.asList("ID", "Producto", "Descripcion", "Precio"));

        String query = "SELECT pk_inventario,producto,descripcion,precio FROM inventario;";
        modelo = ops.buscarGenerico(columnas, query);
        Generic frmProductos = new Generic(modelo, this, false, ops);
        frmProductos.setTitle("Productos");
        frmProductos.setVisible(true);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String empleado, cliente, nit;
        empleado = lblEmpleado.getText();
        cliente = txtCliente.getText();
        nit = txtNIT.getText();
        String query1;
        
        String query0 = "INSERT INTO facturas (fk_empleado, fk_cliente) "
        + "values((select pk_empleado from empleados where nombres='"+empleado+"'),"
        + "(select pk_clientes from clientes where nombre='"+cliente+"'));";
        ops.Insertar(query0, "Factura",false);
        
        for (int i=0; i<jTable1.getRowCount();i++){
            String cantidad = jTable1.getValueAt(i, 0).toString();
            String prod = jTable1.getValueAt(i, 1).toString();
            //String descripcion = jTable1.getValueAt(i, 2).toString();
            String precio = jTable1.getValueAt(i, 3).toString();
            String fk_factura = ops.getCelda("SELECT pk_factura FROM facturas ORDER BY pk_factura DESC LIMIT 1;", "pk_factura");
            String fk_producto = ops.getCelda("SELECT pk_inventario from inventario where producto='"+prod+"';", "pk_inventario");
            
            query1 = "INSERT INTO detalle_factura (fk_producto,fk_factura,cantidad,precio)"
                    + "VALUES ("+Integer.parseInt(fk_producto)+","+Integer.parseInt(fk_factura)+","+Integer.parseInt(cantidad)
                    + ","+Double.parseDouble(precio)+")";
            System.out.println(query1);
            ops.Insertar(query1, "Detalle", false);
        }
        JOptionPane.showMessageDialog(rootPane, "Factura Ingresada Correctamente");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturasActionPerformed
        // TODO add your handling code here:
        ArrayList<String> columnas = new ArrayList<>(Arrays.asList("No.", "Cliente", "Producto","Cantidad", "Precio", "Total"));
        String query = "SELECT fac.pk_factura,cl.nombre,inv.producto,det.cantidad,"
                + "det.precio,(det.cantidad*det.precio) as total FROM facturas fac "
                + "INNER JOIN detalle_factura det ON fk_factura = pk_factura INNER JOIN "
                + "clientes cl ON fk_cliente=pk_clientes INNER JOIN inventario inv "
                + "ON fk_producto=pk_inventario ORDER BY fac.pk_factura;";
        modelo = ops.buscarGenerico(columnas, query);
        Generic frmFacturasAll = new Generic(modelo, this, true, ops);
        frmFacturasAll.setTitle("Facturas");
        frmFacturasAll.disableSeleccionar();
        frmFacturasAll.setVisible(true);
    }//GEN-LAST:event_btnFacturasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnFacturas;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAtendio;
    private javax.swing.JLabel lblEmpleado;
    public javax.swing.JTextField txtCliente;
    public javax.swing.JTextField txtNIT;
    // End of variables declaration//GEN-END:variables
    public ArrayList<String> producto = new ArrayList<>();
}
