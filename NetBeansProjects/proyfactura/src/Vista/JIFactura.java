/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Logica.Cliente;
import Logica.Electro;
import Logica.Empleado;
import Logica.Factura;
import Logica.Viveres;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sebastian
 */
public class JIFactura extends javax.swing.JInternalFrame {
    
    public DefaultTableModel TProd;
    public Factura ObjFact;
    public ArrayList<Electro> ListaE;
    public ArrayList<Viveres> ListaV;
    public ArrayList<Empleado> ListaEmp;
    public ArrayList<Cliente> LClte;
    public Cliente ObjCte;
    public Empleado ObjEmp;
    public Viveres ObjV;
    public Electro ObjE;
    

    /**
     * Creates new form JIFactura
     */
    public JIFactura(ArrayList<Electro> LE, ArrayList<Viveres> LV, ArrayList<Empleado> LEm, ArrayList<Cliente> LCt) {
        initComponents();
        this.ListaE = LE;
        this.ListaV = LV;
        this.ListaEmp = LEm;
        this.LClte = LCt;
        //this.txtCodFact.setText(FN);
        this.AsignarM();
        this.ObjFact = new Factura();
       }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblIVA = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        txtIVA = new javax.swing.JTextField();
        lblCodigoF = new javax.swing.JLabel();
        txtCodFact = new javax.swing.JTextField();
        lblTpago = new javax.swing.JLabel();
        cboxTPago = new javax.swing.JComboBox();
        lblProductosAgr = new javax.swing.JLabel();
        lblCuotas = new javax.swing.JLabel();
        cboxCuotas = new javax.swing.JComboBox();
        btnSalir = new javax.swing.JButton();
        JTAddEmpleado = new javax.swing.JTabbedPane();
        JPEmpl = new javax.swing.JPanel();
        txtIDE = new javax.swing.JTextField();
        lblID1 = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        txtNombreE = new javax.swing.JTextField();
        btnAddEmpl = new javax.swing.JButton();
        lblTitulo2 = new javax.swing.JLabel();
        lblCodE = new javax.swing.JLabel();
        txtCodE = new javax.swing.JTextField();
        JPClien = new javax.swing.JPanel();
        btnAddCliente = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        lblDir = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        lblTitulo1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblIVA1 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTProducto = new javax.swing.JTable();
        btnGenerar = new javax.swing.JButton();
        lblSubTotal = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createCompoundBorder());
        setTitle("Factura");

        lblTitulo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        lblTitulo.setText("Factura");

        lblIVA.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        lblIVA.setText("IVA");

        lblSubtotal.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        lblSubtotal.setText("SubTotal");

        txtSubTotal.setEditable(false);

        txtIVA.setEditable(false);

        lblCodigoF.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        lblCodigoF.setText("Codigo");

        txtCodFact.setEditable(false);

        lblTpago.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        lblTpago.setText("Tipo de Pago");

        cboxTPago.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Efectivo", "Tarjeta Debito", "Tarjeta Codensa" }));
        cboxTPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxTPagoActionPerformed(evt);
            }
        });

        lblProductosAgr.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        lblProductosAgr.setText("Productos Agregados");

        lblCuotas.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        lblCuotas.setText("Cuotas");

        cboxCuotas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "4", "6", "8", "10", "12", "14", "16" }));

        btnSalir.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        JTAddEmpleado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblID1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        lblID1.setText("Identificacion");

        lblNombre1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        lblNombre1.setText("Nombre");

        txtNombreE.setEnabled(false);

        btnAddEmpl.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        btnAddEmpl.setText("Agregar");
        btnAddEmpl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmplActionPerformed(evt);
            }
        });

        lblTitulo2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        lblTitulo2.setText("Empleado");

        lblCodE.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        lblCodE.setText("Codigo Empleado");

        txtCodE.setEnabled(false);

        javax.swing.GroupLayout JPEmplLayout = new javax.swing.GroupLayout(JPEmpl);
        JPEmpl.setLayout(JPEmplLayout);
        JPEmplLayout.setHorizontalGroup(
            JPEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPEmplLayout.createSequentialGroup()
                .addGroup(JPEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPEmplLayout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(lblTitulo2))
                    .addGroup(JPEmplLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(JPEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(JPEmplLayout.createSequentialGroup()
                                .addGroup(JPEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblID1)
                                    .addComponent(lblNombre1))
                                .addGap(29, 29, 29)
                                .addGroup(JPEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIDE, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(JPEmplLayout.createSequentialGroup()
                                .addComponent(lblCodE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCodE, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(56, 56, 56)
                        .addComponent(btnAddEmpl)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        JPEmplLayout.setVerticalGroup(
            JPEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPEmplLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblTitulo2)
                .addGap(28, 28, 28)
                .addGroup(JPEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPEmplLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnAddEmpl))
                    .addGroup(JPEmplLayout.createSequentialGroup()
                        .addGroup(JPEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblID1)
                            .addComponent(txtIDE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodE)
                            .addComponent(txtCodE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addGroup(JPEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre1)
                    .addComponent(txtNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        JTAddEmpleado.addTab("Empleado", JPEmpl);

        JPClien.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        btnAddCliente.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        btnAddCliente.setText("Agregar Cliente");
        btnAddCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddClienteActionPerformed(evt);
            }
        });

        lblID.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        lblID.setText("Identificacion");

        lblTel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        lblTel.setText("Telefono");

        lblDir.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        lblDir.setText("Direccion");

        lblTitulo1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        lblTitulo1.setText("Cliente");

        lblNombre.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        lblNombre.setText("Nombre");

        javax.swing.GroupLayout JPClienLayout = new javax.swing.GroupLayout(JPClien);
        JPClien.setLayout(JPClienLayout);
        JPClienLayout.setHorizontalGroup(
            JPClienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPClienLayout.createSequentialGroup()
                .addGroup(JPClienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPClienLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(JPClienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(JPClienLayout.createSequentialGroup()
                                .addComponent(lblDir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPClienLayout.createSequentialGroup()
                                .addComponent(lblTel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPClienLayout.createSequentialGroup()
                                .addComponent(lblID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPClienLayout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addGap(89, 89, 89)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnAddCliente))
                    .addGroup(JPClienLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(lblTitulo1)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        JPClienLayout.setVerticalGroup(
            JPClienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPClienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo1)
                .addGroup(JPClienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPClienLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btnAddCliente))
                    .addGroup(JPClienLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(JPClienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPClienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblID)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPClienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTel)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPClienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDir)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        JTAddEmpleado.addTab("Cliente", JPClien);

        lblIVA1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        lblIVA1.setText("Total a Pagar");

        txtTotal.setEditable(false);

        JTProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTProducto.setColumnSelectionAllowed(true);
        JTProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTProductoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTProductoKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(JTProducto);
        JTProducto.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        btnGenerar.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        lblSubTotal.setBackground(new java.awt.Color(255, 0, 51));
        lblSubTotal.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        lblSubTotal.setForeground(new java.awt.Color(51, 255, 102));
        lblSubTotal.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblIVA1)
                    .addComponent(lblIVA)
                    .addComponent(lblSubtotal))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIVA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSubTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(lblTitulo)
                        .addGap(71, 71, 71)
                        .addComponent(lblCodigoF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodFact, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTpago)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboxTPago, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCuotas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboxCuotas, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(lblProductosAgr))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(JTAddEmpleado)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSubTotal)
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(lblCodigoF)
                    .addComponent(txtCodFact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTAddEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTpago)
                    .addComponent(cboxTPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCuotas)
                    .addComponent(cboxCuotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(lblProductosAgr)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSubtotal)
                    .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerar)
                    .addComponent(btnSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIVA)
                    .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIVA1)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSubTotal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddClienteActionPerformed
        // TODO add your handling code here:
        
        if(txtID.getText().trim().length()== 0 ||
                txtNombre.getText().trim().length()== 0 ||
                txtID.getText().trim().length()== 0 ||
                txtDireccion.getText().trim().length()== 0 ||
                txtTelefono.getText().trim().length()== 0){
            
        JOptionPane.showMessageDialog(this, "Complete todo el formulario");
        }
        
        else{
            
        ObjCte = new Cliente();
        ObjCte.setID(this.txtID.getText());
        ObjCte.setNombre(this.txtNombre.getText());
        ObjCte.setTelefono(this.txtTelefono.getText());
        ObjCte.setDireccion(this.txtDireccion.getText());
        this.LClte.add(ObjCte);
        this.ObjFact.setObjC(ObjCte);

        JOptionPane.showMessageDialog(this,"Los Datos del Cliente Son : \n" + ObjCte.toString());
        JOptionPane.showMessageDialog(this,"Cliente Agregado");
        
        }
    }//GEN-LAST:event_btnAddClienteActionPerformed

    private void cboxTPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxTPagoActionPerformed
        // TODO add your handling code here:
        if(this.cboxTPago.getSelectedIndex() == 1 || this.cboxTPago.getSelectedIndex() == 2 ){
        this.cboxCuotas.setVisible(true);
        this.lblCuotas.setVisible(true);
        
        }
        else{
            this.cboxCuotas.setVisible(false);
            this.lblCuotas.setVisible(false);
            }
    }//GEN-LAST:event_cboxTPagoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAddEmplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmplActionPerformed
        // TODO add your handling code here:
        
        int x = 0;
        for(int i = 0 ; i < this.ListaEmp.size() ; i++){
            
            if(this.txtIDE.getText().equals(this.ListaEmp.get(i).getID())){
                JOptionPane.showMessageDialog(this,this.ListaEmp.get(i).toString());
                this.txtNombreE.setText(this.ListaEmp.get(i).getNombre());
                this.txtCodE.setText(this.ListaEmp.get(i).getCodigo());
                ObjEmp = new Empleado();
                ObjEmp.setNombre(this.txtNombreE.getText());
                ObjEmp.setID(this.txtIDE.getText());
                ObjEmp.setCodigo(this.txtCodE.getText());
                this.ObjFact.setObjE(ObjEmp);
                
            }
            else{
                x++;
                        }
            
        }
        if(x >= this.ListaEmp.size()){
            JOptionPane.showMessageDialog(this,"No se encontro Empleado con ese Identificacion");
            txtIDE.setText("");
            txtNombreE.setText("");
            txtCodE.setText("");
        }
       
    }//GEN-LAST:event_btnAddEmplActionPerformed

    
    private void JTProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTProductoKeyPressed
        // TODO add your handling code here:


     

    }//GEN-LAST:event_JTProductoKeyPressed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        // TODO add your handling code here:
        txtSubTotal.setText(Double.toString(this.ObjFact.SubTotal()));
        txtIVA.setText(Double.toString(this.ObjFact.Valor_IVA()));
        txtTotal.setText(Double.toString(this.ObjFact.Total_Pagar()));
        //this.ObjFact.setTipoPago(this.cboxTPago.getSelectedItem());
        JOptionPane.showMessageDialog(this, this.ObjFact.toString());
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void JTProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTProductoKeyReleased
        // TODO add your handling code here:
         int KC = evt.getKeyCode();
        if(KC == KeyEvent.VK_ENTER){
            
        this.AddToTable();
        }  
    }//GEN-LAST:event_JTProductoKeyReleased


    public void AddToTable(){
        
        int o = 0;
        int w = 0;
        int fila = JTProducto.getSelectedRow();
        for(int i = 0 ; i < this.ListaE.size() ; i++){
            
            try{
                                   
                if(ListaE.get(i).getCodigo().equals(String.valueOf(this.TProd.getValueAt(fila, 0)))){

                w = Integer.parseInt(JOptionPane.showInputDialog(this,ListaE.get(i).getNombre() + "\n" + "Cantidad = "));

                JTProducto.setValueAt(ListaE.get(i).getCodigo(), fila, 0);
                JTProducto.setValueAt(ListaE.get(i).getNombre(), fila, 1);
                JTProducto.setValueAt(w, fila, 2);
                JTProducto.setValueAt(ListaE.get(i).getValor_Unidad(), fila, 3);
                JTProducto.setValueAt((ListaE.get(i).getValor_Unidad()* w), fila, 4);
                this.ObjFact.getListaElectro().add(new Electro(ListaE.get(i).getCodigo(), ListaE.get(i).getNombre(), w, ListaE.get(i).getValor_Unidad()));
                int add = this.TProd.getColumnCount();
                this.TProd.addRow(new Object[add]);
                JTProducto.changeSelection(this.JTProducto.getRowCount() , 0, false, false);
                
                o = 1;
                }
                }
                    catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(this, "Introduzca un numero");
                }
            catch(ArrayIndexOutOfBoundsException e){
                
            }
                

            
            }
            
            for(int i = 0 ; i < this.ListaV.size() ; i++){
                try{
                if(ListaV.get(i).getCodigo().equals(String.valueOf(this.TProd.getValueAt(fila, 0)))){
                    
                    w = Integer.parseInt(JOptionPane.showInputDialog(this,ListaV.get(i).getNombre() + "\n" + "Cantidad = "));

                JTProducto.setValueAt(ListaV.get(i).getCodigo(), fila, 0);
                JTProducto.setValueAt(ListaV.get(i).getNombre(), fila, 1);
                JTProducto.setValueAt(w, fila, 2);
                JTProducto.setValueAt(ListaV.get(i).getValor_Unidad(), fila, 3);
                JTProducto.setValueAt((ListaV.get(i).getValor_Unidad()* w), fila, 4);
                this.ObjFact.getListaViveres().add(new Viveres(ListaV.get(i).getCodigo(), ListaV.get(i).getNombre(), w, ListaV.get(i).getValor_Unidad()));
                int add = this.TProd.getColumnCount();
                this.TProd.addRow(new Object[add]);
                JTProducto.changeSelection(this.JTProducto.getRowCount() , 0, false, false);
                o = 1;

                }
                }
                
                    catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(this, "Introduzca un numero");
                }
            
            }
            if (o == 0){
                    JOptionPane.showMessageDialog(this,"No se encontro producto con el ID " + this.TProd.getValueAt(fila, 0));
                    JTProducto.setValueAt("", fila, 0);
            }
            
            
    }
    private void AsignarM(){
        this.btnAddCliente.grabFocus();
        this.cboxCuotas.setVisible(false);
        this.lblCuotas.setVisible(false);
        
         TProd = new DefaultTableModel();
         String Titulos[] = {"Codigo_Producto","Nombre_Producto","Cantidad","Precio_Unidad","SubTotal"};
         this.TProd.setColumnIdentifiers(Titulos);
         this.JTProducto.setModel(TProd);
         int add = this.TProd.getColumnCount();
         this.TProd.addRow(new Object[add]);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPClien;
    private javax.swing.JPanel JPEmpl;
    private javax.swing.JTabbedPane JTAddEmpleado;
    private javax.swing.JTable JTProducto;
    private javax.swing.JButton btnAddCliente;
    private javax.swing.JButton btnAddEmpl;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cboxCuotas;
    private javax.swing.JComboBox cboxTPago;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCodE;
    private javax.swing.JLabel lblCodigoF;
    private javax.swing.JLabel lblCuotas;
    private javax.swing.JLabel lblDir;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblID1;
    private javax.swing.JLabel lblIVA;
    private javax.swing.JLabel lblIVA1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblProductosAgr;
    private javax.swing.JLabel lblSubTotal;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTpago;
    private javax.swing.JTextField txtCodE;
    private javax.swing.JTextField txtCodFact;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIDE;
    private javax.swing.JTextField txtIVA;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreE;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
