/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package presentación;

import java.util.ArrayList;
import lógica.Estudiante;

/**
 *
 * @author estudiant
 */
public class Formulario4 {
    
    public static void main (String args[]){
        int num = 32;
        ArrayList<Estudiante> objEstudiante = new ArrayList<>();    
        float acumGeneral= 0;
        for(int i = 0;i<num;i++){
            objEstudiante.add(new Estudiante());
        }
        for(int i = 0;i< objEstudiante.size();i++){
            objEstudiante.get(i).setNombre("Yair"+i);
            objEstudiante.get(i).setCodigo(2014578);
            objEstudiante.get(i).setNotas((float)Math.random()*5, 0);
            objEstudiante.get(i).setNotas((float)Math.random()*5, 1);
            objEstudiante.get(i).setNotas((float)Math.random()*5, 2);
            acumGeneral+=objEstudiante.get(i).generarPromedio();
        }
        for(int i = 0;i< objEstudiante.size();i++){
            System.out.println("Nombre del estudiante: "+objEstudiante.get(i).getNombre());
            System.out.println("Código del estudiante: "+objEstudiante.get(i).getCodigo());   
            System.out.println("Promedio del estudiante: "+objEstudiante.get(i).generarPromedio()+"\n");
        }
        System.out.println("Promedio general:" +(acumGeneral/objEstudiante.size()));
    }
}
