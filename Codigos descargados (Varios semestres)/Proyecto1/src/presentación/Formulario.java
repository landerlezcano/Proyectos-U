/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package presentación;

import lógica.Persona;


/**
 * @author estudiante
 */
public class Formulario {
    
    
    public static void main(String args[]){
        Persona persona = new Persona(1997, 2, 27);
        persona.calcularEdad();
        System.out.println("La edad de la persona es: "+persona.getEdad());
        Persona persona1 = new Persona(1997, 2, 29);
        persona1.calcularEdad();
        System.out.println("La edad de la persona es: "+persona1.getEdad());
    } 
}
