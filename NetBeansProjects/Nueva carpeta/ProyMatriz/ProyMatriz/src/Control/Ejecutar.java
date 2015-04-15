/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.ProMatriz;
import Vista.InOut;

/**
 *
 * @author Estudiante
 */
public class Ejecutar {

    public static void main(String[] args) {
        InOut ob=new InOut();
        int f=ob.solicitar("Ingrese numero de filas de la matriz ");
         int c=ob.solicitar("Ingrese numero de columnas de la matriz ");
        ProMatriz obj=new ProMatriz(f, c);
        obj.cargarM();
        //obj.mostrarM();
        //obj.DiagonalM();
        obj.LetraO();
        obj.mostrarM();
        
    }
}
