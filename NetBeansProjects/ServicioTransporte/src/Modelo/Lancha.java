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
public class Lancha extends MedioTransporte {
    protected boolean mastil;
    protected boolean velas;
    protected String tipoLancha;

    public Lancha() {
    }

    public Lancha(boolean mastil, boolean velas, String tipoLancha, int NPasajeros, long TarjetaPropiedad, float CostoKM) {
        super(NPasajeros, TarjetaPropiedad, CostoKM);
        this.mastil = mastil;
        this.velas = velas;
        this.tipoLancha = tipoLancha;
    }
    
    public boolean isMastil() {
        return mastil;
    }

    public void setMastil(boolean mastil) {
        this.mastil = mastil;
    }

    public boolean isVelas() {
        return velas;
    }

    public void setVelas(boolean velas) {
        this.velas = velas;
    }

    public String getTipoLancha() {
        return tipoLancha;
    }

    public void setTipoLancha(String tipoLancha) {
        this.tipoLancha = tipoLancha;
    }

    @Override
    public String toString() {
        return "Medio de transporte escogido : Lancha\n"+super.toString()+
                "Mastil : " + mastil + "\nVelas : " + velas + 
                "\nTipo de lancha : " + tipoLancha + '\n';
    }

}
