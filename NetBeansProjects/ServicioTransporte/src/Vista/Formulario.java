/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;

/**
 *
 * @author Yair Lopez Poveda <ylopezp@correo.udistrital.edu.co>
 */
public class Formulario extends javax.swing.JFrame {

    /**
     * Creates new form Formulario
     */
    public Formulario() {
        initComponents();
    }

    public JRadioButton getAvion() {
        return avion;
    }

    public void setAvion(JRadioButton avion) {
        this.avion = avion;
    }

    public JRadioButton getBus() {
        return bus;
    }

    public void setBus(JRadioButton bus) {
        this.bus = bus;
    }

    public JRadioButton getLancha() {
        return lancha;
    }

    public void setLancha(JRadioButton lancha) {
        this.lancha = lancha;
    }

    public JRadioButton getRutaTrans() {
        return rutaTrans;
    }

    public void setRutaTrans(JRadioButton rutaTrans) {
        this.rutaTrans = rutaTrans;
    }

    public JRadioButton getServGeneral() {
        return servGeneral;
    }

    public void setServGeneral(JRadioButton servGeneral) {
        this.servGeneral = servGeneral;
    }

    public JLabel getNoPasajerosLabel() {
        return NoPasajerosLabel;
    }

    public void setNoPasajerosLabel(JLabel NoPasajerosLabel) {
        this.NoPasajerosLabel = NoPasajerosLabel;
    }

    public JLabel getAireAconLabel() {
        return aireAconLabel;
    }

    public void setAireAconLabel(JLabel aireAconLabel) {
        this.aireAconLabel = aireAconLabel;
    }

    public JCheckBox getAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(JCheckBox aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public JTextField getAltMax() {
        return altMax;
    }

    public void setAltMax(JTextField altMax) {
        this.altMax = altMax;
    }

    public JLabel getAltMaxLabel() {
        return altMaxLabel;
    }

    public void setAltMaxLabel(JLabel altMaxLabel) {
        this.altMaxLabel = altMaxLabel;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(JButton btnSalir) {
        this.btnSalir = btnSalir;
    }

    public JButton getCalcularCosto() {
        return calcularCosto;
    }

    public void setCalcularCosto(JButton calcularCosto) {
        this.calcularCosto = calcularCosto;
    }

    public JTextField getCostoKm() {
        return costoKm;
    }

    public void setCostoKm(JTextField costoKm) {
        this.costoKm = costoKm;
    }

    public JLabel getCostoKmLabel() {
        return costoKmLabel;
    }

    public void setCostoKmLabel(JLabel costoKmLabel) {
        this.costoKmLabel = costoKmLabel;
    }

    public JTextField getDestino() {
        return destino;
    }

    public void setDestino(JTextField destino) {
        this.destino = destino;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel13() {
        return jLabel13;
    }

    public void setjLabel13(JLabel jLabel13) {
        this.jLabel13 = jLabel13;
    }

    public JLabel getjLabel14() {
        return jLabel14;
    }

    public void setjLabel14(JLabel jLabel14) {
        this.jLabel14 = jLabel14;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JSeparator getjSeparator1() {
        return jSeparator1;
    }

    public void setjSeparator1(JSeparator jSeparator1) {
        this.jSeparator1 = jSeparator1;
    }

    public JSeparator getjSeparator2() {
        return jSeparator2;
    }

    public void setjSeparator2(JSeparator jSeparator2) {
        this.jSeparator2 = jSeparator2;
    }

    public JSeparator getjSeparator5() {
        return jSeparator5;
    }

    public void setjSeparator5(JSeparator jSeparator5) {
        this.jSeparator5 = jSeparator5;
    }

    public JCheckBox getMastil() {
        return mastil;
    }

    public void setMastil(JCheckBox mastil) {
        this.mastil = mastil;
    }

    public JLabel getMastilLabel() {
        return mastilLabel;
    }

    public void setMastilLabel(JLabel mastilLabel) {
        this.mastilLabel = mastilLabel;
    }

    public ButtonGroup getMedioTransporte() {
        return medioTransporte;
    }

    public void setMedioTransporte(ButtonGroup medioTransporte) {
        this.medioTransporte = medioTransporte;
    }

    public JTextField getNoPasajeros() {
        return noPasajeros;
    }

    public void setNoPasajeros(JTextField noPasajeros) {
        this.noPasajeros = noPasajeros;
    }

    public JTextField getOrigen() {
        return origen;
    }

    public void setOrigen(JTextField origen) {
        this.origen = origen;
    }

    public JSeparator getSeparador1() {
        return separador1;
    }

    public void setSeparador1(JSeparator separador1) {
        this.separador1 = separador1;
    }

    public JSeparator getSeparador2() {
        return separador2;
    }

    public void setSeparador2(JSeparator separador2) {
        this.separador2 = separador2;
    }

    public JLabel getTarjetaPropLabel() {
        return tarjetaPropLabel;
    }

    public void setTarjetaPropLabel(JLabel tarjetaPropLabel) {
        this.tarjetaPropLabel = tarjetaPropLabel;
    }

    public JTextField getTarjetaPropiedad() {
        return tarjetaPropiedad;
    }

    public void setTarjetaPropiedad(JTextField tarjetaPropiedad) {
        this.tarjetaPropiedad = tarjetaPropiedad;
    }

    public ButtonGroup getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(ButtonGroup tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public JTextField getTipe() {
        return type;
    }

    public void setTipe(JTextField type) {
        this.type = type;
    }

    public JLabel getTypeLabel() {
        return typeLabel;
    }

    public void setTypeLabel(JLabel typeLabel) {
        this.typeLabel = typeLabel;
    }

    public JCheckBox getVelas() {
        return velas;
    }

    public void setVelas(JCheckBox velas) {
        this.velas = velas;
    }

    public JLabel getVelasLabel() {
        return velasLabel;
    }

    public void setVelasLabel(JLabel velasLabel) {
        this.velasLabel = velasLabel;
    }

    public JCheckBox getWifi() {
        return wifi;
    }

    public void setWifi(JCheckBox wifi) {
        this.wifi = wifi;
    }

    public JLabel getWifiLabel() {
        return wifiLabel;
    }

    public void setWifiLabel(JLabel wifiLabel) {
        this.wifiLabel = wifiLabel;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoServicio = new javax.swing.ButtonGroup();
        medioTransporte = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        servGeneral = new javax.swing.JRadioButton();
        rutaTrans = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        bus = new javax.swing.JRadioButton();
        avion = new javax.swing.JRadioButton();
        lancha = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        separador1 = new javax.swing.JSeparator();
        noPasajeros = new javax.swing.JTextField();
        NoPasajerosLabel = new javax.swing.JLabel();
        costoKm = new javax.swing.JTextField();
        costoKmLabel = new javax.swing.JLabel();
        tarjetaPropiedad = new javax.swing.JTextField();
        tarjetaPropLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        aireAconLabel = new javax.swing.JLabel();
        wifiLabel = new javax.swing.JLabel();
        altMaxLabel = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        mastilLabel = new javax.swing.JLabel();
        velasLabel = new javax.swing.JLabel();
        mastil = new javax.swing.JCheckBox();
        aireAcondicionado = new javax.swing.JCheckBox();
        wifi = new javax.swing.JCheckBox();
        type = new javax.swing.JTextField();
        altMax = new javax.swing.JTextField();
        velas = new javax.swing.JCheckBox();
        separador2 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        destino = new javax.swing.JTextField();
        origen = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btnSalir = new javax.swing.JButton();
        calcularCosto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Factura Servicios");

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Servicios de transporte - Costos");

        tipoServicio.add(servGeneral);
        servGeneral.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        servGeneral.setText("Servicio general");
        servGeneral.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tipoServicio.add(rutaTrans);
        rutaTrans.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rutaTrans.setText("Ruta de Transporte");
        rutaTrans.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Medio de transporte :");

        medioTransporte.add(bus);
        bus.setText("Bus");
        bus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busActionPerformed(evt);
            }
        });

        medioTransporte.add(avion);
        avion.setText("Avión");
        avion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        avion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avionActionPerformed(evt);
            }
        });

        medioTransporte.add(lancha);
        lancha.setText("Lancha");
        lancha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        noPasajeros.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        noPasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noPasajerosActionPerformed(evt);
            }
        });

        NoPasajerosLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NoPasajerosLabel.setText("Número de pasajeros :");

        costoKm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        costoKm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costoKmActionPerformed(evt);
            }
        });

        costoKmLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        costoKmLabel.setText("Costo Km recorrido :");

        tarjetaPropiedad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tarjetaPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarjetaPropiedadActionPerformed(evt);
            }
        });

        tarjetaPropLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tarjetaPropLabel.setText("Tarjeta de propiedad :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Medio de transporte :");

        aireAconLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        aireAconLabel.setText("Aire acondicionado :");

        wifiLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        wifiLabel.setText("Internet wifi :");

        altMaxLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        altMaxLabel.setText("Altitud máxima :");

        typeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        typeLabel.setText("Tipo :");

        mastilLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mastilLabel.setText("Mástil :");

        velasLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        velasLabel.setText("Velas :");

        mastil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mastil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mastilActionPerformed(evt);
            }
        });

        aireAcondicionado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        wifi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        velas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        velas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                velasActionPerformed(evt);
            }
        });

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Ciudad origen :");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Ciudad destino :");

        destino.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        origen.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnSalir.setText("Salir");
        btnSalir.setPreferredSize(new java.awt.Dimension(73, 20));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        calcularCosto.setText("Calcular costo");
        calcularCosto.setPreferredSize(new java.awt.Dimension(73, 20));
        calcularCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularCostoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(costoKmLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(costoKm))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(destino))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tarjetaPropLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(tarjetaPropiedad))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(origen))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(calcularCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mastilLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(mastil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(aireAconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(aireAcondicionado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(wifiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(wifi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(type))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(altMaxLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(altMax))
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(velasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(velas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator2)
                    .addComponent(separador1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(servGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(70, 70, 70)
                        .addComponent(rutaTrans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(avion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lancha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NoPasajerosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(noPasajeros))
                    .addComponent(separador2))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(servGeneral)
                    .addComponent(rutaTrans))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bus)
                    .addComponent(avion)
                    .addComponent(lancha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(noPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NoPasajerosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(costoKm, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costoKmLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tarjetaPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tarjetaPropLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(aireAcondicionado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aireAconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(wifi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wifiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(altMax, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(altMaxLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(mastil, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mastilLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(velas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(velasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(origen, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(destino, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcularCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void busActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busActionPerformed

    private void noPasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noPasajerosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noPasajerosActionPerformed

    private void costoKmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costoKmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costoKmActionPerformed

    private void tarjetaPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarjetaPropiedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tarjetaPropiedadActionPerformed

    private void avionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_avionActionPerformed

    private void mastilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mastilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mastilActionPerformed

    private void velasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_velasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_velasActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void calcularCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularCostoActionPerformed
        
    }//GEN-LAST:event_calcularCostoActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NoPasajerosLabel;
    private javax.swing.JLabel aireAconLabel;
    private javax.swing.JCheckBox aireAcondicionado;
    private javax.swing.JTextField altMax;
    private javax.swing.JLabel altMaxLabel;
    private javax.swing.JRadioButton avion;
    private javax.swing.JButton btnSalir;
    private javax.swing.JRadioButton bus;
    private javax.swing.JButton calcularCosto;
    private javax.swing.JTextField costoKm;
    private javax.swing.JLabel costoKmLabel;
    private javax.swing.JTextField destino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JRadioButton lancha;
    private javax.swing.JCheckBox mastil;
    private javax.swing.JLabel mastilLabel;
    private javax.swing.ButtonGroup medioTransporte;
    private javax.swing.JTextField noPasajeros;
    private javax.swing.JTextField origen;
    private javax.swing.JRadioButton rutaTrans;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JRadioButton servGeneral;
    private javax.swing.JLabel tarjetaPropLabel;
    private javax.swing.JTextField tarjetaPropiedad;
    private javax.swing.ButtonGroup tipoServicio;
    private javax.swing.JTextField type;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JCheckBox velas;
    private javax.swing.JLabel velasLabel;
    private javax.swing.JCheckBox wifi;
    private javax.swing.JLabel wifiLabel;
    // End of variables declaration//GEN-END:variables
}
