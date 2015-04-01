/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lógica;

/**
 *
 * @author Yair
 */
public abstract class CuentaBancaria {
    String titular;
    long no_cuenta;
    long saldo;
    String clave;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String titular, long no_cuenta, long saldo, String clave) {
        this.titular = titular;
        this.no_cuenta = no_cuenta;
        this.saldo = saldo;
        this.clave = clave;
    }
    
    public abstract void retiro(long cantidad);
    public abstract void consignar(long cantidad);

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public long getNo_cuenta() {
        return no_cuenta;
    }

    public void setNo_cuenta(long no_cuenta) {
        this.no_cuenta = no_cuenta;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean auntenticarUsuario(String clave,long no_cuenta)
    {
        return no_cuenta==this.no_cuenta && clave.equals(this.clave);
           
    }
    
    @Override
    public String toString() {
        return "\nCuenta Bancaria no. : "+ no_cuenta + "\nTitular: " + titular + "\nSaldo: " + saldo;
    }
    
    
}
