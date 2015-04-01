/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Matriz;
import Vista.InOut;

/**
 *
 * @author Yair
 */
public class Ejecutar {
    public static void main(String[] args) {
        Matriz ob1;
        InOut ob2 = new InOut();
        int columnas, filas;
        filas = ob2.solicitarNum("Ejercicio 7 de matrices.\n"
                    + "Ingrese el número de filas para la matriz:");
            while(Modelo.Matriz.validarDato(filas)==false){
                filas = ob2.solicitarNum("¡Error!\n"
                    + "Ingrese un tamaño válido de filas para el vector:");
            }
        columnas = ob2.solicitarNum("Ingrese el número de columnas para la matriz:");
            while(Modelo.Matriz.validarDato(columnas)==false){
                columnas = ob2.solicitarNum("¡Error!\n"
                    + "Ingrese un tamaño válido de columnas para el vector:");
            }
        ob1 = new Matriz(filas,columnas);
        ob1.cargarMatriz();
        ob1.transponerMatriz();
        ob1.mostrarInfo();
    }
}
