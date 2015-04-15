/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Control;

import Modelo.Ancianato;
import Vista.InOut;

/**
 *
 * @author Yair
 */
public class Ejecutar {
     public static void main(String[] args) {
       //creacion de objetos
        Ancianato ob1=new Ancianato();
        InOut ob2=new InOut();
        //llamado al metodo que realiza el proceso general
        ob1.ejecutarMenu();        
    }
}
