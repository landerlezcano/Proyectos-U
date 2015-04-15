/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package presentación;

import javax.swing.JOptionPane;
import lógica.Tiempo;

/**
 *
 * @author Yair Lopez Poveda <ylopezp@correo.udistrital.edu.co>
 */
public class Formulario3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tiempo obj1, obj2, objResult;
        obj1 = new Tiempo(10, 10, 10);        
        obj2 = new Tiempo(12, 50, 51);
        objResult = obj1.restarTiempo(obj2);
        JOptionPane.showMessageDialog(null, "Nueva hora Tiempo 1: "+obj1.getH()+":"+
        obj1.getM()+":"+obj1.getS());
        JOptionPane.showMessageDialog(null, "Nueva hora Tiempo 2: "+obj2.getH()+":"+
        obj2.getM()+":"+obj2.getS());
        JOptionPane.showMessageDialog(null, "Diferencia de tiempo: "+objResult.getH()+":"+
        objResult.getM()+":"+objResult.getS());
    }
    
}
