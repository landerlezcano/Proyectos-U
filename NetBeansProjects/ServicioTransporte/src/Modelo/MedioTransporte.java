/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Yair Lopez Poveda <ylopezp@correo.udistrital.edu.co>
 */
public abstract class MedioTransporte {
    protected int NPasajeros;
    private long TarjetaPropiedad;
    public float CostoKM;

    public MedioTransporte() {
    }

    public MedioTransporte(int NPasajeros, long TarjetaPropiedad, float CostoKM) {
        this.NPasajeros = NPasajeros;
        this.TarjetaPropiedad = TarjetaPropiedad;
        this.CostoKM = CostoKM;
    }
    
    public int getNPasajeros() {
        return NPasajeros;
    }

    public void setNPasajeros(int NPasajeros) {
        this.NPasajeros = NPasajeros;
    }

    public long getTarjetaPropiedad() {
        return TarjetaPropiedad;
    }

    public void setTarjetaPropiedad(long TarjetaPropiedad) {
        this.TarjetaPropiedad = TarjetaPropiedad;
    }

    public float getCostoKM() {
        return CostoKM;
    }

    public void setCostoKM(float CostoKM) {
        this.CostoKM = CostoKM;
    }

    @Override
    public String toString() {
        return "Número de pasajeros : " + NPasajeros + "\nTarjeta de propiedad : " 
                + TarjetaPropiedad + "\nCosto por kilómetro : " + CostoKM + '\n';
    }
    
}
