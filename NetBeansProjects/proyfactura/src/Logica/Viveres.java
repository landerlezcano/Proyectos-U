/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

/**
 * Clase que define el Objeto Viveres
 * @author Sebastian Gil
 * @version 1.0
 */
public class Viveres extends Producto {
    /**
    * Declaracion de Atributos
    */
    private double IvaViveres;

    /**
     * Constructo Párametrico
     * @param Codigo
     * @param Nombre
     * @param Cantidad
     * @param Valor_Unidad
     */
    public Viveres(String Codigo, String Nombre, int Cantidad, double Valor_Unidad) {
        super(Codigo, Nombre, Cantidad, Valor_Unidad);
        this.IvaViveres = 0.10;
    }
    
    /**
     *Constructor Básico
     */
    public Viveres() {
        super();
        this.IvaViveres = 0.10;
    }

    /**
     *Metodo que obtiene y retorna el contenido del Atributo IvaViveres
     * @return Double
     */
    public double getIvaViveres() {
        return IvaViveres;
    }

    /**
     * Metodo que recibe un párametro y se le Asigna a el atributo IvaViveres del objeto
     * @param IvaViveres
     */
    public void setIvaViveres(double IvaViveres) {
        this.IvaViveres = IvaViveres;
    }
/**
* Metodo que retorna el contenido del objeto Viveres
* @return String
*/
    @Override
    public String toString() {
        return super.toString();//super.ToString() Retorna los Datos Heredados
    }

    @Override
    public double SubT() {
        return this.getCantidad() * this.getValor_Unidad();
    }

    @Override
    public double IvaP() {
        return this.getIvaViveres() * this.SubT();
    }
    
    
    
}
