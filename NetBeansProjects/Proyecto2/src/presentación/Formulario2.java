/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package presentación;

import javax.swing.JOptionPane;
import logica.Fibonacci;

/**
 *
 * @author estudiante
 */
public class Formulario2 {

    public static void main(String[] args) {
        Fibonacci objFibo = new Fibonacci();
        objFibo.setN(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número: ")));
        JOptionPane.showMessageDialog(null, objFibo.generarSerie());
    }
    
}
