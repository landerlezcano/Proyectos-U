/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author estudiante
 */
public class ReservaHotel implements Impuesto{
    
    private String ubicación;
    private String nombreHotel;
    private Date díaInicio;
    private Date díaFinal;
    private long precioDía;             //1 día == 1 noche

    public ReservaHotel(String ubicación, String nombreHotel, Date díaInicio, Date díaFinal) {
        this.ubicación = ubicación;
        this.nombreHotel = nombreHotel;
        this.díaInicio = díaInicio;
        this.díaFinal = díaFinal;
    }
    
    public ReservaHotel() {
        this.díaFinal = new Date();
        this.díaInicio = new Date();
    }
    
    public String getUbicación() {
        return ubicación;
    }

    public void setUbicación(String ubicación) {
        this.ubicación = ubicación;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public Date getDíaInicio() {
        return díaInicio;
    }

    public void setDíaInicio(Date díaInicio) {
        this.díaInicio = díaInicio;
    }

    public Date getDíaFinal() {
        return díaFinal;
    }

    public void setDíaFinal(Date díaFinal) {
        this.díaFinal = díaFinal;
    }

    public long getPrecioDía() {
        return precioDía;
    }

    public void setPrecioDía(long precioDía) {
        this.precioDía = precioDía;
    }
    
    public static long calcularDías(Date date1, Date date2, TimeUnit timeUnit) {
        long diffInMillies = date2.getTime() - date1.getTime();
        return timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS);
    }
    
    public long calcularPrecio(){
        long noDias = calcularDías(díaFinal, díaFinal, TimeUnit.DAYS);
        return (precioDía*noDias)+cobroImpuesto(precioDía*noDias);
    }
    
    @Override
    public String toString() {
        return "Ubicacion: " + ubicación + "\nNombre del Hotel:"
                + nombreHotel + "\nPrecio por día: =" + precioDía + '\n';
    }

    @Override
    public long cobroImpuesto(Long monto) {
        return monto*(long)0.05;
    }
    
}
