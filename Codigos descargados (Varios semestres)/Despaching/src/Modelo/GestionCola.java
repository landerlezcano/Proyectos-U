/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.AbstractQueue;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Yair
 */
public class GestionCola {
        Queue<Operacion> Cola ;
        private int numElementos;

    public GestionCola() {
        this.Cola = new LinkedList<Operacion>();
        this.numElementos = Cola.size();
    }

    @Override
    public String toString() {
        String tmpstr="";
        Queue<Operacion> aux = new LinkedList<Operacion>(Cola);
        while(!aux.isEmpty()){
            Operacion tmp=aux.poll();
            tmpstr=tmpstr+tmp.toString()+"\n";
        }
        return tmpstr;
    }
    
    public void agregarOperacion(Operacion tmp){
        Cola.add(tmp);
    }
    
    public Operacion borrarOperacion(){
        Operacion tmp = Cola.poll();
        return tmp;
    }
    
    public Boolean esVacia(){
        return Cola.isEmpty();
    }
    
        
        
}
