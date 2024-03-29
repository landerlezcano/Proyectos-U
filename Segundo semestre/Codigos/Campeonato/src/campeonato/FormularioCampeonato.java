/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package campeonato;

import java.util.ArrayList;
import logica.Entrenador;
import logica.Equipo;
import logica.Jugador;
import logica.Medico;
import logica.Persona;

/**
 *
 * @author estudiantes
 */
public class FormularioCampeonato extends java.applet.Applet {

   ArrayList <Equipo> listaEquipos = new ArrayList();
   Equipo objAuxiliarEquipo;
   ArrayList <Persona> listaIntegrantesdeEquipo = new ArrayList();
    /**
     * Initializes the applet FormularioCampeontato
     */
    public void init() {
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    initComponents();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        this.setSize(500, 400); // formulario acrtual
        this.jdlFormularioinsertar.setSize(500, 600); // jdialog 
        
    }

    /**
     * This method is called from within the init() method to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdlFormularioinsertar = new javax.swing.JDialog();
        etqtitulo1 = new javax.swing.JLabel();
        etqNombre = new javax.swing.JLabel();
        etqtitulo2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lstIntegrantes = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPosicion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNumeroJugador = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNoTarjeta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtLiga = new javax.swing.JTextField();
        btninserarIntegrante = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        etqNombreEquipo = new javax.swing.JLabel();
        btnInsertar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNombreEquipo = new javax.swing.JTextField();
        lblNombreequipo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jdlFormularioinsertar.setTitle("InsFormulario para ertar Equipos");
        jdlFormularioinsertar.setName("JdlInsertarEquipos"); // NOI18N
        jdlFormularioinsertar.setUndecorated(true);

        etqtitulo1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        etqtitulo1.setText("Informacion de Equipos");

        etqNombre.setText("Nombre");

        etqtitulo2.setText("Digite Informacion de Cada Jugador ");

        lstIntegrantes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jugador", "Entrenador", "Medico" }));
        lstIntegrantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lstIntegrantesActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo de Integrante");

        jLabel3.setText("Identificacion");

        jLabel4.setText("Posicion en el Equipo");

        jLabel5.setText("No de jugador");

        jLabel6.setText("No tajeta Profesional");

        txtNoTarjeta.setEnabled(false);

        jLabel7.setText("Nombre de liga");

        txtLiga.setEnabled(false);

        btninserarIntegrante.setText("Insertar Integrante");
        btninserarIntegrante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninserarIntegranteActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        etqNombreEquipo.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        etqNombreEquipo.setText("jLabel10");

        javax.swing.GroupLayout jdlFormularioinsertarLayout = new javax.swing.GroupLayout(jdlFormularioinsertar.getContentPane());
        jdlFormularioinsertar.getContentPane().setLayout(jdlFormularioinsertarLayout);
        jdlFormularioinsertarLayout.setHorizontalGroup(
            jdlFormularioinsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdlFormularioinsertarLayout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addGroup(jdlFormularioinsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdlFormularioinsertarLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(etqtitulo2))
                    .addGroup(jdlFormularioinsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jdlFormularioinsertarLayout.createSequentialGroup()
                            .addComponent(btninserarIntegrante)
                            .addGap(53, 53, 53)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jdlFormularioinsertarLayout.createSequentialGroup()
                            .addGroup(jdlFormularioinsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(etqNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jdlFormularioinsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lstIntegrantes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtPosicion)
                                .addComponent(txtNoTarjeta)
                                .addComponent(txtLiga, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNumeroJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(84, 84, 84))
            .addGroup(jdlFormularioinsertarLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jdlFormularioinsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jdlFormularioinsertarLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(etqNombreEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etqtitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jdlFormularioinsertarLayout.setVerticalGroup(
            jdlFormularioinsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdlFormularioinsertarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqtitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etqNombreEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(etqtitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jdlFormularioinsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lstIntegrantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addGroup(jdlFormularioinsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jdlFormularioinsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jdlFormularioinsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jdlFormularioinsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jdlFormularioinsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNoTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jdlFormularioinsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtLiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jdlFormularioinsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btninserarIntegrante)
                    .addComponent(btnSalir))
                .addGap(41, 41, 41))
        );

        btnInsertar.setText("Insertar Datos de  Equipo");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Campeontato de MicroFuttbol Multinivel");

        txtNombreEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEquipoActionPerformed(evt);
            }
        });

        lblNombreequipo.setText("Nombre Equipo");

        jLabel9.setText("Inicie con Informacion de cada Equipo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                        .addGap(32, 32, 32))))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblNombreequipo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreequipo)
                    .addComponent(txtNombreEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInsertar)
                .addContainerGap(306, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed

   this.objAuxiliarEquipo = new Equipo();// inicializo el objeto equipo 
   this.objAuxiliarEquipo.setNombre(this.txtNombreEquipo.getText());
   
   this.etqNombreEquipo.setText( this.objAuxiliarEquipo.getNombre());
   this.jdlFormularioinsertar.show();
   

   
   
   
   
// TODO add your handling code here:
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void lstIntegrantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lstIntegrantesActionPerformed
        // TODO add your handling code here:
        if (this.lstIntegrantes.getSelectedIndex() == 1)
                            {this.txtNumeroJugador.setEnabled(false);
                             this.txtPosicion.setEnabled(false);
                             this.txtNoTarjeta.setEnabled(false);
                             this.txtLiga.setEnabled(true);
                            }
        else if (this.lstIntegrantes.getSelectedIndex() == 2)
                            {
                             this.txtNumeroJugador.setEnabled(false);
                             this.txtPosicion.setEnabled(false); 
                             this.txtLiga.setEnabled(false);
                                this.txtNoTarjeta.setEnabled(true);  
                            }
        else 
                          {
                             this.txtNumeroJugador.setEnabled(true);
                             this.txtPosicion.setEnabled(true);
                             this.txtNoTarjeta.setEnabled(false);
                             this.txtLiga.setEnabled(false);
                        
                        
                        }
        
        
        
        
        
    }//GEN-LAST:event_lstIntegrantesActionPerformed

    private void btninserarIntegranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninserarIntegranteActionPerformed
        // TODO add your handling code here:
        
        if (this.lstIntegrantes.getSelectedIndex()==0)
         { Jugador objJugador = new Jugador (this.txtPosicion.getText(),
                                Long.parseLong(this.txtNumeroJugador.getText()),
                                this.txtNombre.getText(),
                                Long.parseLong(this.txtId.getText()) ); 
            this.listaIntegrantesdeEquipo.add(objJugador);
          }
        
        else if(this.lstIntegrantes.getSelectedIndex() ==1 )
        {  Entrenador objEntrenador = new Entrenador ();
            
           this.listaIntegrantesdeEquipo.add(objEntrenador); 
        }
        else 
        {   Medico objMedico = new Medico();
            this.listaIntegrantesdeEquipo.add(objMedico); 
        
        }
     
        
        
        
    }//GEN-LAST:event_btninserarIntegranteActionPerformed

    private void txtNombreEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEquipoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.jdlFormularioinsertar.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btninserarIntegrante;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JLabel etqNombreEquipo;
    private javax.swing.JLabel etqtitulo1;
    private javax.swing.JLabel etqtitulo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JDialog jdlFormularioinsertar;
    private javax.swing.JLabel lblNombreequipo;
    private javax.swing.JComboBox lstIntegrantes;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLiga;
    private javax.swing.JTextField txtNoTarjeta;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreEquipo;
    private javax.swing.JTextField txtNumeroJugador;
    private javax.swing.JTextField txtPosicion;
    // End of variables declaration//GEN-END:variables
}
