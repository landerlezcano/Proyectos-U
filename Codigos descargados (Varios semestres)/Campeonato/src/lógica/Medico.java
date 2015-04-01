/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lógica;

/**
 *
 * @author estudiante
 */
public class Medico extends Persona {
    
    private long numeroTarjeta;

    public Medico() {
        super();
    }

    public Medico(long numeroTarjeta, String nombre, int id) {
        super(nombre, id);
        this.numeroTarjeta = numeroTarjeta;
    }

    public Medico(String nombre, int id) {
        super(nombre, id);
    }

    public long getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(long numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public String toString() {
        return "Nombre: "+getNombre()+"\n" +"Ocupación: Médico"+"Numero de tarjeta profesional:" + 
                numeroTarjeta + "\nID: "+getId();
    }
    
    
    
    
    
}
