/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import Vista.InOut;

/**
 *
 * @author Estudiante
 */
public class Almacen {
    //atributos de la clase
    private int TV;
    
    //crea objeto para acceder a los metodos de la clase InOut
    InOut ob=new InOut();
    //constructor que inicializa los atributos
    public Almacen(){
        TV=0;
    }
//metodo que entrega la información del atributo
    public int getTV() {
        return TV;
    }

    // metodo que carga información al atributo
    public void setTV(int TV) {
        this.TV = TV;
    }
    
    // metodo que entrega el acumulado de sumar dos valores
    public int acumular(int d1, int d2){
        return d1+d2;
    }
    
    
    // metodo para validar que un dato sea mayor q cero
    public boolean validarDatos(int d){
        if(d>0)
            return true;
        else
            return false;
    }
    
    
    //metodo que multiplica dos datos
    public int multiplicar(int d1, int d2){
        return d1*d2;
    }
    
    
    //metodo que permite realizar compras por una persona hasta que lo desee
    public void comprar(){
        int pp,cp,tp;
         int r= ob.solicitarInfo("Desea comprar 1 sino 0");
         while(r==1){
            pp=ob.solicitarInfo("ingrese precio del producto");
            while(validarDatos(pp)==false){
               pp=ob.solicitarInfo("Error ingrese precio del producto correcto");  
            }
             cp=ob.solicitarInfo("ingrese la cantidad a comprar");
            while(validarDatos(cp)==false){
               cp=ob.solicitarInfo("Error ingrese cantidad coherente");  
            }
            tp= multiplicar(cp, pp);
            setTV(acumular(getTV(), tp));
          r= ob.solicitarInfo("Desea seguir comprando 1 sino 0");   
            
         }
    }
    
    //metodo que revisa si hay persona para comprar y llama el metodo que hace el proceso de compra
    public void recorrerPersona(){
       int r= ob.solicitarInfo("si llego persona 1 sino 0");
       while(r==1){
           comprar();
          r= ob.solicitarInfo("si llego otra persona 1 sino 0");  
       }
        
        
    }
    
    //metodo que permite recorrer una semana para realizar el proceso de venta
    public String recorrerDias(){
        for(int i=1; i<=7 ;i++){
            ob.mostrar("Día "+i);
            recorrerPersona();
        }
        return "El almacen vendio durante la semana "+getTV();
        
    }
    
    
    
}
