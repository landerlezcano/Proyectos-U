/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package presentación;

import lógica.Estudiante;

/**
 *
 * @author estudiant
 */
public class Formulario1 {
    
    public static void main (String args[]){
        Estudiante objEstudiante = new Estudiante();
        objEstudiante.setNombre("Yair");
        objEstudiante.setCodigo(2014157802);
        objEstudiante.setNotas((float)3.7, 0); // o (float)3.7
        objEstudiante.setNotas(Float.parseFloat("2.8"), 1);
        objEstudiante.setNotas(Float.parseFloat("4.2"), 2);
        System.out.println("Nombre del estudiante: "+objEstudiante.getNombre());
        System.out.println("Código del estudiante: "+objEstudiante.getCodigo());   
        System.out.println("Promedio del estudiante: "+objEstudiante.generarPromedio());
    }
    
}
