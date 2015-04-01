/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Vista.InOut;
import Modelo.Palabra;
/**
 *
 * @author Yair
 */
    public class Ejecutar {
        
        public static void main(String[] args) {
            Palabra ob1;
            InOut ob2 = new InOut();
            String vector = ob2.solicitarStr("Ejercicio - Vector de palabras \n\n"
                    + "Ingrese un vector con cinco (5) palabras separadas por espacios:");
            while(Palabra.validarStr(vector)==false || Palabra.validarVector(vector)==false){
                vector = ob2.solicitarStr("¡ERROR! \n\n"
                    + "Ingrese un vector con cinco (5) palabras separadas por espacios:");
            }
            ob1 = new Palabra(vector);
            ob1.cargarVocales();
            ob1.cargarConsonantes();
            ob1.formarpalabra();            
        }
}
