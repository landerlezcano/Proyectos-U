/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

/**
 *
 * @author USUARIO
 */
public class Arreglo {
    private Contacto objC[];

    public Arreglo(Contacto[] objC) {
        this.objC = objC;
    }
    
    public Arreglo() {
        this.objC = new Contacto[2];
        for (int i=0 ; i<objC.length; i++){
            this.objC[i]= new Contacto();
        }
    }

    public Contacto[] getObjC() {
        return objC;
    }

    public void setObjC(Contacto[] objC) {
        this.objC = objC;
    }
    
    public void setDatoC(int pos, int valor) {
        this.objC[pos].setValor(valor);
    }
    
    public int getId() {
        int id;
        id=this.getId();
        return id;
    }

    @Override
    public String toString() {
        String datos="";
        for (int i=0 ; i<objC.length; i++){
            datos+=this.objC[i].toString()+"\n";
        }
        return "Datos De la Agenda"+datos;
    }
    
    
}
