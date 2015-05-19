/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import java.util.ArrayList;

/**
 * Clase que define el ArrayList ListaElectro
 * @author Sebastian Gil
 * @version 1.0
 */
public class ListaElectro {
    /**
    * Declaracion de Atributos
    */
    ArrayList <Electro> LE;

    /**
     * Constructor Párametrico
     * @param LE
     */
    public ListaElectro(ArrayList<Electro> LE) {
        this.LE = LE;
    }
    
    /**
     * Constructor Básico
     */
    public ListaElectro() {
        this.LE = new <Electro> ArrayList();
    }

    /**
     * Metodo que obtiene y retorna el contenido del ArrayList LE(Lista Electro)
     * @return ArrayList
     */
    public ArrayList<Electro> getLE() {
        return LE;
    }

    /**
     * Metodo que recibe un ArrayList por párametro y se le Asigna a el ArrayList LE
     * @param LE
     */
    public void setLE(ArrayList<Electro> LE) {
        this.LE = LE;
    }

    /**
    * Metodo que retorna el contenido del ArrayList ListaElectro
    * @return String
    */
    @Override
    public String toString() {
        return "ListaElectro";
    }
    
    
    
    
    
}
