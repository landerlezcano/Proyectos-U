/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package presentacion;

import javax.swing.JOptionPane;
import logica.Tiempo;

/**
 *
 * @author estudiante
 */
public class Formulario {
    
    public static void main(String arg[]){
        Tiempo objTiempo=new Tiempo (0,0,0);
        objTiempo.sumarSegundo();
        JOptionPane.showMessageDialog(null,"Nueva Hora: "+objTiempo.getH()+" : "+objTiempo.getM()+" : "+objTiempo.getS());
    
    }
    
}
