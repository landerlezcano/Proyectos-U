/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Control;

import Modelo.InfoNombres;
import Vista.InOut;

/**
 *
 * @author Yair
 */
public class Ejecutar {
     public static void main(String[] args) {
       //creacion de objetos
        InfoNombres ob1=new InfoNombres();
        InOut ob2=new InOut();
        //llamado al metodo que realiza el proceso general
        ob1.inicioInfo();        
    }
}
