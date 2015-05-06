/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lógica;

import java.util.Date;

/**
 *
 * @author estudiante
 */
public abstract class Relóg {
    protected Date hora;

    public Relóg() {
        this.hora = new Date();
    }

    
    
    public void darHora(){
        System.out.println("Hora: "+hora.toString());
    }
    
}
