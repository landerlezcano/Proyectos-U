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
public class Avion extends MedioTransporte {
    protected int altitudMax;
    protected String tipoAvion;

    public Avion() {
        super();
    }

    public Avion(int altitudMax, String tipoAvion, int NPasajeros, long TarjetaPropiedad, float CostoKM) {
        super(NPasajeros, TarjetaPropiedad, CostoKM);
        this.altitudMax = altitudMax;
        this.tipoAvion = tipoAvion;
    }    
    
    public int getAltitudMax() {
        return altitudMax;
    }

    public void setAltitudMax(int altitudMax) {
        this.altitudMax = altitudMax;
    }

    public String getTipoAvion() {
        return tipoAvion;
    }

    public void setTipoAvion(String tipoAvion) {
        this.tipoAvion = tipoAvion;
    }

    @Override
    public String toString() {
        return "Medio de transporte escogido : Avión\n"+super.toString()+
                "Altitud máxima : " + altitudMax + "\nTipo de avión : " + tipoAvion + '\n';
    }
    
}
