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
public class DatosRegistro extends PersonaPrestamo {
    private double valor,Plazo,cuota;
    private float Porcentaje;

    public DatosRegistro(double valor, float Porcentaje, double Plazo, double cuota, String nombre, String Numcredto) {
        super(nombre, Numcredto);
        this.valor = valor;
        this.Porcentaje = Porcentaje;
        this.Plazo = Plazo;
        this.cuota = cuota;
    }
    public DatosRegistro() {
        super();
        this.valor = 0;
        this.Porcentaje = 0;
        this.Plazo = 0;
        this.cuota = 0;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public float getPorcentaje() {
        return Porcentaje;
    }

    public void setPorcentaje(float Porcentaje) {
        this.Porcentaje = Porcentaje;
    }

    public double getPlazo() {
        return Plazo;
    }

    public void setPlazo(double Plazo) {
        this.Plazo = Plazo;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }


    

    @Override
    public String toString() {
        double a,b,c;
        double r=Math.pow(1+Porcentaje,Plazo);
        a= r*Porcentaje;
        b= r -1;
        c=a/b;
        return super.toString() +"\nvalor=" + valor + 
                "\nporcentaje=" + Porcentaje/100 + 
                "\nplazo=" + Plazo + 
                "\n\nCuota a pagar"+ a;
    }
     
     
}
