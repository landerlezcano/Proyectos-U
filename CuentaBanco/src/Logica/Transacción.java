/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Yair Lopez Poveda <ylopezp@correo.udistrital.edu.co>
 */
public class Transacción {
    private long NoCuenta;
    private String operaciónRealizada;
    private long saldoAnterior;
    private long saldoPosterior;
    private long monto;

    public Transacción() {
    }
    
    public static int getColumnCount() {
        return Transacción.class.getDeclaredFields().length;
    }

    public Transacción(long NoCuenta, String operaciónRealizada, long saldoAnterior, long saldoPosterior, long monto) {
        this.NoCuenta = NoCuenta;
        this.operaciónRealizada = operaciónRealizada;
        this.saldoAnterior = saldoAnterior;
        this.saldoPosterior = saldoPosterior;
        this.monto = monto;
    }
    
    public String[] toVector(){
        return new String[]{String.valueOf(NoCuenta),operaciónRealizada
                ,String.valueOf(monto),String.valueOf(saldoAnterior)
                ,String.valueOf(saldoPosterior)};
    }

    @Override
    public String toString() {
        return "Transacci\u00f3n{" + "NoCuenta=" + NoCuenta 
                + ", operaci\u00f3nRealizada=" + operaciónRealizada 
                + ", saldoAnterior=" + saldoAnterior + ", saldoPosterior=" 
                + saldoPosterior + ", monto=" + monto + '}';
    }

    
}
