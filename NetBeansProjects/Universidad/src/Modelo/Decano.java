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
public class Decano extends Profesor{
    String facultad;

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public Decano(String facultad, long cedula, long numTarjetaProf) {
        super(cedula, numTarjetaProf);
        this.facultad = facultad;
    }

    @Override
    public void dictarClase(){
        System.out.println("Dictar clase Decano");
    }  
    
    public void reportarDesempeño(){
        System.out.println("Reportar desempeño Decano");
    }
}
