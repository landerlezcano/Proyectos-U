/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

/**
 * Clase que define el Objeto Producto
 * @author Sebastian Gil
 * @version 1.0
 */
public abstract class Producto {
    
    protected String Codigo,Nombre;
    protected int Cantidad;
    protected double Valor_Unidad;

    /**
     * Constructor Párametrico
     * @param Codigo
     * @param Nombre
     * @param Cantidad
     * @param Valor_Unidad
     */
    public Producto(String Codigo, String Nombre, int Cantidad, double Valor_Unidad) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Cantidad = Cantidad;
        this.Valor_Unidad = Valor_Unidad;
    }
    
    /**
     * Constructor Básico
     */
    public Producto() {
        this.Codigo = "";
        this.Nombre = "";
        this.Cantidad = 0;
        this.Valor_Unidad = 0;
    }

    /**
     * Metodo que obtiene y retorna el contenido del Atributo Codigo
     * @return
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
     * Metodo que obtiene y retorna el contenido del Atributo Cantidad
     * @return
     */
    public int getCantidad() {
        return Cantidad;
    }

    /**
     * Metodo que recibe un párametro y se le Asigna a el atributo Cantidad del objeto 
     * @param Cantidad
     */
    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    /**
     * Metodo que obtiene y retorna el contenido del Atributo Valor_Unidad
     * @return
     */
    public double getValor_Unidad() {
        return Valor_Unidad;
    }

    /**
     * Metodo que recibe un párametro y se le Asigna a el atributo Valor_Unidad del objeto 
     * @param Valor_Unidad
     */
    public void setValor_Unidad(double Valor_Unidad) {
        this.Valor_Unidad = Valor_Unidad;
    }
    
//    public double SubTotal(){
//        double SubT = 0;
//        
//        SubT = this.getCantidad() * this.getValor_Unidad();
//        
//        return SubT;
//    }
    
    public abstract double SubT();
    public abstract double IvaP();
    
/**
* Metodo que retorna el contenido del objeto Producto
* @return String
*/
    @Override
    public String toString() {
        return "\nCodigo : " + Codigo + " --- Nombre : " + Nombre + " --- Cantidad = " + Cantidad + " --- Valor_Unidad = " + Valor_Unidad;
    }
    
    
    
}
