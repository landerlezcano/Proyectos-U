/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import java.util.ArrayList;

/**
 * Clase que define el ArrayList ListaEmpleados
 * @author Sebastian Gil
 * @version 1.0
 */
public class ListaEmpleados {
    /**
    * Declaracion de Atributos
    */
    private ArrayList <Empleado> LEmpleado;

    /**
     * Constructor Párametrico
     * @param LEmpleado
     */
    public ListaEmpleados(ArrayList<Empleado> LEmpleado) {
        this.LEmpleado = LEmpleado;
    }
    
    /**
     * Constructor Básico
     */
    public ListaEmpleados() {
        this.LEmpleado = new <Empleado> ArrayList();
    }

    /**
     * Metodo que obtiene y retorna el contenido del ArrayList LEmpleado(Lista Empleados)
     * @return ArrayList
     */
    public ArrayList<Empleado> getLEmpleado() {
        return LEmpleado;
    }

    /**
     * Metodo que recibe un ArrayList por párametro y se le Asigna a el ArrayList LEmpleado
     * @param LEmpleado
     */
    public void setLEmpleado(ArrayList<Empleado> LEmpleado) {
        this.LEmpleado = LEmpleado;
    }
    
    /**
    * Metodo que retorna el contenido del ArrayList ListaEmpleados
    * @return String
    */
    @Override
    public String toString() {
        return "ListaEmpleados";
    }
    
    
    
    
}
