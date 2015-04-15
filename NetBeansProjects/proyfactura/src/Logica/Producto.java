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
public class Producto {
    private String Cod,Nombre;
    private double cantudad, valoru;

    public Producto(String Cod, String Nombre, double cantudad, double valoru) {
        this.Cod = Cod;
        this.Nombre = Nombre;
        this.cantudad = cantudad;
        this.valoru = valoru;
    }
    
    public Producto() {
        this.Cod = "";
        this.Nombre = "";
        this.cantudad = 0;
        this.valoru = 0;
    }

    public String getCod() {
        return Cod;
    }

    public void setCod(String Cod) {
        this.Cod = Cod;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getCantudad() {
        return cantudad;
    }

    public void setCantudad(double cantudad) {
        this.cantudad = cantudad;
    }

    public double getValoru() {
        return valoru;
    }

    public void setValoru(double valoru) {
        this.valoru = valoru;
    }

    @Override
    public String toString() {
        return "\nCodigo = " + Cod + 
               "\nNombre = " + Nombre + 
               "\nCantudad = " + cantudad + 
               "\nValoru Unitario = " + valoru ;
    }
    
    
}
