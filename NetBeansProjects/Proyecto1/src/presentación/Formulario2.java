/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package presentación;

import javax.swing.JOptionPane;
import lógica.Persona;

/**
 *
 * @author Yair Lopez Poveda <ylopezp@correo.udistrital.edu.co>
 */
public class Formulario2 {
        public static void main(String args[]){
            Persona persona = new Persona();
            persona.setAñoNac(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de nacimiento:")));
            persona.setMesNac(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de nacimiento:")));
            persona.setDíaNac(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día de nacimiento:")));
            persona.calcularEdad();
            if(persona.mayorEdad()){
                JOptionPane.showMessageDialog(null, "La persona es mayor de edad y tiene "+persona.getEdad()+" años.");
            }else{
                JOptionPane.showMessageDialog(null, "La persona es menor de edad y tiene "+persona.getEdad()+" años.");

            }
        }
}
               