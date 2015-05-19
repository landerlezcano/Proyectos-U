/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lógica;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Yair Lopez Poveda <ylopezp@correo.udistrital.edu.co>
 */
public class Equipo {
    
    private String nombre;
    private ArrayList<Persona> listaIntegrantes;

    public Equipo() {
        listaIntegrantes = new ArrayList<>();
    }

    public Equipo(ArrayList listaIntegrantes) {
        this.listaIntegrantes = listaIntegrantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public ArrayList<Persona> getListaIntegrantes() {
        return listaIntegrantes;
    }

    public void setListaIntegrantes(ArrayList<Persona> listaIntegrantes) {
        this.listaIntegrantes = listaIntegrantes;
    }

    @Override
    public String toString() {
        String aux = "Nombre del equipo: "+nombre+"\n\n";
        Iterator auxIterator = listaIntegrantes.iterator();
        while(auxIterator.hasNext()){
            aux+=auxIterator.next().toString();
            aux+="\n";
        }
        return aux;
    }
    
    public String[] listaIntegrantes(){
        String[] aux = new String[listaIntegrantes.size()];
        for(int i=0;i<listaIntegrantes.size();i++){
            Persona foo = listaIntegrantes.get(i);
            aux[i]=foo.getNombre();
        }
        return aux;
    }
    
    public Object[] toObjArray(){
        return listaIntegrantes.toArray();
    }
}
