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
public class Persona {
    private String Nombre;
    private long valorprestamo;
    private long plazomeses;

    public Persona(String Nombre, long valorprestamo, long plazomeses) {
        this.Nombre = Nombre;
        this.valorprestamo = valorprestamo;
        this.plazomeses = plazomeses;
    }

    public Persona() {
        this.Nombre = " ";
        this.valorprestamo = 0;
        this.plazomeses = 0;
    }

    public String getNombre() {
        return Nombre;
    }

    public long getValorprestamo() {
        return valorprestamo;
    }

    public long getPlazomeses() {
        return plazomeses;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setValorprestamo(long valorprestamo) {
        this.valorprestamo = valorprestamo;
    }

    public void setPlazomeses(long plazomeses) {
        this.plazomeses = plazomeses;
    }
    
    @Override
    public String toString() {
        return "Nombre=" + Nombre + 
               "valorprestamo=" + valorprestamo + 
               "plazomeses=" + plazomeses;
    }
    
    
    
    
    
    
}
