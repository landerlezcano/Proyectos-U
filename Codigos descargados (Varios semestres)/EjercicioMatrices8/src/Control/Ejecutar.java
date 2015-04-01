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
        Frase ob1;
        String tmp;
        InOut ob2 = new InOut();
        tmp = ob2.solicitarStr("Ejercicio 8 de matrices.\n"
                    + "Ingrese una frase:");
            while(Modelo.Frase.validarStr(tmp)==false){
                tmp = ob2.solicitarStr("¡Error!\n"
                    + "Ingrese una frase válida:");
        }
        ob1 = new Frase(tmp);
        ob1.mostrarInfo();
    }
}
