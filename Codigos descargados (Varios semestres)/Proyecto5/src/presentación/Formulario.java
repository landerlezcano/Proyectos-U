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
public class Formulario {
    
    public static void main(String[] args){
        Tiempo objTiempo = new Tiempo(23,59,59);
        objTiempo.sumarSegundo();
        objTiempo.restarTiempo();
        JOptionPane.showMessageDialog(null, "Nueva hora: "+objTiempo.getH()+":"+
        objTiempo.getM()+":"+objTiempo.getS());
    }
}
