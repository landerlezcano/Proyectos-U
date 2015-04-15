/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

/**
 *
 * @author estudiante
 */
public class Agenda {
    private Contacto Arr[];

    public Agenda(Contacto[] Arr) {
        this.Arr = Arr;
    }
    
    public Agenda() {
        this.Arr = new Contacto[3];
        for (int i=0 ; i<Arr.length; i++)
        {
            this.Arr[i]= new Contacto();
        }
    }

    public Contacto[] getArr() {
        return Arr;
    }

    public void setArr(Contacto[] Arr) {
        this.Arr = Arr;
    }

    @Override
    public String toString() {
        String datos="";
        for (int i=0 ; i<Arr.length; i++){
            datos+=this.Arr[i].toString()+"\n";
        }
        return "Datos De la Agenda"+datos;
    }
    
    
}
