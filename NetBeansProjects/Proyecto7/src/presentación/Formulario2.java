/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package presentación;

import javax.swing.JOptionPane;
import lógica.Estudiante;

/**
 *
 * @author estudiant
 */
public class Formulario2 {
    
    public static void main (String args[]){
        Estudiante objEstudiante = new Estudiante();
        objEstudiante.setNombre(JOptionPane.showInputDialog(null, "Meta el nombre:"));
        objEstudiante.setCodigo(Long.parseLong(JOptionPane.showInputDialog(null, "Meta el código:")));
        for(int i=0;i<3;i++){
            objEstudiante.setNotas(Float.parseFloat(JOptionPane.showInputDialog(null, "Meta la nota:")),i);
        
        }
        JOptionPane.showMessageDialog(null, "El promedio es: "+objEstudiante.generarPromedio());
        
    }
}
