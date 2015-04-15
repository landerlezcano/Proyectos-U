/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class InOut {
    public int solicitar(String m){
     int d=  Integer.parseInt(JOptionPane.showInputDialog(m));
     return d;
    }
    
    public void mostrar(String r){
        JOptionPane.showMessageDialog(null,r);
    }
    
    
}
