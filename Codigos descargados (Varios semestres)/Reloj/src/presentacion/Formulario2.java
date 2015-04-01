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
public class Formulario2 {
    public static void main(String arg[]){
    Tiempo obj1, obj2;
    obj1=new Tiempo();
    obj2=new Tiempo();
    
    obj1.setH(Integer.parseInt(JOptionPane.showInputDialog("Digite Hora para Tiempo 1")));
    obj1.setM(Integer.parseInt(JOptionPane.showInputDialog("Digite Minuto para Tiempo 1")));
    obj1.setS(Integer.parseInt(JOptionPane.showInputDialog("Digite Segundo para Tiempo 1")));
    
    obj2.setH(Integer.parseInt(JOptionPane.showInputDialog("Digite Hora para Tiempo 2")));
    obj2.setM(Integer.parseInt(JOptionPane.showInputDialog("Digite Minuto para Tiempo 2")));
    obj2.setS(Integer.parseInt(JOptionPane.showInputDialog("Digite Segundo para Tiempo 2")));
    
    obj1.sumarSegundo();
    obj2.sumarSegundo();
    
    JOptionPane.showMessageDialog(null, "Ahora el Tiempo 1 es "+obj1.getH()+" : "+obj1.getM()+" : "+obj1.getS());
    JOptionPane.showMessageDialog(null, "Ahora el Tiempo 2 es "+obj2.getH()+" : "+obj2.getM()+" : "+obj2.getS());
    }
    
    
}
