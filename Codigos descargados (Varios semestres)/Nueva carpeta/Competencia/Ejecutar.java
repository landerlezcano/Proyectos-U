/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Modelo.Competencia;
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
        int numPersonas, numPruebas;
        numPersonas = ob1.solicitarNum("Selección - Prueba de patinaje\n"
                + "Ingrese el número de participantes a competir:");
        while(Modelo.Competencia.validarDato(numPersonas)==false){
            numPersonas = ob1.solicitarNum("¡Error!\n"
                + "Ingrese un número válido de participantes:");
        }
        numPruebas = ob1.solicitarNum("Selección - Prueba de patinaje\n"
                + "Ingrese el número de pruebas a realizar en la competición:");
        while(Modelo.Competencia.validarDato(numPruebas)==false){
            numPruebas = ob1.solicitarNum("¡Error!\n"
                + "Ingrese un número válido de pruebas:");
        }
        Competencia ob2 = new Competencia(numPersonas,numPruebas);
        ob2.cargarDatos();
        ob2.mostrarDatos();
        ob2.mostrarSeleccionados();
    }
}
