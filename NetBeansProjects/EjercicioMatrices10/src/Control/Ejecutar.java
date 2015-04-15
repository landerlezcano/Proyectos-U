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
        ob2.mostrar("Ejercicio 10 de matrices.\n"
                    + "A continuación ingrese una matriz cubo (3x3).");
        
        ob1 = new Matriz(3,3);
        ob1.llenarMatriz(0);
        ob1.cargarMatriz();
        ob1.sumatoriaFilas();
        ob1.sumatoriaColumnas();
        ob1.mostrarInfo();
    }
}
