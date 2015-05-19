/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Logica.Empleado;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebastian
 */
public class JIEmpleado extends javax.swing.JInternalFrame {
    
    Empleado ObjEmp;
    ArrayList<Empleado> ListEmpleado;

    public JIEmpleado(ArrayList <Empleado>  LEmpleado) {
        initComponents();
        this.ListEmpleado = LEmpleado;

    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtCodEmpleado = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setTitle("Crear Empleado");

        lblTitulo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        lblTitulo.setText("Elmpleados");

        lblNombre.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        lblNombre.setText("Nombre");

        lblID.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        lblID.setText("Identificacion");

        lblTel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        lblTel.setText("Codigo Empleado");

        btnCrear.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnCerrar.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCodEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addGap(89, 89, 89)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(btnCrear))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTel)
                    .addComponent(txtCodEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btnCerrar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
       
        if(txtID.getText().trim().length()== 0 ||
                txtNombre.getText().trim().length()== 0 ||
                txtCodEmpleado.getText().trim().length()== 0){
            
        JOptionPane.showMessageDialog(this, "Complete todo el formulario");
        }
        
        else{
        ObjEmp = new Empleado();
        this.ObjEmp.setNombre(this.txtNombre.getText());
        this.ObjEmp.setID(this.txtID.getText());
        this.ObjEmp.setCodigo(this.txtCodEmpleado.getText());
        this.ListEmpleado.add(ObjEmp);
        
        JOptionPane.showMessageDialog(this,"Los Datos del Empleado Son : \n" + ObjEmp.toString());
        JOptionPane.showMessageDialog(this,"Empleado Agregado");
        txtID.setText("");
        txtNombre.setText("");
        txtCodEmpleado.setText("");
                
        }
                JOptionPane.showMessageDialog(this,"Cantidad de empleados = " + this.ListEmpleado.size());
        
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCodEmpleado;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
