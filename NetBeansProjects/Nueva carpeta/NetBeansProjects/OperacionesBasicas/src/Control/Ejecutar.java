/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.OperacionMatriz;
import Vista.InOut;

/**
 *
 * @author Yair
 */
public class Ejecutar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InOut ob1 = new InOut();
        int tam = ob1.solicitarNum("Operaciones básicas de vectores\n"
                + "Ingrese un tamaño para el vector:");
        while(Modelo.OperacionMatriz.validadDato(tam)==false){
            tam = ob1.solicitarNum("¡Error!\n"
                + "Ingrese un tamaño válido para el vector:");
        }
        OperacionMatriz ob2 = new OperacionMatriz(tam);
        ob2.cargarMatriz();
        ob2.ejecutarMenu();
    }
    
}
