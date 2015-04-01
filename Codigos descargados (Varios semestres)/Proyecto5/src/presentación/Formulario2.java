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
 * @author estudiante
 */
public class Formulario2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tiempo objTiempo1 = new Tiempo();
        Tiempo objTiempo2 = new Tiempo();

        objTiempo1.setH(Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Ingrese la hora para el tiempo 1")));
        objTiempo1.setM(Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Ingrese el minuto para el tiempo 1")));
        objTiempo1.setS(Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Ingrese el segundo para el tiempo 1")));
        objTiempo1.sumarSegundo();
        objTiempo1.restarTiempo();
        objTiempo2.setH(Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Ingrese la hora para el tiempo 2")));
        objTiempo2.setM(Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Ingrese el minuto para el tiempo 2")));
        objTiempo2.setS(Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Ingrese el segundo para el tiempo 2")));
        objTiempo2.sumarSegundo();
        objTiempo2.restarTiempo();
        JOptionPane.showMessageDialog(null, "Nueva hora Tiempo 1: "+objTiempo1.getH()+":"+
        objTiempo1.getM()+":"+objTiempo1.getS());
        JOptionPane.showMessageDialog(null, "Nueva hora Tiempo 2: "+objTiempo2.getH()+":"+
        objTiempo2.getM()+":"+objTiempo2.getS());
    }
    
}
