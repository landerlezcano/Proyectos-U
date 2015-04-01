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
public class Formulario3 {
    
    public static void main (String args[]){
        Estudiante objEstudiante[] = new Estudiante[14];         //5 = num elementos del array
        float acumGeneral= 0;
        for(int i = 0;i< objEstudiante.length;i++){
            objEstudiante[i] = new Estudiante();
        }
        for(int i = 0;i< objEstudiante.length;i++){
            objEstudiante[i].setNombre("Yair"+i);
            objEstudiante[i].setCodigo(2014578);
            objEstudiante[i].setNotas((float)Math.random()*5, 0);
            objEstudiante[i].setNotas((float)Math.random()*5, 1);
            objEstudiante[i].setNotas((float)Math.random()*5, 2);
            acumGeneral+=objEstudiante[i].generarPromedio();
        }
        for(int i = 0;i< objEstudiante.length;i++){
            System.out.println("Nombre del estudiante: "+objEstudiante[i].getNombre());
            System.out.println("Código del estudiante: "+objEstudiante[i].getCodigo());   
            System.out.println("Promedio del estudiante: "+objEstudiante[i].generarPromedio()+"\n");
            System.out.println("Promedio general:" +(acumGeneral/objEstudiante.length));
        }
    }
}