/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.AdmonSalones;
import Vista.InOut;

/**
 *
 * @author Yair
 */
    public class Ejecutar {

        public static void main(String[] args) {
            
            InOut ob1 = new InOut();
            AdmonSalones ob2;
            int numSalones;
            ob1.mostrar("Parcial - administración de salones\n Yair Lopez Poveda"
                    + " Código: 20141578024");
            numSalones = ob1.solicitarNum("Ingrese el número de salones por piso:");
            while(Modelo.AdmonSalones.validarDato(numSalones)==false){
                numSalones = ob1.solicitarNum("¡Error!\n"
                    + "Ingrese un tamaño válido de filas para la matriz 1:");
            }
            ob2 = new AdmonSalones(numSalones);
            ob2.inicializarValores();
            ob2.ejecutarMenu();
            
        }
    }
