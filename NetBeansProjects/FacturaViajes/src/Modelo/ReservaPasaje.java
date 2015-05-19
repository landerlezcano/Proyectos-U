/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author estudiante
 */
public class ReservaPasaje implements Impuesto {

    private String destino;
    private String aereolinea;
    private Date fechaIda;
    private Date fechaVuelta;
    private long precioPasaje;
    private Boolean destinoNacional;        // nacional o internacional

    public ReservaPasaje(String destino, String aereolinea, Date fechaIda, Date fechaVuelta, long precioPasaje, Boolean destinoNacional) {
        this.destino = destino;
        this.aereolinea = aereolinea;
        this.fechaIda = fechaIda;
        this.fechaVuelta = fechaVuelta;
        this.precioPasaje = precioPasaje;
        this.destinoNacional = destinoNacional;
    }

    public ReservaPasaje(String destino, String aereolinea, Date fechaIda, long precioPasaje, Boolean destinoNacional) {
        this.destino = destino;
        this.aereolinea = aereolinea;
        this.fechaIda = fechaIda;
        this.fechaVuelta = fechaIda;
        this.precioPasaje = precioPasaje;
        this.destinoNacional = destinoNacional;
    }

    public ReservaPasaje() {
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getAereolinea() {
        return aereolinea;
    }

    public void setAereolinea(String aereolinea) {
        this.aereolinea = aereolinea;
    }

    public Date getFechaIda() {
        return fechaIda;
    }

    public void setFechaIda(Date fechaIda) {
        this.fechaIda = fechaIda;
    }

    public Date getFechaVuelta() {
        return fechaVuelta;
    }

    public void setFechaVuelta(Date fechaVuelta) {
        this.fechaVuelta = fechaVuelta;
    }

    public long getPrecioPasaje() {
        return precioPasaje;
    }

    public void setPrecioPasaje(long precioPasaje) {
        this.precioPasaje = precioPasaje;
    }

    public Boolean isDestinoNacional() {
        return destinoNacional;
    }

    public void setDestinoNacional(Boolean destinoNacional) {
        this.destinoNacional = destinoNacional;
    }

    public long calcularPrecio() {
        if (!(fechaIda == null)) {
            if (fechaVuelta == null) {                  //solo ida
                return precioPasaje + cobroImpuesto(precioPasaje);
            } else {                                  //ida y vuelta
                return 2 * (precioPasaje + cobroImpuesto(precioPasaje));
            }
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "ReservaPasaje{" + "destino=" + destino + ", aereolinea=" + aereolinea + ", precioPasaje=" + precioPasaje + '}';
    }

    @Override
    public long cobroImpuesto(Long monto) {
        return destinoNacional ? monto * (long) 0.01 : monto * (long) 0.04;
    }

}
