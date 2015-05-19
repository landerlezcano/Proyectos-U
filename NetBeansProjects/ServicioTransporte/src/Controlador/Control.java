/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import Vista.Cotización;
import Vista.Formulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Yair Lopez Poveda <ylopezp@correo.udistrital.edu.co>
 */
public class Control implements ActionListener {

    private Formulario obj1;
    private ServicioGeneral obj2;
    private RutaEscolar obj3;

    public Control() {
        obj1 = new Formulario();
        obj2 = new ServicioGeneral();
        obj3 = new RutaEscolar();
        obj1.getAvion().addActionListener(this);
        obj1.getBus().addActionListener(this);
        obj1.getLancha().addActionListener(this);
        obj1.getRutaTrans().addActionListener(this);
        obj1.getServGeneral().addActionListener(this);
        obj1.getCalcularCosto().addActionListener(this);
        
        obj1.getAltMax().setVisible(false);
        obj1.getAltMaxLabel().setVisible(false);
        obj1.getTipe().setVisible(false);
        obj1.getTypeLabel().setVisible(false);
        obj1.getMastil().setVisible(false);
        obj1.getMastilLabel().setVisible(false);
        obj1.getVelas().setVisible(false);
        obj1.getVelasLabel().setVisible(false);
        obj1.getWifi().setVisible(true);
        obj1.getWifiLabel().setVisible(true);
        obj1.getAireAcondicionado().setVisible(true);
        obj1.getAireAconLabel().setVisible(true);
        
        obj1.getServGeneral().setSelected(true);
    }

    void iniciar() {
        obj1.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == obj1.getCalcularCosto()) {
            if (obj1.getServGeneral().isSelected()) {
                if (obj1.getBus().isSelected()) {
                    try {
                        obj2.setObjTransporte(new Bus(obj1.getAireAcondicionado().isSelected(),
                                obj1.getWifi().isSelected(), Integer.parseInt(obj1.getNoPasajeros().getText()),
                                Long.parseLong(obj1.getTarjetaPropiedad().getText()),
                                Float.parseFloat(obj1.getCostoKm().getText())));
                    } catch (Exception exp) {
                        JOptionPane.showMessageDialog(obj1, exp);
                    }
                }
                if (obj1.getAvion().isSelected()) {
                    try {
                        obj2.setObjTransporte(new Avion(Integer.parseInt(obj1.getAltMax().getText()),
                                obj1.getTipe().getText(),
                                Integer.parseInt(obj1.getNoPasajeros().getText()),
                                Long.parseLong(obj1.getTarjetaPropiedad().getText()),
                                Float.parseFloat(obj1.getCostoKm().getText())));
                    } catch (Exception exp) {
                        JOptionPane.showMessageDialog(obj1, exp);
                    }
                }
                if (obj1.getLancha().isSelected()) {
                    try {
                        obj2.setObjTransporte(new Lancha(obj1.getMastil().isSelected(),
                                obj1.getVelas().isSelected(),obj1.getTipe().getText(),
                                Integer.parseInt(obj1.getNoPasajeros().getText()),
                                Long.parseLong(obj1.getTarjetaPropiedad().getText()),
                                Float.parseFloat(obj1.getCostoKm().getText())));
                    } catch (Exception exp) {
                        JOptionPane.showMessageDialog(obj1, exp);
                    }
                }
                try{
                    obj2.setCiudadOrigen(obj1.getOrigen().getText());
                    obj2.setCiudadDestino(obj1.getDestino().getText());
                    Cotización obj4 = new Cotización();
                    obj4.getjTextArea1().setText(obj2.toString()+"\n\n\n"
                            +"Costo por pasajero :"+String.format("%2f", obj2.calcularCostoPorPasajero())
                            +"\n\nCosto total :"+String.format("%2f", obj2.calcularCostoTotal()));
                    obj4.setVisible(true);
                } catch (Exception exp) {
                    JOptionPane.showMessageDialog(obj1, exp);
                }
            } else if (obj1.getRutaTrans().isSelected()) {
                try{
                    obj3.setObjBus(new Bus(obj1.getAireAcondicionado().isSelected(),
                                obj1.getWifi().isSelected(), Integer.parseInt(obj1.getNoPasajeros().getText()),
                                Long.parseLong(obj1.getTarjetaPropiedad().getText()),
                                Float.parseFloat(obj1.getCostoKm().getText())));
                    obj3.setZonaColegio(obj1.getOrigen().getText());
                    obj3.setZonaTrabajo(obj1.getDestino().getText());
                    Cotización obj4 = new Cotización();
                    obj4.getjTextArea1().setText(obj3.toString()+"\n\n\n"
                            +"Costo por pasajero :"+String.format("%.2f", obj2.calcularCostoPorPasajero())
                            +"\n\nCosto total :"+String.format("%.2f", obj2.calcularCostoTotal()));
                    obj4.setVisible(true);
                } catch (Exception exp) {
                    JOptionPane.showMessageDialog(obj1, exp);
                }
                
            }
        } else {
            if (e.getSource() == obj1.getServGeneral()) {
                obj1.getBus().setSelected(true);
                obj1.getjLabel13().setText("Ciudad origen :");
                obj1.getjLabel14().setText("Ciudad destino :");
                obj1.getjLabel2().setVisible(true);
                obj1.getBus().setVisible(true);
                obj1.getAvion().setVisible(true);
                obj1.getLancha().setVisible(true);
                obj1.getSeparador1().setVisible(true);
            }
            if (e.getSource() == obj1.getRutaTrans()) {
                obj1.getjLabel2().setVisible(false);
                obj1.getBus().setVisible(false);
                obj1.getAvion().setVisible(false);
                obj1.getLancha().setVisible(false);
                obj1.getSeparador1().setVisible(false);
                obj1.getAltMax().setVisible(false);
                obj1.getAltMaxLabel().setVisible(false);
                obj1.getTipe().setVisible(false);
                obj1.getTypeLabel().setVisible(false);
                obj1.getMastil().setVisible(false);
                obj1.getMastilLabel().setVisible(false);
                obj1.getVelas().setVisible(false);
                obj1.getVelasLabel().setVisible(false);
                obj1.getWifi().setVisible(true);
                obj1.getWifiLabel().setVisible(true);
                obj1.getAireAcondicionado().setVisible(true);
                obj1.getAireAconLabel().setVisible(true);
                obj1.getjLabel13().setText("Zona colegio :");
                obj1.getjLabel14().setText("Zona trabajo :");
            }
            if (e.getSource() == obj1.getBus()) {
                obj1.getAltMax().setVisible(false);
                obj1.getAltMaxLabel().setVisible(false);
                obj1.getTipe().setVisible(false);
                obj1.getTypeLabel().setVisible(false);
                obj1.getMastil().setVisible(false);
                obj1.getMastilLabel().setVisible(false);
                obj1.getVelas().setVisible(false);
                obj1.getVelasLabel().setVisible(false);
                obj1.getWifi().setVisible(true);
                obj1.getWifiLabel().setVisible(true);
                obj1.getAireAcondicionado().setVisible(true);
                obj1.getAireAconLabel().setVisible(true);
            } else if (e.getSource() == obj1.getAvion()) {
                obj1.getAltMax().setVisible(true);
                obj1.getAltMaxLabel().setVisible(true);
                obj1.getTipe().setVisible(true);
                obj1.getTypeLabel().setVisible(true);
                obj1.getWifi().setVisible(false);
                obj1.getWifiLabel().setVisible(false);
                obj1.getAireAcondicionado().setVisible(false);
                obj1.getAireAconLabel().setVisible(false);
                obj1.getMastil().setVisible(false);
                obj1.getMastilLabel().setVisible(false);
                obj1.getVelas().setVisible(false);
                obj1.getVelasLabel().setVisible(false);
            } else if (e.getSource() == obj1.getLancha()) {
                obj1.getMastil().setVisible(true);
                obj1.getMastilLabel().setVisible(true);
                obj1.getVelas().setVisible(true);
                obj1.getVelasLabel().setVisible(true);
                obj1.getTipe().setVisible(true);
                obj1.getTypeLabel().setVisible(true);
                obj1.getAltMax().setVisible(false);
                obj1.getAltMaxLabel().setVisible(false);
                obj1.getWifi().setVisible(false);
                obj1.getWifiLabel().setVisible(false);
                obj1.getAireAcondicionado().setVisible(false);
                obj1.getAireAconLabel().setVisible(false);
            }
        }

    }
}
