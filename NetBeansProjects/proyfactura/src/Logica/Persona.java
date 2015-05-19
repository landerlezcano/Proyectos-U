/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

/**
 * Clase que define el Objeto Persona
 * @author Sebastian Gil
 * @version 1.0
 */
public abstract class Persona {
    /**
    * Declaracion de Atributos
    */
    protected String Nombre,ID;

    /**
     * Constructo Párametrico
     * @param Nombre
     * @param ID
     */
    public Persona(String Nombre, String ID) {
        this.Nombre = Nombre;
        this.ID = ID;
    }
    
    /**
     * Constructor Básico
     */
    public Persona() {
        this.Nombre = "";
        this.ID = "";
    }

    /**
     * Metodo que obtiene y retorna el contenido del Atributo Nombre
     * @return
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Metodo que recibe un párametro y se le Asigna a el atributo Nombre del objeto 
     * @param Nombre
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * Metodo que obtiene y retorna el contenido del Atributo ID
     * @return
     */
    public String getID() {
        return ID;
    }

    /**
     * Metodo que recibe un párametro y se le Asigna a el atributo ID del objeto 
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }
/**
* Metodo que retorna el contenido del objeto Persona
* @return String
*/
    @Override
    public String toString() {
        return "\nNombre : " + Nombre + "\nID : " + ID;
    }
    
    
     
}
