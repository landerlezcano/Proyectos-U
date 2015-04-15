/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

/**
 *
 * @author estudiante
 */
public class Credito extends Persona{
    private double valintanual,numcredito,valcuota;
    private int porintanual;

    public Credito(double valintanual, double numcredito, double valcuota, int porintanual, String Nombre,long valorprestamo, long plazomeses) {
        super(Nombre, valorprestamo, plazomeses);
        this.valintanual = valintanual;
        this.numcredito = numcredito;
        this.valcuota = valcuota;
        this.porintanual = porintanual;
    }
        public Credito() {
        super();
        this.valintanual = 0;
        this.numcredito = 0;
        this.valcuota = 0;
        this.porintanual = 0;
    }

    public double getValintanual() {
        return valintanual;
    }

    public void setValintanual(double valintanual) {
        this.valintanual = valintanual;
    }

    public double getNumcredito() {
        return numcredito;
    }

    public void setNumcredito(double numcredito) {
        this.numcredito = numcredito;
    }

    public int getPorintanual() {
        return porintanual;
    }

    public void setPorintanual(int porintanual) {
        this.porintanual = porintanual;
    }

    public double getValcuota() {
        return valcuota;
    }

    public void setValcuota(double valcuota) {
        this.valcuota = valcuota;
    }

    @Override
    public String toString() {
        return "valintanual=" + valintanual + 
               "numcredito=" + numcredito + 
               "valcuota=" + valcuota + 
               "porintanual=" + porintanual;
    }

      public long generarvaloranual(){
        long prestamo=this.getValorprestamo();
        long porcentaje=1/2;
        long valor=0;
        if(this.getPlazomeses()>12){
            valor=prestamo*porcentaje;       
        }
        return valor;
    }
    
    public long generarvalorcuota(){
        long cuota=this.getPlazomeses();
        long prestamo=this.getValorprestamo();
        long valorcuota=prestamo/cuota;
        return valorcuota;
    }
}

    
    
