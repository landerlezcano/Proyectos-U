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
public class Viveres extends Producto {
    private double IvaV;

    public Viveres(double IvaV, String Cod, String Nombre, double cantudad, double valoru) {
        super(Cod, Nombre, cantudad, valoru);
        this.IvaV = IvaV;
    }
    
    public Viveres() {
        super();
        this.IvaV = 0.10;
    }

    public double getIvaV() {
        return IvaV;
    }

    public void setIvaV(double IvaV) {
        this.IvaV = IvaV;
    }

    @Override
    public String toString() {
        return super.toString() + "\nIva = " + IvaV ;
    }
    
    
}
