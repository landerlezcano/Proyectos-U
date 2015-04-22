/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;

/**
 *
 * @author Yair Lopez Poveda <ylopezp@correo.udistrital.edu.co>
 */
public class Historial {
    private ArrayList<Transacción> listaTransacción;

    public Historial(ArrayList<Transacción> listaTransacción) {
        this.listaTransacción = listaTransacción;
    }

    public Historial() {
        listaTransacción = new ArrayList<>();
    }
    
    public void añadirTransacción(Transacción obj){
        try{
            listaTransacción.add(obj);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public String[][] toStringArray(){
        int cont = 0;
        String[][] aux = new String[listaTransacción.size()][Transacción.getColumnCount()];
        for(Transacción aux1 : listaTransacción){
            aux[cont] = aux1.toVector();
            cont++;
        }
        return aux;
    }
    
}
