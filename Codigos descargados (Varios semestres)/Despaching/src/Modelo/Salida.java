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
public class Salida extends Operacion {
    
    String destino;
    String fechaDespacho;

    public Salida(String tipoEnvio, int numUnidades, Boolean fragilidad, String timestamp, float peso, String destino, String fechaDesp) {
        super(tipoEnvio, numUnidades, fragilidad, timestamp, peso);
        this.destino=destino;
        this.fechaDespacho=fechaDesp;
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+this.fechaDespacho+"\t\t"+this.destino; 
    }
    
        
}
