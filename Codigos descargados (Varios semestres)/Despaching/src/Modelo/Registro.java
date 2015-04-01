/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Yair
 */
public class Registro {
    ArrayList<String> lista = new ArrayList<String>();

    public Registro() {
    }

    public ArrayList<String> getLista() {
        return lista;
    }

    public void setLista(ArrayList<String> lista) {
        this.lista = lista;
    }
    
    public void agregar(String str){
        lista.add(str);
    }  
    
    public int tamañoRegistro(){
        return lista.size();
    }
    
    public Boolean esVacia(){
        return lista.isEmpty();
    }
    
    public void borrarregistro(){
        lista.clear();
    }

    @Override
    public String toString() {
        String str = "";
        for(String aux:lista){
            str=str+aux+"\n";
        }
        return str; 
    }
    
    public String elementoEn(int i){
        return lista.get(i);
    } 
    
}
