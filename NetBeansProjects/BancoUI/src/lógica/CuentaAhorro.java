/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lógica;

import javax.swing.JOptionPane;

/**
 *
 * @author Yair Lopez Poveda <ylopezp@correo.udistrital.edu.co>
 */
public class CuentaAhorro extends CuentaBancaria{

    private long cuotaManejo;

    public CuentaAhorro() {
        super();
    }
    
    public CuentaAhorro(String titular, long no_cuenta, long saldo, String clave) {
        super(titular, no_cuenta, saldo, clave);
    }

    public CuentaAhorro(long cuotaManejo, String titular, long no_cuenta, long saldo, String clave) {
        super(titular, no_cuenta, saldo, clave);
        this.cuotaManejo = cuotaManejo;
    }
    
    @Override
    public void retiro(long cantidad) {
        if(cantidad>saldo){
            JOptionPane.showMessageDialog(null, "El saldo es insuficiente.");
        }else{
            saldo-=cantidad;
            JOptionPane.showMessageDialog(null, "Retiro realizado.");
        }
        JOptionPane.showMessageDialog(null, "El estado de su cuenta es: \n\n\n"+this.toString());
    }

    @Override
    public void consignar(long cantidad) {
        saldo+=cantidad;
        JOptionPane.showMessageDialog(null, "El estado de su cuenta es: \n\n\n"+this.toString());    }
    
    @Override
    public String toString() {
        return "\nCuenta Bancaria de Ahorro no. : "+ no_cuenta + "\nTitular: " + titular + "\nSaldo: " + saldo
                +"\nCuota de manejo: "+cuotaManejo;
    }

    public long getCuotaManejo() {
        return cuotaManejo;
    }

    public void setCuotaManejo(long cuotaManejo) {
        this.cuotaManejo = cuotaManejo;
    }
    
}
