/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

/**
 * Clase que define el Objeto Cliente
 * @author Sebastian Gil
 * @version 1.0
 */
public class Cliente extends Persona {
    /**
     * Declaracion Atributos 
    */
    private String Direccion,Telefono;
    
    /**Constructor Paramétrico
     * @param Direccion
     * @param Telefono
     * @param Nombre
     * @param ID
     */
    public Cliente(String Direccion, String Telefono, String Nombre, String ID) {
        super(Nombre, ID);
        this.Direccion = Direccion;
        this.Telefono = Telefono;
    }
    /** Constructor Basico que crea un objeto Cliente con datos nulos */
    public Cliente() {
        super();
        this.Direccion = "";
        this.Telefono = "";
    }
    /**
    * Metodo que obtiene y retorna el contenido del Atributo Direccion
    * @return String
    */
    public String getDireccion() {
        return Direccion;
    }
    /**
    * Metodo que recibe un párametro de tipo String y se le Asigna a el atributo Direccion del objeto 
     * @param Direccion
    */  
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    /**
    * Metodo que obtiene y retorna el contenido del Atributo 
    * @return String
    */ 
    public String getTelefono() {
        return Telefono;
    }
    /**
    * Metodo que recibe un párametro de tipo String y se le Asigna a el atributo Telefono del objeto
     * @param Telefono
    */ 
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
   /**
   * Metodo que retorna el contenido del objeto Cliente
   * @return String
   */
    @Override
    public String toString() {
        return  "Cliente :\n" + super.toString() + "\nDireccion : " + Direccion + "\nTelefono : " + Telefono + "\n"; //super.ToString() Retorna los Datos Heredados
    }
    
    
    
    
}
