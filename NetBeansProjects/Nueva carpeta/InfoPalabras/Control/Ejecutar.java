package Control;
import Vista.InOut;
import Modelo.Palabra;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        Palabra ob2 = new Palabra();
        String str;
        do{
            str = ob1.solicitarStr("Información de una palabra\nIngrese una palabra:");
            str = str.trim();
        }while(ob2.validarPalabra(str)==false);
        ob2.asignarPalabra(str);
        ob2.esPalindromo();
        ob2.numVocalA();
    }
    
}
