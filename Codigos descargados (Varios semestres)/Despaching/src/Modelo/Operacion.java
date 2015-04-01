/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Yair
 */
public class Operacion {
    public static int IDClass = 1;
    private String tipoEnvio;
    private int numUnidades;
    private Boolean fragilidad;
    private String timestamp;
    private float peso;
    private int ID;

    public Operacion(String tipoEnvio, int numUnidades, Boolean fragilidad, String timestamp, float peso) {
        this.tipoEnvio = tipoEnvio;
        this.numUnidades = numUnidades;
        this.fragilidad = fragilidad;
        this.timestamp = timestamp;
        this.peso = peso;
        this.ID = IDClass;
        IDClass++;
    }

    public Operacion() {
    }

    @Override
    public String toString() {
        return ID + "\t"+timestamp+"\t"+tipoEnvio+"\t"+numUnidades+"\t\t"+fragilidad+"\t"+
                peso+" Kg";
    }
    
    public void mostrarOperacion(Operacion aux){
        JOptionPane.showMessageDialog(null, new JTextArea("ID\tSello de tiempo\t\tTipo de envio\tNo. de unidades\tFragilidad\tPeso\tFecha de operación\tLugar\n"+aux.toString()), "Información de la operación", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
}
