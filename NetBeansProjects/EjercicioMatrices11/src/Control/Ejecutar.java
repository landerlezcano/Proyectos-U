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
        int columnas1, columnas2, filas1, filas2;
        ob2.mostrar("Ejercicio 11 de matrices.\n"
                    + "Multiplicación de matrices.");
        do{
            filas1 = ob2.solicitarNum("Ingrese el número de filas para la matriz 1:");
            while(Modelo.Matriz.validarDato(filas1)==false){
                filas1 = ob2.solicitarNum("¡Error!\n"
                    + "Ingrese un tamaño válido de filas para la matriz 1:");
            }
            columnas1 = ob2.solicitarNum("Ingrese el número de columnas para la matriz 1:");
            while(Modelo.Matriz.validarDato(columnas1)==false){
                columnas1 = ob2.solicitarNum("¡Error!\n"
                    + "Ingrese un tamaño válido de columnas para la matriz 1:");
            }
            filas2 = ob2.solicitarNum("Ingrese el número de filas para la matriz 1:");
            while(Modelo.Matriz.validarDato(filas2)==false){
                filas2 = ob2.solicitarNum("¡Error!\n"
                    + "Ingrese un tamaño válido de filas para la matriz 1:");
            }
            columnas2 = ob2.solicitarNum("Ingrese el número de columnas para la matriz 1:");
            while(Modelo.Matriz.validarDato(columnas2)==false){
                columnas2 = ob2.solicitarNum("¡Error!\n"
                    + "Ingrese un tamaño válido de columnas para la matriz 1:");
            }
        }while(columnas1 != filas2);
        ob1 = new Matriz(filas1,columnas1,filas2,columnas2);
        ob1.cargarMatriz(ob1.getMatriz1(), filas1, columnas1);
        ob1.cargarMatriz(ob1.getMatriz2(), filas2, columnas2);
        ob1.multiplicarMatrices(ob1.getMatriz1(), ob1.getMatriz2());
        ob1.mostrarInfo();
    }
}
