/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import java.util.ArrayList;

/**
 * Clase que define el ArrayList ListaClientes
 * @author Sebastian Gil
 * @version 1.0
 */
public class ListaClientes {
    /**
     * Declaracion de Atributos
    */
    private ArrayList <Cliente> LCliente;

    /**
     * Constructor Párametrico
     * @param LCliente
     */
    public ListaClientes(ArrayList<Cliente> LCliente) {
        this.LCliente = LCliente;
    }
    
    /**
     * Constructor Básico
     */
    public ListaClientes() {
        this.LCliente = new <Cliente> ArrayList();
    }

    /**
     * Metodo que obtiene y retorna el contenido del ArrayList LCliente(Lista Clientes)
     * @return ArrayList
     */
    public ArrayList<Cliente> getLCliente() {
        return LCliente;
    }

    /**
     * Metodo que recibe un ArrayList por párametro y se le Asigna a el ArrayList LCliente
     * @param LCliente
     */
    public void setLCliente(ArrayList<Cliente> LCliente) {
        this.LCliente = LCliente;
    }
    
    /**
    * Metodo que retorna el contenido del ArrayList ListaClientes
    * @return String
    */
    @Override
    public String toString() {
        return "ListaClientes";
    }
    
    
    
}
