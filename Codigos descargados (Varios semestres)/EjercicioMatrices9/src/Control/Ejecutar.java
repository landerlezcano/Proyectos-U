/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Control;

import Modelo.Frase;
import Vista.InOut;

/**
 *
 * @author Yair
 */
public class Ejecutar {
     public static void main(String[] args) {
       //creacion de objetos
        Frase ob1=new Frase();
        InOut ob2=new InOut();
        ob2.mostrar("Ejercicio 9 de matrices.\n"
                    + "Frase y longitud de sus palabras.");
        //llamado al metodo que realiza el proceso general
        ob1.inicioInfo();        
    }
}
