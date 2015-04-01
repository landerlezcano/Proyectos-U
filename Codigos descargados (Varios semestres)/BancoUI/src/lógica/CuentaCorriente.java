/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lógica;

import javax.swing.JOptionPane;

/**
 *
 * @author Yair
 */
public class CuentaCorriente extends CuentaBancaria{
    private long sobregiro;
    
    public CuentaCorriente(long sobregiro) {
        super();
        this.sobregiro = sobregiro;
    }

    public CuentaCorriente(long sobregiro, String titular, long no_cuenta, long saldo, String clave) {
        super(titular, no_cuenta, saldo, clave);
        this.sobregiro = sobregiro;
    }

    public CuentaCorriente() {
    }
    
    @Override
    public void retiro(long cantidad) {
        if(cantidad>saldo){
            if(sobregiro<=0){
                JOptionPane.showMessageDialog(null, "El saldo es insuficiente y no hay sobregiro.");
            }else if ((sobregiro+saldo)<cantidad){
                long aux =0;
                aux = Math.abs(saldo-cantidad);
                saldo =0;
                sobregiro = sobregiro-aux;
                JOptionPane.showMessageDialog(null, "Retiro realizado.");
            }else{
                JOptionPane.showMessageDialog(null, "El saldo y el sobregiro son insuficientes.");
            }
        }else{
            saldo-=cantidad;
        }
        JOptionPane.showMessageDialog(null, "El estado de su cuenta es: \n\n\n"+this.toString());
    }

    @Override
    public void consignar(long cantidad) {
        saldo+=cantidad;
        JOptionPane.showMessageDialog(null, "El estado de su cuenta es: \n\n\n"+this.toString());
    }
    
    @Override
    public String toString() {
        return "\nCuenta Bancaria Corriente no. : "+ no_cuenta + "\nTitular: " + titular + "\nSaldo: " + saldo + "\nSobregiro: "+sobregiro;
    }

    public long getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(long sobregiro) {
        this.sobregiro = sobregiro;
    }
    
}
