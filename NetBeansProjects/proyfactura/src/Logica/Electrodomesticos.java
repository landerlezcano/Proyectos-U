/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

/**
 *
 * @author USUARIO
 */
public class Electrodomesticos extends Producto{
    private double IvaE;

    public Electrodomesticos(double IvaE, String Cod, String Nombre, double cantudad, double valoru) {
        super(Cod, Nombre, cantudad, valoru);
        this.IvaE = IvaE;
    }
    
    public Electrodomesticos() {
        super();
        this.IvaE = 0.16;
    }

    public double getIvaE() {
        return IvaE;
    }

    public void setIvaE(double IvaE) {
        this.IvaE = IvaE;
    }

    @Override
    public String toString() {
        return super.toString() + "\nIva = " + IvaE ;
    }
    
    
}
