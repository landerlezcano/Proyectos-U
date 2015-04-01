/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Yair
 */
public class Entrada extends Operacion {
    
    String procedencia;
    String fechaRecepcion;

    public Entrada(String tipoEnvio, int numUnidades, Boolean fragilidad, String timestamp,float peso, String procedencia, String fechaRecep) {
        super(tipoEnvio, numUnidades, fragilidad, timestamp, peso);
        this.procedencia=procedencia;
        this.fechaRecepcion=fechaRecep;
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+this.fechaRecepcion+"\t\t"+this.procedencia;
    }
}
