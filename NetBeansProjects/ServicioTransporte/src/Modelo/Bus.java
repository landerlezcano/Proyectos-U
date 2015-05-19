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
public class Bus extends MedioTransporte {
    protected boolean AireAcondicionado;
    protected boolean WIFI;

    public Bus() {
        super();
    }

    public Bus(boolean AireAcondicionado, boolean WIFI, int NPasajeros, long TarjetaPropiedad, float CostoKM) {
        super(NPasajeros, TarjetaPropiedad, CostoKM);
        this.AireAcondicionado = AireAcondicionado;
        this.WIFI = WIFI;
    }
    
    public boolean isAireAcondicionado() {
        return AireAcondicionado;
    }

    public void setAireAcondicionado(boolean AireAcondicionado) {
        this.AireAcondicionado = AireAcondicionado;
    }

    public boolean isWIFI() {
        return WIFI;
    }

    public void setWIFI(boolean WIFI) {
        this.WIFI = WIFI;
    }

    @Override
    public String toString() {
        return "Medio de transporte escogido : Bus\n"+super.toString()+
                "Aire acondicionado : " + AireAcondicionado + "\nWifi : " + WIFI+"\n";
    }
}
