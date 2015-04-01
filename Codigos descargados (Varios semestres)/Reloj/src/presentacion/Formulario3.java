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
public class Formulario3 {
    public static void main(String arg[]){
    Tiempo obj1, obj2,objR;
    obj1=new Tiempo(10,10,10);
    obj2=new Tiempo(12,50,51);
    objR=new Tiempo();
    
    objR=obj2.restarTiempo(obj1);
    
    
    JOptionPane.showMessageDialog(null, "Tiempo 1 es "+obj1.getH()+" : "+obj1.getM()+" : "+obj1.getS());
    JOptionPane.showMessageDialog(null, "Tiempo 2 es "+obj2.getH()+" : "+obj2.getM()+" : "+obj2.getS());
    JOptionPane.showMessageDialog(null, "Resultado: "+objR.getH()+" : "+objR.getM()+" : "+objR.getS());
    }
    
}
