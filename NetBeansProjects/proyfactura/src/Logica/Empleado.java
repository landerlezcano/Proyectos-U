/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

/**
 * Clase que define el Objeto Empleado
 * @author Sebastian Gil
 * @version 1.0 
 */
public class Empleado extends Persona {
    /**
     * Declaracion de Atributos
    */ 
    private String Codigo;

    /**
     * Constructor Párametrico
     * @param Codigo
     * @param Nombre
     * @param ID
     */
    public Empleado(String Codigo, String Nombre, String ID) {
        super(Nombre, ID);
        this.Codigo = Codigo;
    }
    
    /**
     * Constructor Básico
     */
    public Empleado() {
        super();
        this.Codigo = "";
    }

    /**
     * Metodo que obtiene y retorna el contenido del Atributo Codigo
     * @return String
     */
    public String getCodigo() {
        return Codigo;
    }

    /**
     * Metodo que recibe un párametro y se le Asigna a el atributo Codigo del objeto 
     * @param Codigo
     */
    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
/**
* Metodo que retorna el contenido del objeto Empleado
* @return String
*/
    @Override
    public String toString() {
        return  super.toString() + "\nCodigo = " + Codigo + "\n";//super.ToString() Retorna los Datos Heredados
    }
    
    
    
    
    
}
