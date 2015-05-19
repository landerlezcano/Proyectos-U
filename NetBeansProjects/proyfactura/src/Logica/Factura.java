/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import java.util.ArrayList;

/**
 * Clase que define el Objeto Factura
 * @author Sebastian Gil
 * @version 1.0
 */
public class Factura {
    /**
     * Declaracion de Atributos
    */ 
    private String CodigoF,TipoPago;
    public ArrayList<Viveres> ListaViveres; //Declara un ArrayList de Tipo Viveres llamado ListaViveres
    public ArrayList<Electro> ListaElectro;//Declara un ArrayList de Tipo Electro llamado ListaViveres
    private Cliente ObjC;//Declara un Objeto ObjC de Tipo Cliente
    private Empleado ObjE;//Declara un Objeto ObjE de Tipo Empleado

    /**
     * Constructor Párametrico
     * @param CodigoF
     * @param TipoPago
     * @param ListaViveres
     * @param ListaElectro
     * @param ObjC
     * @param ObjE
     */
    public Factura(String CodigoF, String TipoPago, ArrayList<Viveres> ListaViveres, ArrayList<Electro> ListaElectro, Cliente ObjC, Empleado ObjE) {
        this.CodigoF = CodigoF;
        this.TipoPago = TipoPago;
        this.ListaViveres = ListaViveres;
        this.ListaElectro = ListaElectro;
        this.ObjC = ObjC;
        this.ObjE = ObjE;
    }
    
    
    
    /**
     * Constructor Básico
     */
    public Factura() {
        this.CodigoF = "";
        this.TipoPago = "";
        this.ListaViveres = new ArrayList();
        this.ListaElectro = new ArrayList();
        this.ObjC = new Cliente();
        this.ObjE = new Empleado();
    }

    /**
     * Metodo que obtiene y retorna el contenido del Atributo CodigoF
     * @return String
     */
    public String getCodigoF() {
        return CodigoF;
    }

    /**
     * Metodo que recibe un párametro y se le Asigna a el atributo CodigoF del objeto
     * @param CodigoF
     */
    public void setCodigoF(String CodigoF) {
        this.CodigoF = CodigoF;
    }

    /**
     * Metodo que obtiene y retorna el contenido del Atributo TipoPago
     * @return String
     */
    public String getTipoPago() {
        return TipoPago;
    }

    /**
     * Metodo que recibe un párametro y se le Asigna a el atributo TipoPago del objeto
     * @param TipoPago
     */
    public void setTipoPago(String TipoPago) {
        this.TipoPago = TipoPago;
    }

    /**
     * Metodo que obtiene y retorna el contenido del Atributo ListaViveres
     * @return ArrayList
     */
    public ArrayList<Viveres> getListaViveres() {
        return ListaViveres;
    }

    /**
     * Metodo que recibe un ArrayList de párametro y se le Asigna a el atributo ListaViveres del objeto
     * @param ListaViveres
     */
    public void setListaViveres(ArrayList<Viveres> ListaViveres) {
        this.ListaViveres = ListaViveres;
    }

    /**
     * Metodo que obtiene y retorna el contenido del Atributo ListaElectro
     * @return ArrayList
     */
    public ArrayList<Electro> getListaElectro() {
        return ListaElectro;
    }

    /**
     * Metodo que recibe un ArrayList por párametro y se le Asigna a el atributo ListaElectro del objeto
     * @param ListaElectro
     */
    public void setListaElectro(ArrayList<Electro> ListaElectro) {
        this.ListaElectro = ListaElectro;
    }

    /**
     * Metodo que obtiene y retorna el contenido del Objeto ObjC
     * @return Cliente
     */
    public Cliente getObjC() {
        return ObjC;
    }

    /**
     * Metodo que recibe un Objeto por párametro y se le Asigna a el Objeto ObjC del objeto Factura
     * @param ObjC
     */
    public void setObjC(Cliente ObjC) {
        this.ObjC = ObjC;
    }

    /**
     * Metodo que obtiene y retorna el contenido del Objeto ObjE
     * @return Empleado
     */
    public Empleado getObjE() {
        return ObjE;
    }

    /**
     * Metodo que recibe un Objeto por párametro y se le Asigna a el Objeto ObjE del objeto Factura
     * @param ObjE
     */
    public void setObjE(Empleado ObjE) {
        this.ObjE = ObjE;
    }
    

    /**
     * Metodo que Recibe dos ArrayList por párametros.
     * Este Metodo se encarga de recorrer los dos ArrayList y Multiplicar El Atributo Valor_Unidad con el Atributo Cantidad.
     * Luego los va Sumando para Obtener el Subtotal
     * @param LElectro
     * @param LViveres
     * @return double
     */
    public double SubTotal(){
        
        double Sum = 0;
        for(int i = 0 ; i < this.ListaElectro.size(); i++){
            
            Sum = Sum + (this.ListaElectro.get(i).getCantidad() * this.ListaElectro.get(i).getValor_Unidad());
        }
        
        for(int i = 0 ; i < this.ListaViveres.size() ; i++){
            Sum = Sum + (this.ListaViveres.get(i).getCantidad() * this.ListaViveres.get(i).getValor_Unidad());
        }
        
        return Sum;
    }
    
    /**
     *Metodo que Recibe dos  ArrayList por párametros.
     * Este Metodo se encarga de recorrer los dos ArrayList y Multiplicar El Atributo Valor_Unidad con el Atributo Cantidad.
     * Despues de esto, los multiplica por el valor de iva correspondiente  Luego los va Sumando para Obtener el Valor de Iva
     * @param LElectro
     * @param LViveres
     * @return double
     */
    public double Valor_IVA(){
        
        double IvaT = 0;
        
        for(int i = 0 ; i < this.ListaElectro.size() ; i++){
            IvaT = IvaT + ((this.ListaElectro.get(i).getCantidad() * this.ListaElectro.get(i).getValor_Unidad()) * 0.16);
        }
        
        for(int i = 0 ; i < this.ListaViveres.size() ; i++){
            IvaT = IvaT + ((this.ListaViveres.get(i).getCantidad() * this.ListaViveres.get(i).getValor_Unidad()) * 0.10);
        }
        
        return IvaT;
    }
    
    /**
     * Metodo que recibe dos datos de tipo String, Con los cuales se Calculara el valor total a pagar
     * @param Iva
     * @param SubT
     * @return double
     */
    public double Total_Pagar(){
        
        double I = this.Valor_IVA();//Convierte el dato de tipo String reicbido por parametro en un Tipo de dato Double
        double S = this.SubTotal();//Convierte el dato de tipo String reicbido por parametro en un Tipo de dato Double
        
        double Total = I + S ;
        return Total;
    }
    
    public void AddE(Electro E){

        this.ListaElectro.add(E);
    }
    
    public void AddV(Viveres V){
        this.ListaViveres.add(V);
    }

    /**
    * Metodo que retorna el contenido del objeto Factura
    * @return String
    */
    @Override
    public String toString() {
        
        String Datos = ObjC.toString()  +"\nTipo de Pago = " + TipoPago + "\n\n"; //Crea una Cadena Con los Datos del Objeto Factura
        
        if(ListaViveres.size() > 0){ //Condicional que verifica el tamaño de la Lista
            Datos+= "\nLista Viveres : \n";//Agrega una Cadena a la Cadena Datos
            
            for(int i = 0 ; i < ListaViveres.size() ; i++){ //Ciclo que permite agregar todos los Datos que tenga la Lista a la cadena "Datos"
            Datos+= this.ListaViveres.get(i).toString();
        }
        }
        
        if(ListaElectro.size() > 0){//Condicional que verifica el tamaño de la Lista
            Datos+= "\n\nLista Electrodomesticos : \n";//Agrega una Cadena a la Cadena Datos
            
            for(int i = 0 ; i < ListaElectro.size() ; i++){//Ciclo que permite agregar todos los Datos que tenga la Lista a la cadena "Datos"
            Datos+= this.ListaElectro.get(i).toString();
        }
        }
        
        Datos+= "\n\nSubtotal = "+ this.SubTotal() + "\nIva = " + this.Valor_IVA() + "\nTotal a Pagar = " + this.Total_Pagar()  +"\n\nAtendido Por : \n" + ObjE.toString();
        
        return Datos;
    }
    
    
    
    
    
    
}
