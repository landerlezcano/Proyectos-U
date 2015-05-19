/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import java.util.ArrayList;

/**
 * Clase que define el ArrayList ListaViveres
 * @author Sebastian Gil
 * @version 1.0
 */
public class ListaViveres {
    /**
    * Declaracion de Atributos
    */   
    private ArrayList <Viveres> LV;

    /**
     * Constructor Párametrico
     * @param LV
     */
    public ListaViveres(ArrayList<Viveres> LV) {
        this.LV = LV;
    }
    
    /**
     * Constructor Básico
     */
    public ListaViveres() {
        this.LV = new <Viveres> ArrayList();
    }

    /**
     * Metodo que obtiene y retorna el contenido del ArrayList LV(Lista Viveres)
     * @return ArrayList
     */
    public ArrayList<Viveres> getLV() {
        return LV;
    }

    /**
     * Metodo que recibe un ArrayList por párametro y se le Asigna al ArrayList LV
     * @param LV
     */
    public void setLV(ArrayList<Viveres> LV) {
        this.LV = LV;
    }
    
    /**
    * Metodo que retorna el contenido del ArrayList LV
    * @return String
    */
    
    @Override
    public String toString() {
        return "ListaViveres";
    }
    
    
    
    
    
}
