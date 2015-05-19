/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

/**
 * Clase que define el Objeto Electro
 * @author Sebastian Gil
 * @version 1.0
 */
public class Electro extends Producto{
    
    /**
     * Declaracion de Atributos
    */ 
    private double IvaElectro;
    
    /**Constructor Paramétrico
     * @param Codigo
     * @param Nombre
     * @param Cantidad
     * @param Valor_Unidad*/
    public Electro(String Codigo, String Nombre, int Cantidad, double Valor_Unidad) {
        super(Codigo, Nombre, Cantidad, Valor_Unidad);
        this.IvaElectro = 0.16;
    }
    /** Constructor Basico */
    public Electro() {
        super();
        this.IvaElectro = 0.16;//Define el valor del atributo IvaElectro
    }
    
    /**
    * Metodo que obtiene y retorna el contenido del Atributo IvaElectro
    * @return Double
    */
    public double getIvaElectro() {
        return IvaElectro;
    }
    
    /**
    * Metodo que recibe un Parametro y se le Asigna a el atributo IvaElectro del objeto
     * @param IvaElectro
    */ 
    public void setIvaElectro(double IvaElectro) {
        this.IvaElectro = IvaElectro;
    }
    /**
    * Metodo que retorna el contenido del objeto Electro
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
        return this.getIvaElectro() * this.SubT();
    }
    
    
    
}
