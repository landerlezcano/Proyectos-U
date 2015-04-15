/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lógica;

/**
 *
 * @author Yair Lopez Poveda <ylopezp@correo.udistrital.edu.co> 
 */
public class Vendedor {
    
    private int ID;
    private double ventas[];
    private double promedio;

    public Vendedor() {
        this.ventas = new double[6];
        this.promedio = 0;
        this.ID =0;
    }

    public Vendedor(double[] ventas, double promedio) {
        this.ventas = ventas;
        this.promedio = promedio;
    }

    public double[] getVentas() {
        return ventas;
    }

    public void setVentas(double[] ventas) {
        this.ventas = ventas;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    public void calcularPromedio(){
        double acum=0;
        for(double i:this.ventas){
            acum+=i;
        }
        this.promedio = acum/ventas.length;
    } 

    @Override
    public String toString() {
        return "Vendedor no.:"+this.ID + " Promedio: " + String.format("%.2f", this.promedio);
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    
}
