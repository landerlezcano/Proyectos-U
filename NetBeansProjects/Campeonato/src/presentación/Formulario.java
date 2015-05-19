/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentación;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lógica.Entrenador;
import lógica.Equipo;
import lógica.Jugador;
import lógica.Medico;
import lógica.Persona;

/**
 *
 * @author Yair Lopez Poveda <ylopezp@correo.udistrital.edu.co>
 */
public class Formulario extends javax.swing.JFrame {

    ArrayList<Equipo> listaEquipos;
    Jugador asasd = new Jugador();
    DefaultTableModel obj1;
    
    public Formulario() {
        initComponents();
        listaEquipos = new ArrayList();
        asasd.getNombre();
        obj1 = new DefaultTableModel();
        obj1.setColumnIdentifiers(new Object[]{"Nombre","ID","Profesión"});
        jTable1.setModel(obj1);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_añadir = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de equipos - Campeonato");

        btn_añadir.setText("Añadir equipo");
        btn_añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_añadirActionPerformed(evt);
            }
        });

        btn_modificar.setText("Modificar equipo");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar equipo");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(btn_añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        if(!listaEquipos.isEmpty()){
            int aux = 0;
            int numEquipo = 0;
            String[] nombresEquipos = new String[listaEquipos.size()];
            for(int i=0;i<listaEquipos.size();i++){
                Equipo foo = listaEquipos.get(i);
                nombresEquipos[i]=foo.getNombre();
            }
            numEquipo = JOptionPane.showOptionDialog(rootPane, "Elija el equipo a modificar:", "Modificar equipo", JOptionPane.DEFAULT_OPTION, JOptionPane.
                    QUESTION_MESSAGE, null, nombresEquipos, null);        
            if(numEquipo>=0 && numEquipo<listaEquipos.size()){
                System.out.print("aaa");
                Equipo equipoSelec = listaEquipos.get(numEquipo);
                int opc = JOptionPane.showOptionDialog(rootPane, "¿Que desea hacer?", "Modificar equipo", JOptionPane.DEFAULT_OPTION, 
                        JOptionPane.QUESTION_MESSAGE, null, new String[] {"Añadir miembro","Eliminar Miembro"}, null);
                if(opc==0){
                    try {
                        aux = JOptionPane.showOptionDialog(rootPane, "Ingrese un miembro del equipo:", "Ingresar miembro",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                                null, new String[]{"Jugador", "Entrenador", "Médico"}, null);
                    } catch (Exception e) {
                        aux = -1;
                    }
                    if (aux >= 0 && aux <= 2) {
                        ArrayList listaIntegrantes = equipoSelec.getListaIntegrantes();
                        if (aux == 0) {
                            Jugador objAux = new Jugador();
                            objAux.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del jugador:"));
                            objAux.setId(Integer.parseInt(JOptionPane.showInputDialog("Ingrese ID del jugador:")));
                            objAux.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del jugador en el equipo:")));
                            objAux.setPosición(JOptionPane.showInputDialog("Ingrese la posición del jugador:"));
                            listaIntegrantes.add(objAux);
                        } else if (aux == 1) {
                            Entrenador objAux = new Entrenador();
                            objAux.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del entrenador:"));
                            objAux.setId(Integer.parseInt(JOptionPane.showInputDialog("Ingrese ID del entrenador:")));
                            objAux.setLiga(JOptionPane.showInputDialog("Ingrese la liga a la cual pertenece el entrenador del equipo:"));
                            listaIntegrantes.add(objAux);
                        } else {
                            Medico objAux = new Medico();
                            objAux.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del médico:"));
                            objAux.setId(Integer.parseInt(JOptionPane.showInputDialog("Ingrese ID del médico:")));
                            objAux.setNumeroTarjeta(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de tarjeta "
                                    + "profesional del médico en el equipo:")));
                            listaIntegrantes.add(objAux);
                        }
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Asegúrese de seleccionar una opción válida.", "¡Error!", aux);
                    }
                }else if (opc == 1){
                    if(!equipoSelec.getListaIntegrantes().isEmpty()){
                        String lista = "Eliga el jugador a eliminar del equipo:\n\n";
                        String[] nombreInt = equipoSelec.listaIntegrantes();
                        ArrayList auxList = equipoSelec.getListaIntegrantes();
                        for(int i=0;i<nombreInt.length;i++){
                            lista+=(i+1)+". "+nombreInt[i]+"\n";
                        }
                        int opcElim = (Integer.parseInt(JOptionPane.showInputDialog(lista)))+1;
                        if(opcElim!=0 && (opcElim>0 && opcElim<auxList.size())){
                            auxList.remove(opcElim);
                        }
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "No hay integrantes en el equipo.");
                    }
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Ingrese una opción válida");
                }
            }
            llenarCaja();
        }else{
            JOptionPane.showMessageDialog(rootPane, "No hay equipos añadidos.");
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_añadirActionPerformed
        Equipo objAux = new Equipo();
        objAux.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del equipo:"));
        listaEquipos.add(objAux);
        llenarCaja();
//        obj1.addRow(objAux.);
    }//GEN-LAST:event_btn_añadirActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        int numEquipo = 0;
        String[] nombresEquipos = new String[listaEquipos.size()];
        for(int i=0;i<listaEquipos.size();i++){
            Equipo foo = listaEquipos.get(i);
            nombresEquipos[i]=foo.getNombre();
        }
        numEquipo = JOptionPane.showOptionDialog(rootPane, "Elija el equipo a eliminar:", "Eliminar equipo", JOptionPane.DEFAULT_OPTION, JOptionPane.
                QUESTION_MESSAGE, null, nombresEquipos, null);   
        if(numEquipo>=0 && numEquipo<=listaEquipos.size()){
            listaEquipos.remove(numEquipo);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Ingrese una opción válida");
        }
        llenarCaja();
    }//GEN-LAST:event_btn_eliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }
    
    private void llenarCaja() {
        for(Equipo objaux1: listaEquipos){
            for(Object objaux2:objaux1.toObjArray()){
                Persona aux3 = (Persona)objaux2;
                obj1.addRow(aux3.toObjArray()); 
            }
        }
        obj1.fireTableDataChanged();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_añadir;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
