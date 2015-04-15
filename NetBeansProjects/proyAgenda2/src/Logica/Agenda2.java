/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class Agenda2 {
    ArrayList <Contacto> Arr;

    public Agenda2(ArrayList<Contacto> Arr) {
        this.Arr = Arr;
    }
     public Agenda2() {
        this.Arr = new <Contacto>ArrayList();
    }

    public ArrayList<Contacto> getArr() {
        return Arr;
    }

    public void setArr(ArrayList<Contacto> Arr) {
        this.Arr = Arr;
    }


    @Override
    public String toString() {
        
       String datos="";
       for(int i=0;i<this.Arr.size();i++)
       {
       datos+= this.Arr.get(i).toString();
       }
        return datos;
        
    }
    
}
